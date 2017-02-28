package oop;

public class Triangle {
	private String name;
	private int rotate;
	private boolean playing;
	private String songName;

	public Triangle(String name, int rotate, boolean playing, String songName) {
		this.name = name;
		this.rotate = rotate;
		this.playing = playing;
		this.songName = songName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRotate(int rotate) {
		this.rotate = rotate;

	}

	public void setPlaying(boolean playing) {
		this.playing = playing;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getName() {
		return name;
	}

	public int getRotate() {
		return rotate;
	}

	public boolean getPlaying() {
		return playing;
	}

	public String getSongName() {
		return songName;
	}

	public void rotate() {
		this.rotate += 180;
	}

	public void playSound() {
		this.playing = true;
		this.songName = "ABC";
	}

	@Override
	public String toString() {
		return "Triangle [name=" + name + ", rotate=" + rotate + ", playing=" + playing + ", songName=" + songName
				+ "]";
	}

}
