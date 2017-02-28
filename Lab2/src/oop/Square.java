package oop;

public class Square {
	private String name;
	private int rotate;
	private boolean playing;
	private String songName;

		
	public Square(String name, int rotate, boolean playing, String songName) {
		super();
		this.name = name;
		this.rotate = rotate;
		this.playing = playing;
		this.songName = songName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRotate() {
		return rotate;
	}

	public void setRotate(int rotate) {
		this.rotate = rotate;
	}

	public boolean isPlaying() {
		return playing;
	}

	public void setPlaying(boolean playing) {
		this.playing = playing;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public void rotate(){
		this.rotate = this.rotate + 90;
	}
	
	public void playSound(){
		this.playing = true;
		this.songName = "My squre";
	}

	@Override
	public String toString() {
		return "Square [square name=" + name + ", rotate=" + rotate + ", playing=" + playing + ", songName=" + songName + "]";
	}
	
	
}
