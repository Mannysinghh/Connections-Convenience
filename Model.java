import javax.swing.*;
import java.util.GregorianCalendar;

public class Model {
    int quality;
    int price;
    int distance;
    int time;
    int day;
    int month;
    int year;
    int currentMonth;
    int currentYear;


    public Model(){
        GregorianCalendar cal = new GregorianCalendar();
        day = cal.get(GregorianCalendar.DAY_OF_MONTH);
        month = cal.get(GregorianCalendar.MONTH);
        year = cal.get(GregorianCalendar.YEAR);
        currentMonth = month;
        currentYear = year;
    }
    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }



}
