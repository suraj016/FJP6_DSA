package Module_2_Patterns;
import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
                int n = sc.nextInt();
                // first loop will print no of rows
             for(int row = 1; row<=n; row++){
                 int nstr = row;
                 int nsp= n-nstr;
                 // this loop will print no of space
                 for(int i = 1; i<=nsp; i++){
                     System.out.print(" \t");
                 }
                 // this loop will print no of star

                 for(int i = 1; i<=nstr; i++){
                     System.out.print("*\t");
                 }
                 System.out.println();
             }
    }
    
}
