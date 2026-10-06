public class Developer extends Employee {

    public void writeCode() {
        System.out.println("Developer write code");

       
    }

    public void execute() {
        Developer developer = new Developer();
        developer.work();
        developer.writeCode();
    }
    
}

// 1. Why can Developer call work() even though work() is declared in Employee?
// As developer is subsclass of the EMployee class, it ihenherits the 
// properties and the behaviors from the super class. And it can also give its own implementation to that method. So, Developer can call work() method because it is inherited from Employee class.



// 2. Is this relationship is-a or has-a?
// Developer → Employee
// Developer is a Employee as Developer is a subclass of Employee. Developer class extends the Employee class

// 3. If Employee.name is private, can Developer directly do:

// System.out.println(name);

// Why/why not?
// No it cant access, just doing the inheritance does not allow the child to access the 
// memebers of the parent class, still the access modifiers will be in place, however if the parent class allowed those by using the 
// methods.

// 4. What is the purpose of @Override?
// override is an annotation which willgive compiler the heads up that this method is a
// overridden method and the compiler will cehck for the method signature which should match.
// mehtpd overriding is nothing but the the child class giving the specific implementation to the
// behavior declared in the parent class.


// 5. Give one example from an enterprise application where inheritance might make sense.
// we would keep the service calss and the service implmeation so that the methhod can be re used and each classes
// which implement that one ca give specific implmentaiton.
// As an enterprise example, consider a banking application where you have a base class called `Account` that contains 
// common properties and methods for all types of bank accounts, such as `deposit()`, `withdraw()`, and `getBalance()`.
// Account class will have subclasses like `SavingsAccount`, `CheckingAccount`, and `BusinessAccount`. 
// Each of these subclasses can inherit the common functionality from the `Account` class 
// while also providing their own specific implementations for certain methods, such as different interest rates or withdrawal limits. This allows for code reuse and a clear hierarchical structure in the application.


