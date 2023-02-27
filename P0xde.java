
/**
 * Write a description of class P0xde here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class P0xde
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        int p = 0; int q = a.length-1;
        
        quicksort(a, p, q);
        for(int i : a){
            System.out.print(i+" ");
        }
    }
    
    public static void quicksort(int[] a, int left, int rigth){
        int pivot = a[left];
        int p = left; int q = rigth; int temp = 0;
        
        while(p < q){
            while(a[p] <= pivot && p < q){
                p++;
            }
            while(a[q] > pivot){
                q--;
            }
            if(p < q){
                temp = a[p];
                a[p] = a[q];
                a[q] = temp;
            }
        }
        a[left] = a[q];
        a[q] = pivot;
        
        if(left < q - 1) {
            quicksort(a, left, q - 1);
        }
        if(q + 1 < rigth) {
            quicksort(a, q + 1, rigth);
        }  
    }
}
