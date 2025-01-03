

# Banking System in Java

This project demonstrates a simple **Banking System** built using **Object-Oriented Programming (OOP) concepts** in Java. The system includes functionality for managing customer accounts, deposits, withdrawals, and interest calculations.

## OOP Concepts Implemented
The project helps in learning and implementing the core **OOP principles**:

1. **Encapsulation**:  
   - Implemented in the `Customer` class where the customer details like name, ID, and address are private and accessed via getter and setter methods.
   
2. **Inheritance**:  
   - Created an abstract `Account` class with methods like `deposit()` and `withdraw()`, which are inherited by `SavingsAccount` and `CurrentAccount` classes to implement specific account features.

3. **Polymorphism**:  
   - Used method overloading for `withdraw()` to allow withdrawal with or without specifying the mode.
   - Implemented method overriding for the `calculateInterest()` method in both `SavingsAccount` and `CurrentAccount` to calculate interest differently.

4. **Abstraction**:  
   - Created an abstract method `calculateInterest()` in the `Account` class, which is implemented in subclasses to calculate interest based on account type.

---

## Tasks Completed

### **Task 1: Customer Class (Encapsulation)**
- Designed a `Customer` class with private fields: `name`, `customerId`, and `address`.
- Added getter and setter methods for encapsulating the data.

### **Task 2: Account Class (Abstraction)**
- Created an abstract `Account` class with basic operations like `deposit()` and `withdraw()`.
- Introduced an abstract method `calculateInterest()` to be implemented by subclasses.

### **Task 3: Inheritance**
- Created `SavingsAccount` and `CurrentAccount` classes inheriting from the `Account` class.
- Added specific methods like `calculateInterest()` and used inheritance to handle different types of accounts.

### **Task 4: Polymorphism**
- Overloaded the `withdraw()` method to allow different withdrawal methods (e.g., with or without specifying a mode).
- Overridden `calculateInterest()` in `SavingsAccount` and `CurrentAccount` classes to calculate interest based on account type.

### **Task 5: Abstraction**
- Ensured the `calculateInterest()` method was abstract in the `Account` class and implemented it in the child classes.

---

## How to Run the Application

1. Clone the repository:
   ```bash
   git clone https://github.com/YourUsername/BankingSystemJava.git
   ```

2. Navigate to the project directory:
   ```bash
   cd BankingSystemJava
   ```

3. Compile and run the `Main` class:
   ```bash
   javac Main.java
   java Main
   ```
