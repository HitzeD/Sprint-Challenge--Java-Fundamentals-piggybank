package bank;

public class Quarter extends Money
{

	public double value = .25;
	public int totalCoins = 0;
	public int addingBank;

	public Quarter(int addingBank)
	{
		add(addingBank);
	}

	public double add(int addingBank)
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