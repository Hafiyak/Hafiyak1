package Module05;

/**
 * Created by user on 13.01.2017.
 */
public interface API {


    public Room[] getRooms();
    Room[] findRooms(int price, int persons, String city, String hotel);


}
