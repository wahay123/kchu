package inheritance;

public class Btn1 extends BigButton {
//extends Button {

	public Btn1(int value){
		super(value);
		System.out.println(this.value);
	}
	
	public void press() {
		System.out.println("Btn1 pressed: " + this.getValue());
	}
}
