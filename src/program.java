/*9. find the max length-word in a given string and return 
 * the max-length word. if two words are of same length
 *  return the first occuring word of max-length
input:"hello how are you aaaaa"
output:hello(length-5)
*/


import java.util.Scanner;

public class program {	
	int max=0;
	int len=0;
	public void check(String s1)

	{
	
	String [] s2=s1.split(" ");
	for(int i=0;i<s2.length;i++)
	{
	//	System.out.println(s2[i]);	
			if(s2[i].length()>len)
		{
			max=i;
			len=s2[i].length();
		}
			
		}
			System.out.println(s2[max]);
			
			System.out.println("word length is "+s2[max].length());
			//System.out.println("word length"+len);
			
	
	}
	
		public static void main(String[] args) {
		System.out.println("enter here");
		Scanner sc= new Scanner(System.in);
		String s1 = sc.nextLine();
		program p = new program();
		p.check(s1);
		
		
	}

}


