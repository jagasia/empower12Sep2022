package com.empower.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.empower.ecom.Response;
import com.empower.ecom.entity.AuthRequest;
import com.empower.ecom.entity.MyUser;
import com.empower.ecom.service.MyUserDetailsService;
import com.empower.ecom.util.JwtUtil;

@RestController
@CrossOrigin(origins = {"http://localhost:4200","*"})
public class UserController {
	@Autowired
	private MyUserDetailsService us;

	@Autowired
	private JwtUtil jwtUtil;

	@PostMapping("/login")
	public Response validateLogin(@RequestBody AuthRequest authRequest)
	{
		MyUser user = us.loadUserByUsername(authRequest.getUsername());
		Response response=null;
		if(user!=null)
		{
			if(user.getPassword().equals(authRequest.getPassword()))
			{//success
				String token = jwtUtil.generateToken(user.getUsername());
				response=new Response();
				response.setJwt(token);
			}
		}
		return response;
	}
	
	@PostMapping("/signup")
	public MyUser signup(@RequestBody MyUser user)
	{
		return us.create(user);
	}
}
