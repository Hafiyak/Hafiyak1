package Banks;

import java.util.*;

/**
 * Created by user on 01.12.2016.
 */
public class  EUBank extends Bank {


    public EUBank() {

    }

    public EUBank(long id, String bankCountry, java.util.Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital, Currency currency1) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
        this.currency = currency1;
    }

    public enum Currency {
        EUR, USD
    }

    Currency currency;

    public EUBank(Currency currency) {
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

    int getLimitOfFunding() {
        if (this.currency == Currency.EUR) {
            return 1000;
        } else if (this.currency == Currency.USD) {
            return 5000;
        } else {
            return -1;
        }
    }

    int getMonthlyRate() {
        if (this.currency == Currency.EUR) {
            return 1000;
        } else if (this.currency == Currency.USD) {
            return 5000;
        } else {
            return -1;
        }
    }

    int getCommission() {
        if (this.currency == Currency.EUR) {
            return 1000;
        } else if (this.currency == Currency.USD) {
            return 5000;
        } else {
            return -1;
        }
    }

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
