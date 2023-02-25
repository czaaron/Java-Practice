
/**
 * Write a description of class P0x5c here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class P0x5c
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String answer = "no";
        int cont = 0;
        
        for(int i = 0; i < word.length(); i++){
            char x = word.charAt(i);
            for(int j = 0; j < word.length(); j++){
                if(x == word.charAt(j)){
                    cont++;
                }
            }
            if(cont > 1){
                answer = "yes";
                break;
            }
            cont = 0;
        }
        System.out.print(answer);
    }
}
