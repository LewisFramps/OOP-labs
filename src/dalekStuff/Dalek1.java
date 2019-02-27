package dalekStuff;

public class Dalek1 {
	private double batteryCharge = 5.0;
	
	public void batteryRecharge(double charge) {
		this.batteryCharge += charge;
		System.out.println("Battery charge is: " + this.batteryCharge);
	}
	
	public void move(int dist) {
		int i = 1;
		while(this.batteryCharge >= 0.5 && dist != 0) {
			this.batteryCharge -= 0.5;
			System.out.printf("[%d] ", i);
			dist--;
			i++;
		}
		if (this.batteryCharge == 0.0) System.out.println("Out of power!");
	}

}
