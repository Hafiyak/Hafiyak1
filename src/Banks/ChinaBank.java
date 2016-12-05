package Banks;

import java.util.*;

/**
 * Created by user on 04.12.2016.
 */
public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }



    @Override
    int getLimitOfWithdrawal() {
        if (this.getCurrency() == Currency.EUR) {
            return 1000;
        } else if (this.getCurrency() == Currency.USD) {
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
