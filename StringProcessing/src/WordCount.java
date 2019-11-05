
public class WordCount {

	public void WordCountClass(String msg) {
		int spacecount = 0;
		String alpha;
		int i;
				for (i = 0; i<msg.length(); i+=1) {
					alpha=msg.substring(i, i+1);
						if (alpha.equals(" ")) {
							spacecount += 1;
						}
				}
				System.out.println("");		
	}
	

	
}
