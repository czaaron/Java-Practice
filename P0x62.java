
/**
 * Write a description of class P0x62 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class P0x62
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int cont = 0;
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int c = sc.nextInt();
        for(int i = 0; i < c; i++){
            int x = sc.nextInt();
            for(int j = 0; j < arr.length; j++){
                if(arr[j] > x){
                    cont++;
                }
            }
            System.out.println(cont);
            cont = 0;   
        }
    }
}
