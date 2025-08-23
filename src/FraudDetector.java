public class FraudDetector {

    public boolean isFraud(Transaction transaction){
        if(isPokemon(transaction)){
            return true;
        }
        if (isMoreMillion(transaction)){
            return true;
        }
        if (isSydney(transaction)){
            return true;
        }
        return false;
    }

    private boolean isPokemon(Transaction transaction){
       return transaction.getTrader().getName().equals("Pokemon");
    }

    private boolean isMoreMillion(Transaction transaction){
        return transaction.getAmount() > 1000000;
    }
    private boolean isSydney(Transaction transaction){
        return transaction.getTrader().getCity().equals("Sydney");
    }
}
