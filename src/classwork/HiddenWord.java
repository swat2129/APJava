package classwork;

/*
 * @author Wilson Wat
 * 
 */

public class HiddenWord {

	public String str;
	
	public HiddenWord(String str) {
		this.str = str;
	}
	
	public String getHint(String guess) {
		String hint = new String();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == guess.charAt(i)) {
				hint += str.charAt(i);
			} else if (str.indexOf(guess.charAt(i)) > -1) {
				hint += "+";
			} else {
				hint += "*";
			}
		}
		
		return hint;
	}
}
