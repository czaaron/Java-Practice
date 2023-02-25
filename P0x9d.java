
/**
 * Write a description of class P0x9d here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class P0x9d
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MIN_VALUE;
        int cont = 0;
        
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(x >= min){
                min = x;
                cont++;
            }
        }
        
        System.out.print(cont == n ? "Ordenado" : "Desordenado");
    }
}
