import java.util.Scanner;
    public class BankApplication {
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Bank Name: ");
        String bankName=sc.nextLine();
        System.out.println("Enter the user ID: ");
        int userID =sc.nextInt();
        
    
        System.out.println("Enter the user Name: ");
        sc.nextLine();
        String userName=sc.nextLine();
        System.out.println("Enter the Account Number: ");
        long accountNumber=sc.nextLong();
        sc.nextLine();
        System.out.println("Enter the AccountType: ");
        String accountType=sc.nextLine();
        System.out.println("Enter the Balance: ");
        double balance=sc.nextDouble();
   
        Bank obj=new Bank(bankName,userID,userName,accountNumber,accountType,balance);
        obj.displayBankDetails();
        obj.displayUserDetails();
        obj.displayAccountDetails();
        System.out.println(obj.accountSummary());
        System.out.println("Enter the Minimum Balance");
        double minimumBalance=sc.nextDouble();
    
    if(obj.hasMinimumBalance( minimumBalance)==true){
        System.out.println("Minimum balance is maintained.");

    }
    else{
        System.out.println("Minimum balance is not maintained.");
    }

    }


    }
    


