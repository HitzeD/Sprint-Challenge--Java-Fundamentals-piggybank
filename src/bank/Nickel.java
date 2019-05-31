package bank;

public class Nickel extends Money
{

	public double value = .05;
	public int totalCoins = 0;
	public int addingBank;

	public void Nickel(int addingBank)
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