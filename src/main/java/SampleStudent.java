import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class SampleStudent {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(1, "Pansy", 22,(new Address("Delhi", null))));
        list.add(new Student(2, "Parul", 18, (new Address("Noida", Optional.of("India")))));
        list.add(new Student(3, "Pankaj", 19,(new Address( "Jhansi", null))));
        list.add(new Student(4, "Sam", 21,(new Address( "Kanpur", Optional.of("India")))));
        list.add(new Student(4, "Tim", 20, (new Address("Delhi", null))));

     /*   List<String> filteredList1 = list.stream()
                .filter(student -> student.add.secondaryAddress == null)
                .map(student -> student.name).collect(Collectors.toList());
        System.out.println(filteredList1);
*/
        List<String> filteredList2 = list.stream()
                .filter(student->student.name.startsWith("P"))
                .filter(student-> student.add.secondaryAddress == null)
                .map(student -> student.name).collect(Collectors.toList());
        System.out.println(filteredList2);
    }
}

