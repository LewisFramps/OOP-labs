package DNA;

public class DNAStrand {
	private String strand;
	
	public DNAStrand(String strand) {
		this.strand = strand;
	}
	
	public boolean isValidDNA() {
		if (this.strand.length() < 1) return false;
		for(String chr : this.strand.split("-")) {
			if(!chr.equals("A") && !chr.equals("T") && !chr.equals("C") && !chr.equals("G")) return false;
		}
		return true;
	}
	
	public String complementWC() {
		String s = "";
		for(String chr : this.strand.split("-")) {
			switch(chr) {
			case "A":
				s += "T";
				break;
			case "T":
				s += "A";
				break;
			case "G":
				s += "C";
				break;
			case "C":
				s += "G";
				break;
			}
			s += "-";
		}
		return s.substring(0, s.length()-1);
	}
	
	public String palindromeWC() {
		String s = "";
		for(char chr : complementWC().toCharArray()) {
			s = chr + s;
		}
		return s;
	}
	
	public	boolean containsSequence(String s) {
		return this.strand.contains(s);
	}
	
	public String toString() {
		return this.strand;
	}
	
}
