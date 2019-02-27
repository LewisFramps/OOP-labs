package dalekStuff;

public class dalekClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dalek1 d = new Dalek1();
		d.move(11);
		d.batteryRecharge(2.5);
		d.batteryRecharge(0.5);
		d.move(5);
		System.out.println("\n-----------");
		
		Dalek2 d1 = new Dalek2();
		Dalek2 d2 = new Dalek2();
		String[] u1 = { "Exterminate, Exterminate!", "I obey!","Exterminate, annihilate, DESTROY!", "You cannot escape.",  "Daleks do not feel fear.", "The Daleks must survive!" };
		String[] u2 = { "I obey!" };
		
		d1.setSayings(u1);
		d2.setSayings(u2);
		
		for(int i = 0; i < 100; i++) {
			d1.speak();
			//d2.speak();
		}
	}

}
