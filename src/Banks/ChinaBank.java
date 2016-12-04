package Banks;

import java.util.*;

/**
 * Created by user on 04.12.2016.
 */
public class ChinaBank extends Bank {

    ChinaBank(){

    }

    public ChinaBank(long id, String bankCountry, java.util.Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public enum Currency {
        EUR,USD
    }

    Currency currency;

    public ChinaBank(Currency currency) {
        this.currency = currency;
    }

    @Override
    int getLimitOfWithdrawal() {
        if (this.currency == Currency.EUR) {
            return 1000;
        } else if (this.currency == Currency.USD) {
            return 5000;
        } else {
            return -1;
        }
    }

    @Override
    int getLimitOfFunding() {
        if (this.currency == Currency.EUR) {
            return 1000;
        } else if (this.currency == Currency.USD) {
            return 5000;
        } else {
            return -1;
        }
    }

    @Override
    int getMonthlyRate() {
        if (this.currency == Currency.EUR) {
            return 1000;
        } else if (this.currency == Currency.USD) {
            return 5000;
        } else {
            return -1;
        }
    }

    @Override
    int getCommission() {
        if (this.currency == Currency.EUR) {
            return 1000;
        } else if (this.currency == Currency.USD) {
            return 5000;
        } else {
            return -1;
        }
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        if (this.currency == Currency.EUR) {
            return 1000;
        } else if (this.currency == Currency.USD) {
            return 5000;
        } else {
            return -1;
        }
    }
}
