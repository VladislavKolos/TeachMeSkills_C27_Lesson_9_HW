package com.teachmeskills.hw9.task3.card.itransfer;

import com.teachmeskills.hw9.task3.card.BelCard;
import com.teachmeskills.hw9.task3.card.MasterCard;
import com.teachmeskills.hw9.task3.card.VisaCard;

/**
 * Interface with mandatory method of transferring funds from card to card accepts parameters as input BelCard belCard, MasterCard masterCard, VisaCard visaCard, double transferAmount, double commission.
 */
public interface ITransfer {

    void transferFromCardToCard(BelCard belCard, MasterCard masterCard, VisaCard visaCard, double transferAmount, double commission);

}
