package bank;

public class Penny extends Money
{

	public double value = .01;
	public int totalCoins = 0;
	public int addingBank;

	public Penny(int addingBank)
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