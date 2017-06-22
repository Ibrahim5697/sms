class largeno3{
public static void main(String[] args){
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
int d=c>(a>b?a:b)?c:((a>b)?a:b);
System.out.println("the largest no is"+d);
}
}