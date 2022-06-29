import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Solution {
    private void run() throws IOException {
        // Input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
 
        // Code
        char[] in = br.readLine().trim().toCharArray();
        for (int i = 0; i < in.length; i++) {
            sb.append(((int) in[i] - 64) + " ");
        }
 
        // Output
        System.out.println(sb.toString());
    }
 
    public static void main(String args[]) throws IOException {
        new Solution().run();
    }
}