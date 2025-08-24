public class MoreMillionAmmountRule implements FraudRule{

    @Override
    public boolean isFraud(Transaction t) {
        return t.getAmount() > 1000000;
    }
}
