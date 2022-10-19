// Write a program to print first digit. e.g. input 23516 output 2.
import java.util.Scanner;
public class firstDigit {
    static int findFirstDigit(int x){
        int r=0, d=0;
        while(x>9){
            r=x%10;
            x=x/10;
        }
        return x;
    
    }
    public static void main(String[] args) {
        System.out.println("Please enter the number: ");
        Scanner ob = new Scanner(System.in);
        int num = ob.nextInt();
        int digit = findFirstDigit(num);
        System.out.println("The first digit of "+num+" is : "+digit);
        
    }
    
}
