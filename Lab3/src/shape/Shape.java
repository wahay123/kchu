package shape;

public class Shape {
	private String name;
	private int rotate;
	private boolean playing;
	private String songName;
	private String remark;

		
	public Shape(String name, int rotate, boolean playing, String songName) {
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

	protected String getRemark(){
		return this.remark;
	}
	
	@Override
	public String toString() {
		return "Square [square name=" + name + ", rotate=" + rotate + ", playing=" + playing + ", songName=" + songName + "]";
	}
	
	public void rotate(){
		System.out.println("my son is rotating");
	}
	
	public void playSound(){
		System.out.println("my son is playing song");
	}
}
