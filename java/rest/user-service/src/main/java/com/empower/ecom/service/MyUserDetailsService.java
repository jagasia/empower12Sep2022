package com.empower.ecom.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.empower.ecom.entity.MyUser;
import com.empower.ecom.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService
{
	@Autowired
	private UserRepository ur;

	@Override
	public MyUser loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<MyUser> temp = ur.findById(username);
		MyUser user=null;
		if(temp.isPresent())
		{
			//success
			user=temp.get();
			System.out.println(user);
		}
		System.out.println(user);
		return user;
		
//		return new User("raja", "raja", new ArrayList<>());
	}
	
	public MyUser create(MyUser user)
	{
		return ur.save(user);
	}

}
