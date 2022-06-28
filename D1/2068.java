import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int a = 0;

		for(int test_case = 1; test_case <= T; test_case++)
		{
            		for(int i = 0;i<10; i++)
            		{
            			int temp = sc.nextInt();
            			if(a < temp) 
                			{
                    			a = temp;
                			}
            		}
           		System.out.println("#" + test_case + " " + a);
            	a=0;
		}
	}
}