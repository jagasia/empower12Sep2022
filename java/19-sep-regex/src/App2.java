
public class App2 {

	public static void main(String[] args) {
		Bank sbi=new Bank();
		try {
		sbi.withdraw(50000);
		}catch(NumberFormatException ex)
		{
			System.out.println(ex.getMessage());
		} catch (InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
//		catch(InvalidAmountException iae)
//		{
//			System.out.println(iae.getMessage());
//		}
		System.out.println("Re try now");
	}

}
