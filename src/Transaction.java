public class Transaction {
    private Trader trader;
    private int sum;

    public Transaction(Trader trader, int sum) {
        this.trader = trader;
        this.sum = sum;
    }

    public Trader getTrader() {
        return trader;
    }

    public void setTrader(Trader trader) {
        this.trader = trader;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
