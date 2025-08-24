public class FraudDetector {

    public boolean isFraud(Transaction transaction){
        if(isPokemon(transaction) || isMoreMillionAmmount(transaction) || isFromSydney(transaction) ||
                isFromJamayka(transaction) || isFromGermanyAndMoreThousand(transaction)){
            return true;
        }
        return false;
    }

    private boolean isPokemon(Transaction transaction){
       return transaction.getTrader().getName().equals("Pokemon");
    }

    private boolean isMoreMillionAmmount(Transaction transaction){
        return transaction.getAmount() > 1000000;
    }

    private boolean isFromSydney(Transaction transaction){
        return transaction.getTrader().getCity().equals("Sydney");
    }

    private boolean isFromJamayka(Transaction transaction){
        return transaction.getTrader().getCountry().equals("Jamayka");
    }

    private boolean isFromGermanyAndMoreThousand(Transaction transaction) {
        return transaction.getTrader().getCountry().equals("Germany") && transaction.getAmount() > 1000;
    }
}
