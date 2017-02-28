package shape;

public class Circle extends Shape{

	public Circle(String name, int rotate, boolean playing, String songName) {
		super(name, rotate, playing, songName);
	}
	
	public void rotate(){
		super.rotate();
		this.setRotate(this.getRotate() + 90) ;
	}
}
