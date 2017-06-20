import java.util.Scanner;
class strmulti{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("enter the numbers:");
String s1=s.next();
String s2=s.next();
int a=Integer.parseInt(s1);
int b=Integer.parseInt(s2);
int c=a*b;
String result=Integer.toString(c);
System.out.println("the multiplication is"+result);
}
}