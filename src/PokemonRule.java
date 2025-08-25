public class PokemonRule implements FraudRule {

    @Override
    public boolean isFraud(Transaction t) {
        return t.getTrader().getName().equals("Pokemon");
    }

    @Override
    public String getRuleName() {
        return getClass().getName();
    }
}
