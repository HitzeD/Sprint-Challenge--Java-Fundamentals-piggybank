package bank;

public class Dollar extends Money
{

	public double value = 1.00;
	public int totalCoins = 0;
	public int addingBank;

	public Dollar(int addingBank)
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