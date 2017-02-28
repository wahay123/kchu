package abstract_demo_2;

public abstract class Template {
	private String header;
	private String footer;

	public Template() {
		header = "templateHeader";
		footer = "templateFooter";
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getHeader() {
		return header;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	public String getFooter() {
		return footer;
	}

	public void printTemplate() {
		System.out.println(getHeader());
		System.out.println(getBody());
		System.out.println(getFooter());
	}

	public String toString() {
		return getHeader() + "\n" + getBody() + "\n" + getFooter();
	}

	public abstract String getBody();
}
