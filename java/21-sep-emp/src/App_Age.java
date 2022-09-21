import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class App_Age {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date of Birth: (dd-MMM-yyyy)");
		String input=sc.nextLine();
		Date dob=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
		dob=sdf.parse(input);
//		System.out.println(dob);
		
		//how to find the age?
		LocalDate ld1=new java.sql.Date(dob.getTime()).toLocalDate();
		
		LocalDate today=LocalDate.now();
		
		Period result = Period.between(ld1, today);
		System.out.println("You are "+result.getYears()+" years, "+result.getMonths()+" months, "+result.getDays()+" days old!");
		
	}

}
