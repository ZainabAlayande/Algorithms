package Algorithm;

import java.time.LocalDate;
public class CalculateAge {

    public static void main(String[] args) {
        System.out.println(getUserAge("11/04/2008"));
    }

    public static int getUserAge(String dateOfBirth) {
        String[] splittedDate = dateOfBirth.split("/");
        String userYearOfBirth = splittedDate[2];
        int convertUserYearOfBirth = Integer.parseInt(userYearOfBirth);

        LocalDate localDate = LocalDate.now();
        int currentYear = localDate.getYear();

        return currentYear - convertUserYearOfBirth;
    }
}
