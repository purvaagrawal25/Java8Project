import java.util.Optional;

public class Address {
    public String primaryAddress;
    public Optional<String> secondaryAddress;

    public Address(String Primary, Optional<String> Secondary) {
        primaryAddress = Primary;
        secondaryAddress = Secondary;
    }
}
