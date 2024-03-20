package Day9;
import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val = 1;
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(val+"\t");
                val++;
            }
            System.out.println();
        }
    }
}
