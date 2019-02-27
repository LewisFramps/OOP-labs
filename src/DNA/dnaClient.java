package DNA;
import java.util.Arrays;
public class dnaClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strand = "A-T-G-C";
		DNAStrand newStrand = new DNAStrand(strand);
		System.out.println(newStrand.isValidDNA());
		System.out.println(newStrand.complementWC());
		System.out.println(newStrand.palindromeWC());
	}

}
