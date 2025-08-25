public class Main {
    public static void main(String[] args) {
        Trader trader1 = new Trader("Roman", "Belarus", "Krichev");
        Trader trader2 = new Trader("Alesya", "America", "Chikago");

        Transaction transaction1 = new Transaction(trader1, 1000);
        Transaction transaction2 = new Transaction(trader2, 20000000);

        System.out.println(new FraudDetector().isFraud(transaction2));
    }
}
