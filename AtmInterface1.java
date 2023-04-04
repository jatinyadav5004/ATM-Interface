package OASIS;


import java.util.Scanner;
public class AtmInterface1 {
    public static void main(String[] args) {
        int balance = 52000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dear XYZ please enter your profile password:");
        int a=sc.nextInt();
            if(a==5004){
        while(true){
            System.out.println("Automatic Atm Machine ");
            System.out.println("choose 1 for Withdraw Money");
            System.out.println("choose 2 for Deposit Money");
            System.out.println("choose 3 for Account Balance");
            System.out.println("choose 4 for Account Transfer");
            System.out.println("choose 5 for quit");
            System.out.println("choose the operation you want to perform: ");

            int n= sc.nextInt();
            switch (n)
            {
                case 1:
                    System.out.print("Enter money to be withdrawn: ");
                    withdraw = sc.nextInt();
                    if (balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money ");
                    }
                    else
                    {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Enter money to be deposit: ");
                    deposit = sc.nextInt();
                    balance = balance+deposit;
                    System.out.println("Your money has been successfully deposited");
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Total balance: "+balance);
                    System.out.println();
                    break;
                case 4:
               
                System.out.println("\nEnter the Recipents Credentials ");
                System.out.println("\nEnter the Recipents Account Number : ");
                int raccountno =sc.nextInt();
                System.out.println("\nEnter the amount to Transfer : ");
                float amount =sc.nextFloat();
                
                if(amount<=balance){
                    System.out.println("Transfer Successfull");
                }
                else
                {
                    System.out.println("Amount is not sufficient");
                }
                break;
                case 5:
                    System.exit(0);

            }
        }
    
    }
        else{
            System.out.println("Sorry wrong credentials");
        }

        }
    
}
