//define a method to check user enter number is armstrong number or not
import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int x= sc.nextInt();
		boolean rs=isarmstrong(x);
		if(rs==true)
			System.out.println(x+"is Armstrong number");
		else
			System.out.println(x+" is not armstrong number");
	}
	static boolean isarmstrong(int num)
	{
		int sum=0,t=num;
		int dc=countdigit(num);
		do{
			int r=num%10;
			
			sum=sum+pow(r,dc);
			num=num/10;
		}while (num!=0);
		return(sum==t);
	} 
	static int countdigit(int n)
	{
		int count=0;
		do{
			count++;
			n=n/10;
			
		}while(n!=0);
		return count;
	}
	static int pow(int a,int b)
	{
		int pw=1;
		while(b>0)
		{
			pw=pw*a;
			b--;
		}
		return pw;
		

	
	}
}