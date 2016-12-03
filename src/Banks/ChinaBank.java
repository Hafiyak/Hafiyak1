package Banks;

import java.util.Currency;

import static Banks.Currency.EUR;

/**
 * Created by user on 01.12.2016.
 */
public class ChinaBank  extends  Bank {


    public ChinaBank() {

    }

    public ChinaBank(long id, String bankCountry, java.util.Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital, Currency currency1) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
        this.currency = currency1;
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
        int limitOfWithdrawal = 0  ;
        switch (currency){
            case EUR:
                limitOfWithdrawal = 150;
                break;
            case USD:
                limitOfWithdrawal = 100;
                break;
        }
        return  limitOfWithdrawal ;
    }



    @Override
    int getLimitOfFunding() {
        int getLimitOfFunding = 0;
        switch (currency){
            case EUR:
                getLimitOfFunding = 5000;
                break;
            case USD:
                getLimitOfFunding = 10000;
                break;
        }
        return getLimitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        int getMonthlyRate = 0 ;
        switch (currency){
            case EUR:
                getMonthlyRate = 0;
            case USD:
                getMonthlyRate = 1;
                break;
        }
        return 0;
    }

    @Override
    int getCommission() {
        int getCommission = 0;
        switch (currency){
            case USD:
                getCommission = 5;
                break;
            case EUR:
                getCommission = 5;
                break;
        }
        return getCommission;
    }

    @Override
    double moneyPaidMonthlyForSalary() {

        return 0;
    }
}