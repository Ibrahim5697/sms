package player;
import java.util.Scanner;
public class dateformat {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int dd=sn.nextInt();
		int mm=sn.nextInt();
		int yyyy=sn.nextInt();
		if((dd>0&&dd<=31)&&(mm>0&&mm<=12)&&(yyyy>0))
			System.out.println("true");
		else
			System.out.println("false");
		sn.close();

	}

}
