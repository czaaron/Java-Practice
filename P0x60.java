
/**
 * Write a description of class P0x60 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class P0x60
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        byte b = sc.nextByte();
        String res = a > b ? ">" : a < b ? "<" : "=";
        System.out.print(res);
    }
}
