package Day9;
import java.util.Scanner;
public class Pattern13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int first = 0;
        int second = 1;
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(first+"\t");
                int temp = first+second;
                first =second;
                second = temp;
            }
            System.out.println();
        }
    }
}
