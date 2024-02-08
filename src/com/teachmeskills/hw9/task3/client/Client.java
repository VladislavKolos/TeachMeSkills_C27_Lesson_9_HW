package com.teachmeskills.hw9.task3.client;

/**
 * Class Client for type of clients
 * all fields are private
 * contains getters and setters.
 */
public class Client {

    private String firstName;
    private String lastName;
    private String passNumber;
    private String dateOfBirth;
    private int postCode;
    private String country;
    private String city;
    private String street;
    private int houseNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassNumber() {
        return passNumber;
    }

    public void setPassNumber(String passNumber) {
        if (passNumber.startsWith("AB")) {
            this.passNumber = passNumber;
        } else if (passNumber.startsWith("BM")) {
            this.passNumber = passNumber;
        } else if (passNumber.startsWith("HB")) {
            this.passNumber = passNumber;
        } else if (passNumber.startsWith("KH")) {
            this.passNumber = passNumber;
        } else if (passNumber.startsWith("MP")) {
            this.passNumber = passNumber;
        } else if (passNumber.startsWith("MC")) {
            this.passNumber = passNumber;
        } else if (passNumber.startsWith("KB")) {
            this.passNumber = passNumber;
        } else if (passNumber.startsWith("PP")) {
            this.passNumber = passNumber;
        } else if (passNumber.startsWith("SP")) {
            this.passNumber = passNumber;
        } else if (passNumber.startsWith("DP")) {
            this.passNumber = passNumber;
        } else {
            System.out.println("re-Enter. Incorrect passNumber");
        }
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country.equals("Belarus")) {
            this.country = country;
        } else {
            System.out.println("re-Enter. Incorrect country");
        }

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

}
