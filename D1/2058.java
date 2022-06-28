import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		int sum=0;
		T=sc.nextInt();
        
		while(T != 0)
		{
			sum += (T%10);
			T = T/10;
		}
		System.out.println(sum);
	}
}