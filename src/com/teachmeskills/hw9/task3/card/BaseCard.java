package com.teachmeskills.hw9.task3.card;

/**
 * Abstract parent class for type of cards from which only three classes are inherited (BelCard, MasterCard, VisaCard).
 */
public abstract sealed class BaseCard permits BelCard, MasterCard, VisaCard {

    public double amountOnCard;
    public String currency;

    public BaseCard(double amountOnCard, String currency) {
        this.amountOnCard = amountOnCard;
        this.currency = currency;
    }

}
