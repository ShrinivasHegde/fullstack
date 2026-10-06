
public class BankAccount {
    private Integer accountNumber;
    private String holderName;
    private Double balance;

    public void deposit() {
        System.out.println("deposited");
    }

    public void withdraw() {
        System.out.println("withdrawn");
    }

    public void checkBalance() {
        System.out.println("checking Balance");
    }

}


// // 1. What is the class?
// Class in a template or blue print which defines 
// the state and the behavior of an object, which contains the fields
// and methods, which represent s the what an objects contains and what they can perform

// // 2. What is the object?
// Objects are the runtime instances of the class, it has own states and which
// can perform the behaviors defined in the class

// // 3. Which are the state variables?
// accountNumber, holderName, balance

// // 4. Which are the behaviors?
// deposit, withdraw, checkBalance

// // 5. If you create:

// // BankAccount account1 = new BankAccount();
// // BankAccount account2 = new BankAccount();

// // How many objects are created?
// two objects of same classs and they are refernced with the two refernce variables
// called account1 and account2