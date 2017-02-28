package inheritance;

public class BigButton {
	protected int value;

	public BigButton(int value){
		this.value = value;
	}
	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void add() {
		System.out.println("my son is adding");
	}

}
