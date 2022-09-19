
public class Bank {
	public void withdraw(int amount) throws InvalidAmountException, NumberFormatException
	{
		if(amount>30000)
		{
			throw new InvalidAmountException("The amount "+amount+" is invalid");
//			throw new NumberFormatException("Amount cannot be >30k");
//			System.out.println("Amount cannot be > 30k");
		}else
		{
			System.out.println("Remember to collect the cash");
		}
	}
}
