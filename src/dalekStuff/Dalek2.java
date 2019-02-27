package dalekStuff;


public class Dalek2 {
	private double batteryCharge = 5.0;
	private String sayings[];
	
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
	
	public void setSayings(String[] phrases) {
		this.sayings = phrases;
	}
	
	public void speak() {
		System.out.println(this.sayings[(int)(Math.random() * ((sayings.length)))]);
	}

}
