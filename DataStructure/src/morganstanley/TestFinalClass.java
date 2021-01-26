package morganstanley;

import java.util.Date;

final class FinalClass {

    private final String key;
    private final int value;
    private final Date date;

    public FinalClass(String key, int value, Date date) {
        this.key = key;
        this.value = value;
        this.date = date;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public Date getDate() {
        return new Date(this.date.getTime());
    }

    public String toString() {
        return key + "\t" + value + "\t" + date;
    }

}

public class TestFinalClass {
    public static void main(String[] args) {
        FinalClass finalObj = new FinalClass("A", 65, new Date());
        System.out.println(finalObj);
        finalObj.getDate().setTime(10000);
        System.out.println(finalObj);
    }
}
