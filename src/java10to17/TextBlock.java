package java10to17;

// standard in java 15, previews in java 13
// it gives output on same format given
public class TextBlock {
    public static void main(String[] args) {
        String textBlock = """
                My
                Name is
                Ritam!
                """;
        System.out.println(textBlock);
    }
}
