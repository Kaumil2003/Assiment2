public class Checking extends Account1 {
     private double overdrawlimit = getBalance()/10;
     
    @Override
     public String toString()
     {
        return "the Account number is " +getid()+ "the balance in account is " + getBalance() +"Overdrawlimit is "+overdrawlimit;
     }

 public double withdrawbyChecking( )
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("please enter the money tou want to withdraw ");
   int a = sc.nextInt();

    if (a<overdrawlimit)
    {
        overdrawlimit-=a;
        return overdrawlimit;
    }
    else 
    {
        a-=overdrawlimit;
     double b= getBalance();
     b-=a;
     System.out.println("your over draw limit is over");
     return b;

    }
 }


}   
class SavingAccount extends Account
{
    SavingAccount()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("please enter the money tou want to withdraw ");
      int ab = sc.nextInt();
        balance -= ab;
    }
    public String toString()
    {
        if (balance >= 3000)
        {
            return "The balance left after withdrawal of Rs " + a +" is Rs. " + balance;
        }
        else
        {
            return "Minimum balance of Rs. 3000 is required.";
        }
    }
}
