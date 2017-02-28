
public class GirlName {
	private String girlName;
	
	public GirlName(String name){
		girlName=name;
	}

	public void setName(String name) {
		girlName = name;
	}

	public String getName() {
		return girlName;
	}

	public void saying() {
		System.out.printf("your first gf was %s", getName());
	}
}
