package gr.aueb.cf.model;

import gr.aueb.cf.exceptions.SsnNotValidException;

public class OverdraftAccount extends Account{

    public OverdraftAccount() {}

    public OverdraftAccount(User holder, String iban, double balance) {
        super(holder, iban, balance);
    }

    @Override
    public void withdraw(double amount, String ssn) throws NegativeArraySizeException, SsnNotValidException {
        try {
            if (amount < 0) throw new NegativeArraySizeException();
            if (!isSsnValid(ssn)) throw new SsnNotValidException(ssn);
        } catch (NegativeArraySizeException | SsnNotValidException e) {
            System.out.println("Error: withdraw");
            throw e;
        }

    }
}
