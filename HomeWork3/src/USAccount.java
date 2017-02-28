
public class USAccount extends Account {
	private static double ExchangeRate = 7.8;

	public USAccount() {
		super();
	}

	public USAccount(double amount) {
		super(amount);
	}

	static void setExchangeRate(double rate) {
		ExchangeRate = rate;
	}

	public double getLocalBalance() {
		return this.getBalance() * ExchangeRate;
	}
}
