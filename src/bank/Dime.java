package bank;

public class Dime extends Money
{

	public double value = .10;
	public int totalCoins = 0;
	public int addingBank;

	public Dime(int addingBank)
	{
		add(addingBank);
	}

	public void double add(int addingBank)
	{
		if(addingBank == 0)
		{
			totalCoins = totalCoins + 1;
		}
		else
		{
			totalCoins = totalCoins + addingBank;
		}
		
	}
}