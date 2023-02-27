
/**
 * Write a description of class P0xdd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class P0xdd
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        boolean change = true;
        
        if(n == 1){
            System.out.print(sc.nextInt());
            return;
        }
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i = 0; i < a.length - 1; i++){
            change = true;
            for(int j = 0; j < a.length - i - 1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    change = false;
                }
            }
            if(change == true || i == a.length - 2){
                for(int k : a){
                    System.out.print(k+" ");
                }
                break;
            }
        }
    }
}
