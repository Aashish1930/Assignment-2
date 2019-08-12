import java.util.Scanner;

public class program15 {
		public static void main(String[] args) {
		
		//System.out.println("enter array 1 and 2 ");
		int a[]={1,2,3,4};
		int b[] = {3,4,3,4};
			int count=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					
					System.out.println("comman element is "+a[i]);
					count++;
					break;
				}
			}
		}System.out.println("total element is "+count);
		
		}
}
