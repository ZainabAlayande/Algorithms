package Algorithm;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvertDate {

    public static void main(String[] args) {
        System.out.println(ConvertDate.getDateInFull("17/04/2023"));

    }

    public static String getDateInFull(String date) {
        String[] theDate = date.split("/");
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("EEEE, yyyy-MM-dd");
        LocalDate localDate = LocalDate.of(Integer.parseInt(theDate[2]), Integer.parseInt(theDate[1]),
                Integer.parseInt(theDate[0]));

        return localDate.format(dateFormatter);


            }


}
