import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Cities {
    public static void main(String[] args) {

        List<String> listOfCities = Arrays.asList("delhi", "china", "Chennai", "canada");
        List<String> filteredListOfCities =
                listOfCities.stream()
                        .map(String::toUpperCase)
                        .filter(s -> s.startsWith("C")).sorted().collect(Collectors.toList());

        System.out.println(filteredListOfCities);
    }

}