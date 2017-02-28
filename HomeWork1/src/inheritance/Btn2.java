package inheritance;

public class Btn2 extends BigButton {
	public Btn2() {
		super(value);	}

	public void press() {
		System.out.println("Btn2 pressed: " + this.getValue());
	}
}
