import java.util.Scanner;

/*Two input strings are accepted. If the two strings are of same
 *length concat them and return, if they are not of same length,
 * reduce the longer string to size of smaller one, 
 * and concat them
*/

public class program11 {
	int s1cnt = 0;
	String actulString;

	public void check(String s1, String s2) {
		if (s1.length() == s2.length()) {
			actulString = s1.concat(s2);
			System.out.println("String Concated" + " " + actulString);

		}
		if (s1.length() > s2.length()) {
			s1cnt = s1.length() - s2.length();
			actulString = s1.concat(s2);

			System.out.println(actulString.substring(s1cnt));

		}
		if (s2.length() > s1.length()) {
			s1cnt = s2.length() - s1.length();
			actulString = s1.concat(s2);

			System.out.println(actulString.substring(s1cnt));

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String s1 = sc.nextLine();
		System.out.println("Enter the first String");
		String s2 = sc.nextLine();
		program11 p = new program11();
		p.check(s1, s2);

	}

}
