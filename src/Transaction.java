public class Transaction {
    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int sum) {
        this.trader = trader;
        this.amount = sum;
    }

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }
}
