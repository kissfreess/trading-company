public class FraudDetector {

    public boolean isFraud(Transaction transaction){
       return new PokemonRule().isFraud(transaction) ||
               new FromJamaykaRule().isFraud(transaction) ||
               new FromSydneyRule().isFraud(transaction) ||
               new FromGermanyAndMoreThousandAmountRule().isFraud(transaction) ||
               new MoreMillionAmmountRule().isFraud(transaction);
    }
}
