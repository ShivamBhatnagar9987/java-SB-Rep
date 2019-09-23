import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int N = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		Set<String> ar = new TreeSet<String>();
		for (int NItr = 0; NItr < N; NItr++) {
			String[] firstNameEmailID = scanner.nextLine().split(" ");

			String firstName = firstNameEmailID[0];

			String emailID = firstNameEmailID[1];
			// firstName="julia";
			// emailID="jjulia@gmail.com";
			// System.out.println("name: "+firstName+"\t email: "+emailID);
			if (emailID.contains("@gmail")) {
				String delimiter = "\\@gmail";
				String mailID = emailID.split(delimiter)[0];
				String patternForID = emailID.split(delimiter)[1];
				if (patternForID.equals(".com"))
					ar.add(firstName);
			}
		}
			
			// Collections.sort(ar);
			// Iterator<String> itr=ar.iterator();
			// while(itr.hasNext()){
			// System.out.println(itr.next());
			// }
//			Collections.sort(ar);
		for(String s : ar) {
			System.out.println(s);
		}
		scanner.close();
	}
}
