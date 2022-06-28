import java.util.Scanner;
import java.io.FileInputStream;
import java.util.Arrays;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        int b=0;
        int c=0;
        int num [] = new int[T];
       
        for(int i =0; i<T; i++)
        {
            b = sc.nextInt();
            num[i] = b;
        }
        Arrays.sort(num);
         
        int a= Math.round(T/2);
        c=num[a];
        System.out.println(c);
    }
}