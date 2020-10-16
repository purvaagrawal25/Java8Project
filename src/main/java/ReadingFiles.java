import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadingFiles {
    public static void main(String[] args) {
        String filePath = "/home/knoldus/IdeaProjects/Java8Project/src/main/TextFile.txt";
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            Map<String, Long> frequencyOfEachWord = stream.flatMap(line -> Arrays.stream(line.split(" ")))
                    .map(String::toLowerCase)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            System.out.println(frequencyOfEachWord);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
