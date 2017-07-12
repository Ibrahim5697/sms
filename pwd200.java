package player;
import java.util.Scanner;
public class pwd200 {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		String str=sn.nextLine();
		int input1=sn.nextInt();
		int a,b=0,c,d=0;
		String str1=String.valueOf(input1);
		String str2=str1.substring(0,1);
		String str3=str.substring(0,1).toLowerCase();
		
	       while(input1>0){
			 a=input1%10;
			   b=b+a;
			   input1=input1/10;
	       }
	       while(b>0){
	    	  
			   c=b%10;
			   d=d+c;
			    b=b/10;
			   
		   }
	       String str4=str.substring(str.length()-1);
              System.out.println(str2+str3+d+str4);
	}

}
