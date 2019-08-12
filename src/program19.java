import java.util.*;

// not done
/*19. Find no of characters in a given string which are not repeated.
input: "hello"
output: 3*/

public class program19 {
	/*
	 * public void check(String str) { int count = 1; char ch[] =
	 * str.toCharArray(); for (int i = 0; i < str.length() - 1; i++) { for (int
	 * j = i + 1; j < str.length(); j++) if (ch[i] != ch[j]) { count++;
	 * 
	 * }
	 * 
	 * } System.out.println(count);
	 * 
	 * }
	 * 
	 * public static void main(String[] args) { System.out.println("enter here"
	 * ); Scanner sc = new Scanner(System.in); String str = sc.nextLine();
	 * program19 p = new program19(); p.check(str);
	 * 
	 * }
	 */

	public static void main(String[] args) {

		String str = "hello";
		int count = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++)

			{
				if (ch[i] == ch[j]) {

					count++;
				}

			}

		}
		System.out.println(count);

	}
}
