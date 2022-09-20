
public interface ThreePointFiveMmJack {
	public void play();
	public default void music()
	{
		System.out.println("This is the default ringtone");
	}
	
	public static void alarm()
	{
		System.out.println("This is static method alarm");
	}
}
