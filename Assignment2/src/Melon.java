import java.util.concurrent.ThreadLocalRandom;

public class Melon extends Ingredient implements ContainerInterface {

	private String name;
	private int vol;
	private boolean isContainer;

	public Melon(String name) {
		int randomNum = 0;
		this.setName(name);
		this.setVol(randomNum);
		this.setIsContainer(true);
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

	@Override
	public int getContainerVol() {
		int temp = 0;
		int conVol = 0;
		temp = this.getVol();
		conVol = temp * 4;
		return conVol;
	}

	@Override
	public String getContainerName() {
		return this.getName();
	}

}
