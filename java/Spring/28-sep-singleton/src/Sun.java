
public class Sun {
	String name;
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	private static Sun sun=new Sun();
	private Sun() {}
	public static Sun getInstance()
	{
		return sun;
	}
}
