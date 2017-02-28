import java.util.concurrent.ThreadLocalRandom;

public class Trial2 {
	public static void main(String[] args) {
		int randomNum = ThreadLocalRandom.current().nextInt(50, 70 + 1);
		System.out.println(randomNum);
	}
}