package creditCard;
import java.util.Calendar;

public class creditCard {
	private int expiryMonth;
	private int expiryYear;
	private String firstName;
	private String lastName;
	private String ccNumber;
	
	public creditCard(int expMonth, int expYear, String fName, String lName, String ccNumber) {
		this.expiryMonth = expMonth;
		this.expiryYear = expYear;
		this.firstName = fName;
		this.lastName = lName;
		this.ccNumber = ccNumber;
	}
	
	public String formatExpiryDate() {
		return (this.expiryMonth + "/" + this.expiryYear);
	}

	public String formatFullName() {
		return (this.firstName + " " + this.lastName);
	}
	
	public String formatCCNumber() {
		String s = "";
		for(int i = 0; i < ccNumber.length(); i++) {
			s += this.ccNumber.charAt(i);
			if((i+1) % 4 == 0) s += " ";
		}
		return s;
	}
	
	public boolean isValid() {
		Calendar now = Calendar.getInstance();
		return (now.get(Calendar.YEAR) <= this.expiryYear && now.get(Calendar.MONTH) <= this.expiryMonth);
	}
	
	public String toString() {
		return("Number: " + formatCCNumber() + "\nExpiration date: " + formatExpiryDate() + "\nAccount holder: " + formatFullName() + "\nIs valid: " + isValid() + "\n");
	}
}
