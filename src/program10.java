
/*10. Get a input string. reverse it and parse it with '-'.
input:computer
output:r-e-t-u-p-m-o-c
*/


/// using for loop
import java.util.Scanner;

public class program10 {

	private void reverce1(StringBuffer sb) {
		for (int i = 0; i <= sb.length() - 1; i++) {
			System.out.print(sb.charAt(i) + "-");

		}

	}

	public static void main(String[] args) {
		System.out.println("enter here ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
		program10 p = new program10();
		p.reverce1(sb);

	}

}
