class seed{
public static void main(String[] args){
int y=Integer.parseInt(args[0]);
int x=Integer.parseInt(args[1]);
int temp=x;
int s=x;
int a;
while(Math.abs(x)>0){
a=x%10;
s=s*a;
x=x/10;}
if(Math.abs(s)==Math.abs(y)){
System.out.println(temp+"is seed of"+y);}
else{
System.out.println(temp+"is not seed of"+y);}
}
}
