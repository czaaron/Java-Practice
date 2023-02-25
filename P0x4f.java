
/**
 * Write a description of class P0x4f here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Stack;
public class P0x4f
{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n+1];
        Stack stack = new Stack();
        int area = 0;
        int mayor = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        stack.push(0);
        for(int i = 1; i < a.length; i++){
            if(i == a.length - 1){
                a[i] = 0;
            }
            if(a[i] > a[i-1]){
                stack.push(i);
            }else{
                while(!stack.isEmpty()){
                    int x = (int)stack.peek();
                    if(a[x] <= a[i]){
                        stack.push(i);
                        break;
                    }
                    stack.pop();    
                    if(stack.isEmpty()){
                        area = a[x] * i;
                        if(area > mayor){
                            mayor = area;
                        }
                        stack.push(i);
                        break;
                    }else{
                        area = a[x] * (i - (int)stack.peek() - 1);       
                    }
                    if(area > mayor){
                        mayor = area;
                    }   
                }
            }
        }
        System.out.println(mayor);
    }
}
