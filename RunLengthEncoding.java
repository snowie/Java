import java.util.*;

public class runlengthEncoding {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String inp = sc.nextLine();
		System.out.println(encode(inp));
	}
	public static String encode(String inp) {
		StringBuilder res = new StringBuilder();
		int count =1;
		char current = inp.charAt(0);
		for(int i = 1; i<inp.length();i++) {
			if(inp.charAt(i)== current) {
				count++;
			}
			else {
				res.append(count).append(current);
				current=inp.charAt(i);
				count=1;
			}
		}
		res.append(count).append(current);
		return res.toString();
	}
}
