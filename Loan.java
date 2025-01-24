// Loan.java
public class Loan {
    String loanId;
    double loanAmount;
    double interestRate;
    int durationInMonths;
    String customerId; // Reference to the customer who took the loan

    // Constructor
    public Loan(String loanId, double loanAmount, double interestRate, int durationInMonths, String customerId) {
        this.loanId = loanId;
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.durationInMonths = durationInMonths;
        this.customerId = customerId;
    }
}