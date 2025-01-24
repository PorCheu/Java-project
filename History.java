// History.java
public class History {
    private String historyId;
    private String transactionType; // Example: "Loan Repayment", "Loan Disbursement"
    private String date;
    private double amount;
    private String loanId; // Reference to the associated loan

    // Constructor
    public History(String historyId, String transactionType, String date, double amount, String loanId) {
        this.historyId = historyId;
        this.transactionType = transactionType;
        this.date = date;
        this.amount = amount;
        this.loanId = loanId;
    }
}