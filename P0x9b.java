
/**
 * Write a description of class P0x9b here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class P0x9b
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner("8\n3 5 2 6 1 4 7 2\n3\n2 5\n0 7\n4 4");
        int n = sc.nextInt();
        int a[] = new int[n];
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        int c = sc.nextInt();
        for(int i = 0; i < c; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            resolve(a,l,r);    
        }
    }
    
    public static void resolve(int[] a,int l, int r){
        int mayor = Integer.MIN_VALUE; int x = 0;
        for(int i = l; i <= r; i++){
            if(a[i] > mayor){
                mayor = a[i];
                x = i;
            }
        }
        System.out.println(x);
    }
}
