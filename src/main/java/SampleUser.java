import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class SampleUser {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();

        list.add(new User(1, "John", 22, "Noida"));
        list.add(new User(24, "Gaurav", 18, "Delhi"));
        list.add(new User(15, "David", 19, "Delhi"));
        list.add(new User(2, "Sam", 21, "Noida"));
        list.add(new User(10, "Tim", 20, "Delhi"));
        list.add(new User(5, "Ria", 18, "Delhi"));

        List<String> filteredList1 = list.stream()
                .filter(user -> user.age > 18)
                .filter(user -> user.address.equalsIgnoreCase("Delhi"))
                .map(user -> user.name).collect(Collectors.toList());
        System.out.println(filteredList1);

        List<String> filteredList2 = list.stream()
                .filter(user -> user.id > 10)
                .filter(user -> user.age < 20)
                .map(user -> user.name).collect(Collectors.toList());
        System.out.println(filteredList2);

        List<String> filteredList3 = list.stream()
                .filter(user -> user.age % 2 == 0)
                .map(user -> user.name).collect(Collectors.toList());
        System.out.println(filteredList3);

        List<String> filteredList4 = list.stream()
                .filter(user -> user.age == 18)
                .filter(user -> user.address.equalsIgnoreCase("Delhi"))
                .map(user -> user.name).collect(Collectors.toList());
        System.out.println(filteredList4);

    }
}

