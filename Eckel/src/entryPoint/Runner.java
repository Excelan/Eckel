package entryPoint;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ex = 10;
		
		switch (ex) {
		case 10: ex10.VampireNumbers.vampireNumbers(); break;
		
		default: prn("Assign ex an excercise number 10 - ...");
		}
		

	}

	
	public static void prn(Object o) {
		System.out.println(o.toString());
	}
	
}
