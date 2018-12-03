public class ToLowerCase {

	public static String toLowerCase(String str) {
		
		char[] charArr = new char [str.length()];
		
		for(int i=0; i<str.length(); i++) {
			
			charArr[i] = str.toCharArray()[i];
			if((int) str.toCharArray()[i]  >= 65 && (int) str.toCharArray()[i]  <= 90) {
				charArr[i] = (char) ((int) str.toCharArray()[i] + 32);
			}
			
		}
		String str2 = new String(charArr);
		return str2;
		
	}
}
