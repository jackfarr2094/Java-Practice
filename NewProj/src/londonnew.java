
public class londonnew {
	public void Find(String msg, String lookfor) {
		int count = 0;
		int i;
		String alpha;
		for (i = 0; i < msg.length (); i++) {
			alpha = msg.substring (i, i+1);
		if (alpha.equals (lookfor. substring(0, 1))); 
				{
			
				if (msg.substring(i, i + lookfor.length ()).equals(lookfor));
								count ++;
								i+= lookfor.length()-1;
				}
		}
					System.out.println(count);
	}
}

