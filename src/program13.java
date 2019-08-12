
/*13. Get a integer array as input. Find the average of the elements which are in the position of prime index
input:{1,2,3,4,5,6,7,8,9,10}
logic:3+4+6+8(the indeces are prime numbers)
output:21
*/

//......
public class program13 {

	public static void main(String[] args) {
		int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int sum=0;
		boolean flag = false;
		for (int i = 0; i < n.length; i++) {
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					flag = true;
				}
			}

			if (flag == false) {
				sum += n[i];
			}
		}

		System.out.println("Sum of prime index number from given array is: " + sum);

	}

	}
