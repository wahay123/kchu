
public class PlasticCup extends Ingredient implements ContainerInterface {

	private String name;
	private int vol;

	public PlasticCup(String name) {
		this.setName(name);
		int tempVol = 300;
		this.setVol(tempVol);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	@Override
	public int getContainerVol() {
		return this.getVol();

	}

	@Override
	public String getContainerName() {
		return this.getName();
	}

	@Override
	void add() {
		// TODO Auto-generated method stub

	}

}
