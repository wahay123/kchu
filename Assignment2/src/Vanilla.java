import java.util.concurrent.ThreadLocalRandom;

public class Vanilla extends Ingredient {

	private String name;
	private int vol;
	private boolean isContainer;

	public Vanilla(String name) {
		int randomNum = 0;
		this.setName(name);
		this.setVol(randomNum);
		this.setIsContainer(false);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public int getVol() {
		return vol;
	}

	public boolean getIsContainer() {
		return isContainer;
	}

	public void setIsContainer(boolean isContainer) {
		this.isContainer = isContainer;
	}

	public void add() {

	}

}
