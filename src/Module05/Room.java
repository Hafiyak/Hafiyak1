package Module05;

/**
 * Created by user on 13.01.2017.
 */

import  java.util.GregorianCalendar;
import  java.util.Objects;

public class Room {

    long id;
    int price;
    int persons;
    GregorianCalendar dateAvailableFrom;
    String hotelName;
    String cityName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public GregorianCalendar getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(GregorianCalendar dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Room(long id, int price, int persons, GregorianCalendar dateAvailableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }
}
