
/**
 * Write a description of class P0xf2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class P0xf2
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int left = 0, rigth = 0;
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            rigth += a[i];
        }
        
        for(int p = 0; p < n; p++){
            if(left > 0 && rigth < 0){
                System.out.print(p);
                return;
            }
            left += a[p];
            rigth -= a[p];
        }
        System.out.print("Impossible");
    }
}
