import java.util.List;

public class FraudDetector {

    private List<FraudRule> rules = List.of(new PokemonRule(),
                                            new MoreMillionAmmountRule(),
                                            new FromSydneyRule(),
                                            new FromJamaykaRule(),
                                            new FromGermanyAndMoreThousandAmountRule());

    public FraudDetectionResult isFraud(Transaction transaction){
        for (FraudRule rule : rules) {
            if (rule.isFraud(transaction)){
                return new FraudDetectionResult(true, rule.getRuleName());
            }
        }
        return new FraudDetectionResult(false, null);
    }
}
