 /*
  
 name : Patni kaumil 
 ID : 21CE108
  
 Develop a Program that illustrate method overloading concept. 
 */
import java.util.Scanner;

public class Overloading {
    static int muntiplication(int a ,int b)
    {
        return a*b;
    }
    static int muntiplication(int a ,int b, int c)
    {
        return a*b*c;
    }
    static int muntiplication(int a ,int b,int c ,int d)
    {
        return a*b*c*d;
    }

    public static void main(String[] args) {
        
        System.out.println("2 digit multiplication : " +muntiplication(2,3));
        System.out.println("3 digit multiplication : " +muntiplication(2,3,4));
        System.out.println("4 digit multiplication : " +muntiplication(2,3,4,5));
    }
}
