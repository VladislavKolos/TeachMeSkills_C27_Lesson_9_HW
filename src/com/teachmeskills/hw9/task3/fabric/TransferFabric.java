package com.teachmeskills.hw9.task3.fabric;

import com.teachmeskills.hw9.task3.card.BelCard;
import com.teachmeskills.hw9.task3.card.MasterCard;
import com.teachmeskills.hw9.task3.card.VisaCard;
import com.teachmeskills.hw9.task3.card.itransfer.ITransfer;

/**
 * Class with static method to transfer funds.
 */
public class TransferFabric {

    public static ITransfer transferAmount(String cardNumber, int cvv, String firstName, String lastName) {
        if (cardNumber.equals("1345 1456 1678 1900") && (cvv == 987) && (firstName.equals("Vladislav")) && (lastName.equals("Kolos"))) {
            return new MasterCard(10050, "USD", 13444, 1, 2000);
        } else if (cardNumber.equals("1345 1456 1678 1900") && cvv == 749 && (firstName.equals("Vladislav")) && (lastName.equals("Kolos"))) {
            return new VisaCard(-245.55, "EUR", 13403, 2, 3000);
        } else if (cardNumber.equals("8744 8904 8194 1784") && cvv == 788 && (firstName.equals("Vladislav")) && (lastName.equals("Kolos"))) {
            return new BelCard(1450, "BYN", 10345, 3, 10000);
        }
        return null;
    }
}
