package Banks;

/**
 * Created by user on 04.12.2016.
 */
public class Main {




    public static void main(String[] args) {

        ChinaBank chinaBank = new ChinaBank(12,"China",Currency.USD,100,700,55,10000);



        User user1 = new User(10,"Alex",100.00,10,"Ubisoft",100, chinaBank);

            System.out.println(user1);

    }


}