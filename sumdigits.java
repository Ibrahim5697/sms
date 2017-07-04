package hunter;
import java.util.Scanner;
public class sumdigits {
	public static void main(String[] args){
		Scanner sn=new Scanner(System.in);
		System.out.println("enter a no:");
		int a=sn.nextInt();
		int b=0;
		int c=a;
		while(c>0){
			a=c;
			while(a>0){
				int n=a%10;
				b=b+n;
				a=a/10;
			}
			c=c/10;
		}
        System.out.println(b);
	}

}
