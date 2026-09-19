package model;

public interface InterestBearing {

    default double yearlyInterest() {
        Account account = (Account) this;

        return account.getBalance() * account.interestRate() / 100;
    }
}