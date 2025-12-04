 import java.util.Scanner;
 class AmountOfBank {
    private double balance;

    public AmountOfBank(double initialBalance){
        this.balance = initialBalance;
    }
    public double checkBalance(){
        return balance;
    }

    public void deposite(double amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Amount deposite successfully");
        }else{
            System.out.println("Plzz bring valid amount");
        }
    }

    public void withdrawl(double amount){
        if(amount > 0){
            if(amount <= balance){
                System.out.println("Successfully withdrawl your amount");
            }else{
                System.out.println("Unsuccessfully");
            }           
        }
        else if(amount > balance){
            System.out.println("You have not enough amount");
        }
        else{
            System.out.println("You can't withdrawl");
        }
    }   
    
}


public class Bank{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        AmountOfBank aob = new AmountOfBank(10000.00);
        int choice ;

        while(true){
            System.out.println("1. Check Balance");
            System.out.println("2. Deposite Amount");
            System.out.println("3. Withdrawl Amount");
            System.out.println("4. Exit");
            System.out.println("Enter Your Choice");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                System.out.println("Your Balance is : "+ aob.checkBalance());
                break;
                case 2:
                System.out.println("Enter amount to deposite: ");
                double depositeAmount = sc.nextDouble();
                aob.deposite(depositeAmount);
                break;
                case 3:
                System.out.println("Enter amount for withdrawl");
                double withdrawlAmount = sc.nextDouble();
                aob.withdrawl(withdrawlAmount);
                break;
                case 4:
                System.out.println("Thank you for using Bank");
                sc.close();
                System.exit(0);
                break;
                default:
                System.out.println("All wrong");
            }

        }

    }

}
