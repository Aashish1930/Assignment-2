/*Check whether a given string is palindrome also check whether 
 *  it has atleast 2 different vowels
input: "madam"
output: false(no 2 diff vowels)
*/

import java.util.Scanner;

public class program18 {

	public void check(StringBuffer sb, String str) {
		String s1 = sb.toString();
		if (str.equals(s1)) 
		{
			System.out.println("Polidrome name :" +str);
		
			for (int i = 0; i < s1.length(); i++)
				{
				    char ch = s1.charAt(i);
				    	if (ch == 'a' || ch == 'A' || ch == 'e' 
						|| ch == 'E' || ch == 'i' 
						|| ch == 'I' || ch == 'o' || ch == 'O'
						|| ch == 'u' || ch == 'U') 
				    	{
				    		System.out.println("vovels :" + ch);
				    	} 
				    	else
				    	{
				    		System.out.println(" diffrent vovels "+ch);
				    	}
				

				}
		}
		else {
				System.out.println("not polidrome");
		}
	}

  public static void main(String[] args) {
		System.out.println("Enter here ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		program18 p = new program18();
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		p.check(sb, str);

	}

}
