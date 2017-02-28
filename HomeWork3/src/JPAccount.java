
public class JPAccount extends Account {
	private static double ExchangeRate = 0.07;

	public JPAccount() {
		super();

	}

	public JPAccount(double amount) {
		super(amount);

	}

	static void setExchangeRate(double rate) {
		ExchangeRate = rate;
	}

	public double getLocalBalance() {
		return this.getBalance() * ExchangeRate;
	}

}
