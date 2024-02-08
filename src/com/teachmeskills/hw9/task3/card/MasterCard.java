package com.teachmeskills.hw9.task3.card;

import com.teachmeskills.hw9.task3.card.itransfer.ITransfer;
import com.teachmeskills.hw9.task3.util.Const;

/**
 * The class is a descendant of the class BaseCard
 * the class MasterCard cannot be extended from
 * implements a mandatory method for transferring funds from card to card accepts parameters as input BelCard belCard, MasterCard masterCard, VisaCard visaCard, double transferAmount, double commission.
 */
public final class MasterCard extends BaseCard implements ITransfer {

    public long id;
    public double minLimit;
    public double maxLimit;
    private String cardNumber;
    private int cvv;

    public MasterCard(double amountOnCard, String currency, long id, double minLimit, double maxLimit) {
        super(amountOnCard, currency);
        this.id = id;
        this.minLimit = minLimit;
        this.maxLimit = maxLimit;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public void transferFromCardToCard(BelCard belCard, MasterCard masterCard, VisaCard visaCard, double transferAmount, double commission) {
        System.out.println("MasterCard amount (USD): " + masterCard.amountOnCard);
        transferAmount = transferAmount / Const.USD;
        commission = (Const.COMMISSION * transferAmount) / 100;
        masterCard.amountOnCard = masterCard.amountOnCard - transferAmount - commission;
        System.out.println("MasterCard amount after transfer (USD): " + masterCard.amountOnCard);
        System.out.println("BelCard amount (BYN): " + belCard.amountOnCard);
        transferAmount = transferAmount * Const.USD;
        belCard.amountOnCard = belCard.amountOnCard + transferAmount;
        System.out.println("BelCard amount after transfer (BYN): " + belCard.amountOnCard);
        System.out.println("Transfer fee: (USD) " + commission);
    }
}
