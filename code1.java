 /*
  
 name : Patni kaumil 
 ID : 21CE108
  
 */
import java.util.Scanner;

 public class Circle {
 
     private double r = 1;
 
     public Circle() 
     {
         
     }
 
     public Circle(int rad) 
     {
         r = rad;
     }
 
     public double getArea() 
     {
         return   3.14*r*r;
     }
 
     public double getPerimeter() 
     {
         return 2*3.14 *r;
     }
 
     public static void main(String[] args) {
         Circle obj1 = new Circle();
         System.out.println(" area of default radius is "+obj1.getArea());
         System.out.println("perameter of default radius is "+obj1.getPerimeter());
         System.out.println("enter radius : ");
         Scanner sc = new Scanner(System.in);
         int rad = sc.nextInt();
         Circle obj2 = new Circle(rad);
         System.out.println("area of the circle is "+obj2.getArea());
         System.out.println("perameter of the circle is "+obj2.getPerimeter());
        
 
     }
 }
