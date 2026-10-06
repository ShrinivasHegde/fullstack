public class BankAccount1 {
    private Integer accountNumber;
    private String holderName;
    private  Double balance;

    public void deposit(Double amount) {
    System.out.println((amount != null && amount > 0) 
    ? "Amount deposited" 
    : "Please provide a valid amount");
        if((amount != null && amount > 0)){
            balance += amount;
        }
    }

    public void withdraw(Double amount) {
        String message = (amount == null || amount <= 0) 
            ? "Please provide a valid amount"
            : (amount > checkBalance()) 
                    ? "Insufficient balance"
                    : "Amount withdrawn";
                   
    System.out.println(message);
        if((amount != null && amount > 0 && amount <= checkBalance())){
            balance -= amount;
        }
    }

    public Double checkBalance() {
        return balance;
    }




}


// 1. Why did we make balance private?
// to encapsulate it by restirct uncontrolled access to the state or data and keep the busnessrule

// 2. Why didn't we provide setBalance()?
// restirct uncontrolled access , which will lead to wrong data setting

// 3. How does this demonstrate encapsulation?
// we have kept the state (balance) and the behavior(witdrway(), cehckbalance() etc)
// are bundled while restricting the uncontrolled access to the state 
// by using the business rules in the behavuors


