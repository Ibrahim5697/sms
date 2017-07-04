package hunter;
import java.util.Scanner;
public class workingday {
public static void main(String[] args){
	Scanner sn=new Scanner(System.in);
	System.out.println("enter a day:");
	String a=sn.nextLine();
	if(a.equalsIgnoreCase("saturday")||a.equalsIgnoreCase("sunday")){
		System.out.println("false");
	}
	else{
		System.out.println("true");
	}
	
}
}
