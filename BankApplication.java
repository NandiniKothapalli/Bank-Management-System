import java.util.Scanner;
    public class BankApplication {
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of accounts: ");
        int numberOfAccounts=sc.nextInt();
        Bank[] bankAccounts = new Bank[numberOfAccounts];
        sc.nextLine();
        for(int i=0;i<=bankAccounts.length-1;i++){

        
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
        sc.nextLine();

        bankAccounts[i]=new Bank(bankName,userID,userName,accountNumber,accountType,balance);
        }
        int choice;
        do {
        System.out.println("=============MENU=============");
        System.out.println("1. Display Complete Details");
        System.out.println("2. Deposit Amount");
        System.out.println("3. Withdraw Amount");
        System.out.println("4. Check Balance");
        System.out.println("5. Display Amount Summary");
        System.out.println("6. Check Minimum Balance");
        System.out.println("0. Exit");
        System.out.println("Enter the Choice: ");
        choice=sc.nextInt();
            
            
            
        switch(choice){
                 case 1:
                    for(int i=0;i<=bankAccounts.length-1;i++){
                     bankAccounts[i].displayCompleteDetails();
                    }
                 //obj.displayBankDetails();
            //         obj.displayUserDetails();
            //         obj.displayAccountDetails();
                    break;
        case 2: 
        System.out.println("Enter the Account Number: ");
        long selectedAccountNumber=sc.nextLong();
        Bank selectedAccount=null;
        for(int i=0;i<=bankAccounts.length-1;i++){
            boolean tfan=bankAccounts[i].matchesAccountNumber(selectedAccountNumber);
            if(tfan){
                selectedAccount = bankAccounts[i];
                break;
            }
        }
        if(selectedAccount == null){
            System.out.println("Account Not Found");
            break;
        }
        else{
         System.out.println("Enter the Amount");
         double depositeAmount=sc.nextDouble();
        boolean depo=selectedAccount.deposit(depositeAmount);
        if(!depo){
            System.out.println("The Amount is  Zero or Negitive");
        }
        else{
            System.out.println("Deposit is successful.");
              System.out.println("Availabale balance." + selectedAccount.checkBalance());
        }
    }
        
        break;
    
        case 3:
             System.out.println("Enter the Account Number: ");
        selectedAccountNumber=sc.nextLong();
        selectedAccount=null;
        for(int i=0;i<=bankAccounts.length-1;i++){
            boolean tfan=bankAccounts[i].matchesAccountNumber(selectedAccountNumber);
            if(tfan){
                selectedAccount = bankAccounts[i];
                break;
            }
        }
        if(selectedAccount == null){
            System.out.println("Account Not Found");
            break;
        }
        else{
             System.out.println("Enter the Amount");
        double withdrawAmount=sc.nextDouble();
            boolean with=selectedAccount.withdraw(withdrawAmount);
            if(!with){
            System.out.println("Withdrae failed");
        }
        else{
            System.out.println("Withdraw is successful.");
            System.out.println("Availabale balance." + selectedAccount.checkBalance());
        }
    }
        break;
        case 4:
             System.out.println("Enter the Account Number: ");
        selectedAccountNumber=sc.nextLong();
        selectedAccount=null;
        for(int i=0;i<=bankAccounts.length-1;i++){
            boolean tfan=bankAccounts[i].matchesAccountNumber(selectedAccountNumber);
            if(tfan){
                selectedAccount = bankAccounts[i];
                break;
            }
        }
        if(selectedAccount == null){
            System.out.println("Account Not Found");
            break;
        }
        else{
            double b= selectedAccount.checkBalance();
            System.out.println("Availabale balance." + b);
        }
            break;
            case 5:
                 System.out.println("Enter the Account Number: ");
        selectedAccountNumber=sc.nextLong();
        selectedAccount=null;
        for(int i=0;i<=bankAccounts.length-1;i++){
            boolean tfan=bankAccounts[i].matchesAccountNumber(selectedAccountNumber);
            if(tfan){
                selectedAccount = bankAccounts[i];
                break;
            }
        }
        if(selectedAccount == null){
            System.out.println("Account Not Found");
            break;
        }
        else{
            System.out.println(selectedAccount.accountSummary());
        }
            break;
            case 6:
        System.out.println("Enter the Account Number: ");
        selectedAccountNumber=sc.nextLong();
        selectedAccount=null;
        for(int i=0;i<=bankAccounts.length-1;i++){
            boolean tfan=bankAccounts[i].matchesAccountNumber(selectedAccountNumber);
            if(tfan){
                selectedAccount = bankAccounts[i];
                break;
            }
        }
        if(selectedAccount == null){
            System.out.println("Account Not Found");
            break;
        }
        else{
             System.out.println("Enter the Minimum Balance");
            double minimumBalance=sc.nextDouble();
        

    if(selectedAccount.hasMinimumBalance( minimumBalance)==true){
        System.out.println("Minimum balance is maintained.");

    }
    else{
        System.out.println("Minimum balance is not maintained.");
    } 
        }   break;
        case 0:
        System.out.println("Thank you!");
        break;
        default :
            System.out.println("Enter the valied number");
}
        } while(choice != 0);


        

    }
    

    }
    


