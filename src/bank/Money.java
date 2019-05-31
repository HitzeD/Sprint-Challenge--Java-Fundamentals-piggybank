package bank;

public abstract class Money
{
	public double value;
	public int totalCoins;
	
	public abstract int add();

	public double getValue()
	{
		return value;
	}

	public double getTotal()
	{
		return value * totalCoins;
	}
}