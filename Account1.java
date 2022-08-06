 /*
   
  
 name : Patni kaumil 
 ID : 21CE108



  Design a class named Account that contains: 
•	A private int data field named id for the account (default 0). 
•	A private double data field named balance for the account (default 500₹). 
•	A private double data field named annualInterestRate that stores the current interest rate (default 7%). Assume all accounts have the same interest rate. 
•	A private Date data field named dateCreated that stores the date when the account was created. 
•	A no-arg constructor that creates a default account. 
•	A constructor that creates an account with the specified id and initial balance. 
•	The accessor and mutator methods for id, balance, and annualInterestRate. 
•	The accessor method for dateCreated. 
•	A method named getMonthlyInterestRate() that returns the monthly interest rate. 
•	A method named getMonthlyInterest() that returns the monthly interest. 
•	A method named withdraw that withdraws a specified amount from the account. 
•	A method named deposit that deposits a specified amount to the account. 

  */
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Account1 {
    private int id = 0;
    private double balance = 500;
    private double annualInterestRate = 0.07;
    private Date date;

    Account1()
    {

    }

    Account1(int a, double b, double c) 
    {

        id = a;
        balance = b;
        annualInterestRate = c;

    }

    public void getdata() 
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Id no  :");
        id = sc.nextInt();
        System.out.println("Please enter your balance :");
        balance = sc.nextDouble();
        System.out.println("please enter your interestrate");
        annualInterestRate = sc.nextDouble();

    }

    public void putdata() 
    {
        System.out.println("ID  : "+id);
        System.out.println("Balance : "+balance);
        System.out.println("annualinterestrate :"+annualInterestRate);
    }

    public void getdate() 
    {
        SimpleDateFormat dateform = new SimpleDateFormat("dd/MM/yyyy");
        Date newdate = new Date();
        System.out.println(dateform.format(newdate));

    }

    public double getMonthlyIntrest() 
    {
        double i;
        i = balance * annualInterestRate;
        System.out.println(i);
        return i;
    }
    public double getAnnualInterestRate()
    {
        double k ;
        k= (annualInterestRate/100)/12;
        System.out.println("your monthly interestrate : "+k);
        return k;
    }

    public void Withdraw() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the money tou want to withdraw ");
        int l = sc.nextInt();
        balance -= l;
        System.out.println("After withdraw money your remain balance is : "+ balance);

    }

    public void Deposit() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the money tou want to deposit ");
        int j = sc.nextInt();
        balance += j;
        System.out.println("After deposit  money your remain balance is : "+ balance);
    }

    public static void main(String[] args) 
    {

        Account1 obj1 = new Account1();

        obj1.getdata();
        obj1.putdata();
        obj1.getdate();
        obj1.getMonthlyIntrest();
        obj1.Deposit();
        obj1.Withdraw();
        obj1.putdata();

    }

}


