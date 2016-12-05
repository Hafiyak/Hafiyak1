package Banks;

/**
 * Created by user on 03.12.2016.
 */
public class  BankSystemImpl implements  BankSystem {


    int b = 100;


    @Override
    public void withdrawOfUser(User user, int amount) {
         amount = 100;
    }


    @Override
    public void fundUser(User user, int amount) {
        amount = 150;
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        amount = 100;

    }

    @Override
    public void paySalary(User user) {
        int paySalary = 200;

    }
}





