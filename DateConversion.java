package Algorithm;
import java.util.Objects;

public class DateConversion {

    public static void main(String[] args) {

        String date = "01/11/1970";
        System.out.print(date.charAt(0));
        System.out.print(date.charAt(1));
        System.out.print(date.charAt(2));
        System.out.print(conversion(date));
        System.out.print(date.charAt(5));
        System.out.print(date.charAt(6));
        System.out.print(date.charAt(7));
        System.out.print(date.charAt(8));
        System.out.print(date.charAt(9));
    }

    public static String conversion(String date) {
        String[] array = date.split("/");

        if (Objects.equals(array[1], "01"))
            return "January";

        if (Objects.equals(array[1], "02"))
            return "Febraury";

        if (Objects.equals(array[1], "03"))
            return "March";

        if (Objects.equals(array[1], "04"))
            return "April";

        if (Objects.equals(array[1], "05"))
            return "May";

        if (Objects.equals(array[1], "06"))
            return "June";

        if (Objects.equals(array[1], "07"))
            return "July";

        if (Objects.equals(array[1], "08"))
            return "August";

        if (Objects.equals(array[1], "09"))
            return "September";

        if (Objects.equals(array[1], "10"))
            return "October";

        if (Objects.equals(array[1], "11"))
            return "November";

        if (Objects.equals(array[1], "12"))
            return "December";


        return "Invalid";
    }
}
