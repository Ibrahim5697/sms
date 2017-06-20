public class TestCode {
String input1;
String input2;
long input3;
long sum=0;

TestCode(String i1,String i2,long i3)
{
	input1=i1;
	input2=i2;
	input3=i3;
}
public void passGen()
{
	
	String str1=input1.toUpperCase();
	String str2=str1.substring(input1.length()-2);
	String str3=input2.toLowerCase();
	String str4=str3.substring(0,2);
	long last=input3%10;
	long  first=input3/1000000000;
	while(input3>9)
	{
		sum=0;
		while(input3>0)
		{
			long temp=input3%10;
			sum=sum+temp;
            input3=input3/10;			
			
		}
		input3=sum;
	}
	System.out.print(str2+""+last+""+first+""+str4+""+sum);
	
}
public static void main(String[] args)
{
	TestCode t=new TestCode("abcd","XYZ",1111111111);
	t.passGen();
	
}
}