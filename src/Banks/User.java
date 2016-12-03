package Banks;

import Banks.Bank;
import Banks.ChinaBank;
import Banks.EUBank;
import Banks.USBank;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Currency;

/**
 * Created by user on 03.12.2016.
 */
public class User {
    public static void main(String[] args) {

        ChinaBank chinaBank;
        chinaBank = new ChinaBank();

        System.out.println(chinaBank.getLimitOfWithdrawal());
        System.out.println(chinaBank.getCommission());
        System.out.println(chinaBank.getLimitOfFunding());
        System.out.println(chinaBank.getMonthlyRate());
        System.out.println(chinaBank.moneyPaidMonthlyForSalary());


        System.out.println("..........");

        EUBank euBank = new EUBank();

        System.out.println(euBank.getLimitOfWithdrawal());
        System.out.println(euBank.moneyPaidMonthlyForSalary());
        System.out.println(euBank.getMonthlyRate());
        System.out.println(euBank.getLimitOfFunding());
        System.out.println(euBank.getCommission());

        System.out.println("........");

        USBank usBank = new USBank();

        System.out.println(usBank.getCommission());
        System.out.println(usBank.getLimitOfFunding());
        System.out.println(usBank.getMonthlyRate());
        System.out.println(usBank.moneyPaidMonthlyForSalary());
        System.out.println(usBank.getLimitOfWithdrawal());


    }

}
