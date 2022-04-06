package se.lexicon.rajashree;

public class BankAccount {
    public int accountNumber;
    public int balance;
    public String customerName;
    public String email;
    public int phoneNumber;

    public BankAccount(int accountNumber, int balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public int deposite(int  balance, int amount){
        balance = balance + amount;

        return balance;
    }

    public int withdrawal(int  balance,int amount){
        if(balance < 0){
            System.out.println("Insufficient Balance");
        }else{
            balance = balance - amount;
            if(balance > 0){
                return balance;
            }
        }
        return balance;
    }







}
