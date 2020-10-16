import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LeapYearAfterRepublic {
    public static void main(String[] args) {
        List<Integer> listOfLeapYears = new ArrayList<>();
        for (int i = 1950; i <= 2020; i++) {
            LocalDate date = LocalDate.of(i, 1, 26);
            boolean isLeapYear = date.isLeapYear();
            if (isLeapYear)
                listOfLeapYears.add(i);
        }
        System.out.println(listOfLeapYears);
    }
}
