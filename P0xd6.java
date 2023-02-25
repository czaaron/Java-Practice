
/**
 * Write a description of class P0xd6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class P0xd6
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int rigth = 0;
        int left = 0;
        
        for(int i = x; i < n; i++){
            rigth++;
            if(i == y){
                break;
            }
            if(i == n-1){
                i = -1;
            }
        }
        
        for(int i = x; i < n; i--){
            left++;
            if(i == y){
                break;
            }
            if(i == 0){
                i = n;
            }
        }
        System.out.print(rigth > left ? left-1 : rigth-1);
    }
}
