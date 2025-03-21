package org.example.model;

import java.util.Objects;

public class PercentageOffer implements Offer{
    @Override
    public void applyOffer(Transaction transaction) {
        if(isApplicable(transaction))
            System.out.println("Applying Offer of Percentage");
    }

    @Override
    public boolean isApplicable(Transaction transaction) {
        if(Objects.isNull(transaction)) {
            System.out.println("Not a valid transaction");
        }
        return transaction.getAmount() > 200;
    }
}
