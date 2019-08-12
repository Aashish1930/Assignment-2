
/* Get a input string. Find if it is a negative number,
 if true return the absolute value, in other cases return -1.
*/
import java.util.Scanner;

public class program20 {

	public int check(String s) {

		{
			try {
				int num = Integer.parseInt(s);
				if (num < 0) {
					int number = -num;

					System.out.println("Absolute number is " + number);

				}
			} catch (NumberFormatException e) {
				System.out.println(" ");
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		System.out.println("Enter Negative Number here ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		program20 p = new program20();
		p.check(s);

	}

}
