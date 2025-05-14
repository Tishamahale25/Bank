class TransactionHistory {
    String transactionId ;
        String sender;
        String receiver ;
        double amount;
        String status;
        String date ;


    TransactionHistory(String transactionId, String sender, String receiver,double amount,String status,String date) {
        this.transactionId = transactionId;
        this.sender = sender;
        this.receiver =receiver;
        this.amount =amount;
        this.status =status;
        this.date =date;
    }

    void displayCustomerInfo() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Sender: " + sender);
        System.out.println("Receiver: " + receiver);
        System.out.println("Amount: " + amount);
        System.out.println("Status: " + status);
        System.out.println("Date: " +date);

    }

    public static void main(String[] args) {
        TransactionHistory t = new TransactionHistory("1001", "Akash","Vaishnavi",1500000.0,"successfull","01-04-2024");
        t.displayCustomerInfo();
    }}
}