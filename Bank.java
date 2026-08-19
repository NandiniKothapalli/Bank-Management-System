class Bank{
    String bankName;
    int userId;
    String userName;
    long accountNumber;
    String accountType;
    double balance;
    

    Bank( String bankName,int userId,String userName,long accountNumber,String accountType,double balance){
            this.bankName=bankName;
            this.userId=userId;
            this.userName=userName;
            this.accountNumber=accountNumber;
            this.accountType=accountType;
            this.balance=balance;
    }
    void displayBankDetails(){
        System.out.println("Bank Name: "+ bankName);
    }
    void displayUserDetails(){
    
        System.out.println("User Name: "+userName);
        System.out.println("UserId: "+userId);
    }
    void displayAccountDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Type: "+accountType);
        System.out.println("Account Balance: "+balance);
    }
    String accountSummary(){
        String accountSummary="Bank Name: "+bankName+"\nUser Name: "+userName+"\nAccount Number: "+accountNumber+"\nAccount Type: "+accountType+"\nBalance: "+balance;
        return accountSummary;
    }
    boolean hasMinimumBalance(double minimumBalance){
        boolean res=false;
        if (balance>=minimumBalance){
            res=true;
        }
        return res;
    }
    boolean deposit(double amount){
        if(amount>0){
            balance=amount+balance;
            return true;
        }
        else  return false;
    }
    boolean withdraw(double amount){
        if(amount >0 && balance >= amount){
            balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }
    double checkBalance(){
        return balance;
    }

    }



    