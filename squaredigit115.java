package player;
import java.util.Scanner;
public class squaredigit115 {

	public static void main(String[] args) {
          Scanner sn=new Scanner(System.in);
          int a=sn.nextInt();
          int n,b,c=0;
          while(a>0) {
        	  n=a%10;
        	  b=n*n;
        	  c=c+b;
        	  a=a/10;
          }
System.out.println(c);

	}

}
