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

    public enum  Currency{
        EUR,USD
    }

    Currency currency;

    public EUBank(Currency currency) {
        this.currency = currency;
    }




    @Override
    int getLimitOfWithdrawal() {
        int getLimitOfWithdrawal = 0;
        switch (currency){
            case USD:
                getLimitOfWithdrawal = 2000;
                break;
            case EUR:
                getLimitOfWithdrawal = 2200;
                break;
        }

        return getLimitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        int getLimitOfFunding = 0;
        switch (currency){
            case EUR:
                getLimitOfFunding = 20000;
                break;
            case USD:
                getLimitOfFunding = 10000;
                break;

        }
        return getLimitOfFunding ;
    }

    @Override
    int getMonthlyRate() {
        int getMonthlyRate = 0 ;
        switch (currency){
            case USD:
                getMonthlyRate = 0 ;
                break;
            case EUR:
                getMonthlyRate = 1;

        }
        return getMonthlyRate ;
    }

    @Override
    int getCommission() {
        int getCommission = 0 ;
        switch (currency){
            case USD:
                getCommission = 1;
                break;
            case EUR:
                getCommission = 2;
                break;

        }
        return getCommission ;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
