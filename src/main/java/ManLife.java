
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

class ManLife {
    public static void main(String[] args) {
        LocalDateTime birthDate = LocalDateTime.of(1990, 1, 20, 10, 20, 30);
        LocalDateTime deathDate = LocalDateTime.of(1995, 1, 20, 10, 20, 30);
        lifeSpan(birthDate, deathDate);
    }

    static void lifeSpan(LocalDateTime birth, LocalDateTime death) {

        long between = Duration.between(birth,death).getSeconds();
        System.out.println("The duration of a man's life :"+between+" seconds");
    }
}

