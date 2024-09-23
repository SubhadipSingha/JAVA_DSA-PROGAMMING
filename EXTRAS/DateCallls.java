package EXTRAS;

import java.util.*;

public class DateCallls {
    public static void main(String[] args) {
        Date d = new Date("12/19/2003");
        System.out.println(d);
        GregorianCalendar g= new GregorianCalendar();
        System.out.println(g.getTimeZone());
    }
}
