package Banks;

/**
 * Created by user on 03.12.2016.
 */
public class  BankSystemImpl implements  BankSystem {




    @Override
    public void withdrawOfUser(User user, int amount ) {
        amount = 50;
        int commission = user.getBank().getCommission();
        double balance = user.getBalance();
        int limit  = user.getBank().getLimitOfWithdrawal();


        if(amount <= limit) {
            double commissionMoney = amount * 5 / 100;
            double total = balance - (amount + commissionMoney);
            if (total >= 0) {
                user.setBalance(total);
            }
        }

    }



    @Override
    public void fundUser(User user, int amount) {
            if (amount <= user.getBank().getLimitOfFunding()){
                user.setBalance(user.getBalance() + amount);
            }
        }





    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        amount = 100;
        double balance = fromUser.balance;
        double balance1= toUser.balance;
        int limitofwithdrawal = fromUser.getBank().getLimitOfWithdrawal();
        int limitofaund = toUser.bank.getLimitOfFunding();

        if(amount <=limitofwithdrawal && amount <= limitofaund){

        }


    }

    @Override
    public void paySalary(User user) {
        double Balance = user.getBalance();
        int limitOfFunding = user.getBank().getLimitOfFunding();
        int Salary  = user.getSalary();

        if (Salary <= limitOfFunding) {
            double total = Balance + Salary   ;
            user.setBalance(total);
        }


    }
}





