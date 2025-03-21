package org.example.model;

public interface Offer {

    public void applyOffer(Transaction transaction);
    public boolean isApplicable(Transaction transaction);
}
