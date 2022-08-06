
/*
  
 name : Patni kaumil 
 ID : 21CE108
 
 Use the Account class created as above to simulate an ATM machine.  Create 10 accounts with id AC001…..AC010 with initial balance 300₹. The system prompts the users to enter an id. If the id is entered incorrectly, ask the user to enter a correct id. Once an id is accepted, display menu with multiple choices.  
1.	Balance inquiry 
2.	Withdraw money [Maintain minimum balance 300₹] 
3.	Deposit money 
4.	Money Transfer 
5.	Create Account 
6.	Deactivate Account 
7.	Exit  
Hint: Use ArrayList, which is can shrink and expand with compared to Array. 

  */
import java.util.Scanner;

public class Accoutn2 {
    public String id;
    double balance = 300;

    Accoutn2() {

    }

    public Accoutn2(String s) {
        id = s;
    }

    public static void main(String[] args) {
        Accoutn2[] acc = new Accoutn2[12];
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            acc[i] = new Accoutn2();
            acc[i] = new Accoutn2("AC" + i);
            System.out.println(acc[i].id + " 100 ");
        }
        int k = 0;
        int l;
        int j;

        do {
            System.out.println("Enter valid ID number");
            String t = sc.next();
            for (j = 1; j <= 10; j++) 
            {
                if (t.equals(acc[j].id))
                {
                    k++;
                    break;
                }
            }
            if (k == 0) 
            {
                l = 10;
            } else 
            {
                l = 3;
            }
        } while (l != 3);
        System.out.println("Hello");

        System.out.println("ENter 1 for balance");
        System.out.println("ENter 2 for withdraw");
        System.out.println("ENter 3 for deposit");
        System.out.println("ENter 4 for money transfer");
        System.out.println("ENter 5 for create account");
        System.out.println("ENter 6 for deactivate account");
        System.out.println("Enter 7 for exiting");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1:
            {
                System.out.println("your Account Balance is :");
                System.out.println(acc[2].balance);
                break;
            }
            case 2: 
            {
                System.out.println("Please enetr how much money you want to withdraw");
                int s = sc.nextInt();
                acc[j].balance -= s;
                System.out.println("your remainning  Account Balance is :");
                System.out.println(acc[2].balance);
                break;
            }
            case 3: 
            {
                System.out.println("Please enetr how much money you want to deposit");
                int s = sc.nextInt();
                acc[j].balance += s;
                System.out.println("After deposit your Account Balance is  :");
                System.out.println(acc[2].balance);
                break;
            }
            case 4: 
            {
                System.out.println("Please Enter the ID of Account you want to transfer ");
                int i = sc.nextInt();
                System.out.println("Please enetr the money you want to transfer : ");
                int s = sc.nextInt();
                System.out.print(" The money will be transferred in :");
              
                acc[i].balance += s;
                acc[j].balance -= s;
                System.out.println(acc[j].balance);

                System.out.println(acc[i].balance);
                break;

            }
            case 5: 
            {
                acc[11] = new Accoutn2();
                System.out.println("your new Account is created");
                break;

            }
            case 6: 
            {
                acc[j].balance = 0;
                acc[j].id = "0A";
                break;
            }
            case  7:
                    {
                        System.out.println("Thanks for visiting :) ");
                        System.exit(0);
                        break;
                    }


        }

    }
}





