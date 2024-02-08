package com.teachmeskills.hw9.task3.runner;

import com.teachmeskills.hw9.task3.card.BaseCard;
import com.teachmeskills.hw9.task3.card.BelCard;
import com.teachmeskills.hw9.task3.card.MasterCard;
import com.teachmeskills.hw9.task3.card.VisaCard;
import com.teachmeskills.hw9.task3.card.itransfer.ITransfer;
import com.teachmeskills.hw9.task3.client.Client;
import com.teachmeskills.hw9.task3.fabric.TransferFabric;
import com.teachmeskills.hw9.task3.util.Const;

import java.util.Scanner;

/**
 * Class with method main to run the program
 * contains one class object
 * contains 3 objects of the classes BelCard, MasterCard, VisaCard
 * The client's first and last name are set using a setters
 * The card number and CVV are set using a setters
 * contains a sorted array cards of type BaseCard to display the number of cards on the screen
 * enter from the console card number, CVV, first name, last name and transfer amount
 * methods are called in this class.
 */
public class Runner {
    public static void main(String[] args) {

        Client client = new Client();
        client.setFirstName("Vladislav");
        client.setLastName("Kolos");

        BelCard belCard = new BelCard(1450, "BYN", 10345, 3, 10000);
        MasterCard masterCard = new MasterCard(10050, "USD", 13444, 1, 2000);
        VisaCard visaCard = new VisaCard(-245.55, "EUR", 13403, 2, 3000);
        belCard.setCardNumber("1345 1456 1678 1900");
        belCard.setCvv(788);
        masterCard.setCardNumber("8744 8904 8194 1784");
        masterCard.setCvv(987);
        visaCard.setCardNumber("5723 3938 4849 1934");
        visaCard.setCvv(749);

        int quantity = 0;
        final BaseCard[] cards = new BaseCard[3];
        cards[0] = belCard;
        cards[1] = masterCard;
        cards[2] = visaCard;
        for (int i = 0; i < cards.length; i++) {
            quantity++;
        }

        double commission = 0;
        System.out.println("Enter data for transfer: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter card number: ");
        String cardNumber = scanner.nextLine();
        System.out.println("Enter CVV: ");
        int cvv = scanner.nextInt();
        System.out.println("Enter first name: ");
        String firstName = scanner.next();
        System.out.println("Enter last name: ");
        String lastName = scanner.next();

        if (cardNumber.equals(belCard.getCardNumber()) && cvv == masterCard.getCvv() && firstName.equals(client.getFirstName()) && lastName.equals(client.getLastName())) {
            System.out.println("Enter the amount to be transferred (BYN): ");
            double transferAmount = scanner.nextDouble();
            if (transferAmount > ((masterCard.amountOnCard * Const.USD) + ((Const.COMMISSION * transferAmount) / 100)) || transferAmount < masterCard.minLimit || transferAmount > masterCard.maxLimit) {
                System.out.println("Insufficient funds. Invalid amount. Permissible limit exceeded");
            } else {
                ITransfer iTransfer1 = TransferFabric.transferAmount(belCard.getCardNumber(), masterCard.getCvv(), client.getFirstName(), client.getLastName());
                if (iTransfer1 != null) {
                    System.out.println();
                    System.out.println(client.getFirstName() + " " + client.getLastName());
                    System.out.println("The number of bank cards is: " + quantity);
                    iTransfer1.transferFromCardToCard(belCard, masterCard, visaCard, transferAmount, commission);
                } else {
                    System.out.println("Incorrect data. re-Enter");
                }
            }
        } else if (cardNumber.equals(belCard.getCardNumber()) && cvv == visaCard.getCvv() && firstName.equals(client.getFirstName()) && lastName.equals(client.getLastName())) {
            System.out.println("Enter the amount to be transferred (BYN): ");
            double transferAmount = scanner.nextDouble();
            if (transferAmount > ((visaCard.amountOnCard * Const.EUR) + ((Const.COMMISSION * transferAmount) / 100)) || transferAmount < visaCard.minLimit || transferAmount > visaCard.maxLimit) {
                System.out.println("Insufficient funds. Invalid amount. Permissible limit exceeded");
            } else {
                ITransfer iTransfer2 = TransferFabric.transferAmount(belCard.getCardNumber(), visaCard.getCvv(), client.getFirstName(), client.getLastName());
                if (iTransfer2 != null) {
                    System.out.println();
                    System.out.println(client.getFirstName() + " " + client.getLastName());
                    System.out.println("The number of bank cards is: " + quantity);
                    iTransfer2.transferFromCardToCard(belCard, masterCard, visaCard, transferAmount, commission);
                } else {
                    System.out.println("Incorrect data. re-Enter");
                }
            }
        } else if (cardNumber.equals(masterCard.getCardNumber()) && cvv == belCard.getCvv() && firstName.equals(client.getFirstName()) && lastName.equals(client.getLastName())) {
            System.out.println("Enter the amount to be transferred (BYN): ");
            double transferAmount = scanner.nextDouble();
            if (transferAmount > (belCard.amountOnCard + ((Const.COMMISSION * transferAmount) / 100)) || transferAmount < belCard.minLimit || transferAmount > belCard.maxLimit) {
                System.out.println("Insufficient funds. Invalid amount. Permissible limit exceeded");
            } else {
                ITransfer iTransfer3 = TransferFabric.transferAmount(masterCard.getCardNumber(), belCard.getCvv(), client.getFirstName(), client.getLastName());
                if (iTransfer3 != null) {
                    System.out.println();
                    System.out.println(client.getFirstName() + " " + client.getLastName());
                    System.out.println("The number of bank cards is: " + quantity);
                    iTransfer3.transferFromCardToCard(belCard, masterCard, visaCard, transferAmount, commission);
                } else {
                    System.out.println("Incorrect data. re-Enter");
                }
            }
        } else {
            System.out.println("Incorrect data. re-Enter");
        }
    }
}
