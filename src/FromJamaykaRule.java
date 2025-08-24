public class FromJamaykaRule implements FraudRule{

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("Jamayka");
    }
}
