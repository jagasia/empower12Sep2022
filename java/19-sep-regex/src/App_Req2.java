import java.util.Scanner;

public class App_Req2 {

	static Boolean validateMobileNumber(String mobileNumber)
	{		
		return mobileNumber.matches("([+]91){1}[1-9]{1}[0-9]{9}");
	}
	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Mobile number to be validated:");
		String mobileNumber=sc.next();
		if(validateMobileNumber(mobileNumber))
		{
			System.out.println("Mobile number is valid");
		}else
		{
			System.out.println("Mobile number is invalid");
		}
	}

}
