package procedural;

public class Shape {
	private String name;
	private int rotate;
	private boolean playing;
	private String songName;
	
	//Default Constructor
	public Shape(){
		
	}

	
	public Shape(String name, int rotate, boolean playing) {
		super();
		this.name = name;
		this.rotate = rotate;
		this.playing = playing;
		this.songName = "Nothing";
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
	
}
