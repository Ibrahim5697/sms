import java.util.Scanner;
class doublestring{
public static void main(String[] args){
Scanner sn=new Scanner(System.in);
String str=sn.nextLine();
int a=str.length();
String str1=str.substring(0,a/2);
String str2=str.substring(a/2,a);
if(str1.equals(str2))
System.out.println("double string");
else
System.out.println("not a double string");
}
}