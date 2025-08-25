public class FromSydneyRule implements FraudRule{

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equals("Sydney");
    }

    @Override
    public String getRuleName() {
        return  getClass().getName();
    }
}
