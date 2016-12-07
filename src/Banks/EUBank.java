package Banks;

/**
 * Created by user on 01.12.2016.
 */
public class  EUBank extends Bank {


    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
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
