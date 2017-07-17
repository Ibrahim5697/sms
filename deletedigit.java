package pro;
import java.util.Scanner;
import java.util.Arrays;
public class deletedigit {

	public static void main(String[] args) {
		int k;
		int number;
		Scanner sn = new Scanner(System.in);
		try {
			System.out.println("Enter the number of digits: ");
			k=sn.nextInt();
			System.out.println("Enter the number: ");
			number =sn.nextInt();
			String string=""+ number;
			if (k<string.length()&&k>0) {
				char[] numberArray=string.toCharArray();
				Arrays.sort(numberArray);
				string="";
				for (int i=0;i<numberArray.length-k;i++) {
					string += numberArray[i];}
				System.out.println(Integer.parseInt(string));
			} else {
				System.out.println("Invalid");
			}
		} catch (RuntimeException exception) {
			System.out.println(exception.getMessage());

		}
		sn.close();

	}

}
