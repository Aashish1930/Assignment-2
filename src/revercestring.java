import java.util.Scanner;

/*10. Get a input string. reverse it and parse it with '-'.
input:computer
output:r-e-t-u-p-m-o-c
*/

public class revercestring {

	public static void main(String[] args) {

		
		Scanner sc= new Scanner (System.in);
		System.out.println("enter here");
		String s= sc.nextLine();
		
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
	}

}
