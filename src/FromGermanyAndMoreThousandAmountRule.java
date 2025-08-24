public class FromGermanyAndMoreThousandAmountRule implements FraudRule {

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("Germany") && t.getAmount() > 1000;
    }
}
