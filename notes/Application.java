

public class Application
{
	private int applicationNo;		//instance variable
	private String name;
	public static String companyName;	//instance variable
	public final int establishedYear=1995;	

	public Application(){}


	public applicationNo getApplicationNo()
	{
		return this.applicationNo;
	}	

	public void setApplicationNo(int applicationNo)
	{
		if(applicationNo>0 && applicationNo<10000)
			this.applicationNo=applicationNo;
		else
			throw new Exception("The number is invalid");
	}	


}
main()
	Application app=new Application();
	Application app1=new Application();

	app.companyName="ABCD";
	System.out.println(app1.companyName);
//	app.applicationNo=-20;			//since applicationNo is a private variable, it is not visible here.
	app.setApplicationNo(20);



System.out.println(Application.companyName);


