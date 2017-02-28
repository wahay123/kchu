
public class Account {
	private double _balance;
	private boolean _enabled;

	public Account() {
		_balance = 0;
		_enabled = true;
	}

	public Account(double amount) {
		_balance = amount;
		_enabled = true;
	}

	public double getBalance() {
		return _balance;
	}

	public boolean getEnabled() {
		return _enabled;
	}

	public void setEnabled(boolean enabled) {
		this._enabled = enabled;
	}

	public void deposit(double amount) {
		if (getEnabled() == true) {
			this._balance = getBalance() + amount;
			System.out.println("Deposit succeeded.  Current balance: " + this._balance);
		} else {
			System.out.println("The account is not enabled");
		}
	}

	public void withdraw(double amount) {
		if (amount <= getBalance() && getEnabled() == true) {
			this._balance = getBalance() - amount;
			System.out.println("withdraw succeeded.  Current balance: " + this._balance);
		} else {
			System.out.println("The account is not enabled or amount input is incorrect");
		}
	}
}
