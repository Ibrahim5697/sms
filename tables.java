import java.util.Scanner;
public class tables {
public static void main(String args[]){
int a,b;
System.out.println("enter the no");
Scanner in=new Scanner(System.in);
a=in.nextInt();
for(b=1;b<=10;b++)
System.out.println(a+"*"+b+"="+(a*b));
}
}