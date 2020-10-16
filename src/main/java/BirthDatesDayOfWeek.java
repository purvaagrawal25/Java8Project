import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BirthDatesDayOfWeek {
    public static void main(String[] args) {
        
        List<String> listOfDays = new ArrayList<>();
        for (int i = 1997; i <= 2020; i++) {
            LocalDate date = LocalDate.of(i, 3, 25);

            String day = date.getDayOfWeek().toString();
            listOfDays.add(day);
        }
        System.out.println(listOfDays);

    }
}
