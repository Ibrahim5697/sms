package pro;

import java.util.Scanner;
import java.util.Arrays;
public class commenprefix {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in); 
	    
	       String s1=sn.next();
	       int n=s1.length();
	       int k=sn.nextInt(); 
	      int a[]=new int[n];
	       for(int i=0;i<n;i++) {
	           a[i]=s1.charAt(i)-48;}
	       Arrays.sort(a);
	       for(int i=0;i<n-k;i++)
	           System.out.print(a[i]);
              sn.close();
	}

}
