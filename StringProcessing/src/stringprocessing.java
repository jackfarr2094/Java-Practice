public class stringprocessing {
	public void PrintVertical(String msg) {
		String word = " ", alpha;
		int i = 0;
		for (; i< msg.length(); i++) {
			alpha = msg.substring(i, i+1);
			if (alpha.equals(" ")) {
			System.out.println(word); 
			word = " ";
			}
			else {
				word += alpha;
			}
			System.out.println(word);
		}
	}
}