package practice10;
import java.util.Random;

public class Car {
	int serialNo;
	String color;
	int gasoline;
	
	
	 public int run() {
		int run = new Random().nextInt(15) + 1;
		this.gasoline -= 1;
		if(gasoline < 0) {
			System.out.println("もう進めない");
			return -1;
		}
		return run;
		
	
	}
}



