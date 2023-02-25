
/**
 * Write a description of class P0xe1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class P0xe1
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int sum = 0, hor = 0, ver = 0, diag = 0, diagi = 0;
        String message = "Yes";
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
            sum += a[i][i];
        }
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                hor += a[i][j];
                ver += a[j][i];
                diag += a[j][j];
                diagi += a[j][(a.length - j) - 1];
            }
            if(hor != sum || ver != sum || diag != sum || diagi != sum){  
                message = "No";
                break;
            }
            hor = 0; ver = 0; diag = 0; diagi = 0;
        }
        System.out.print(message);
    }
}
