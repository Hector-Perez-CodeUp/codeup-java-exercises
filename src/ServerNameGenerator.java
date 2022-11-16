
public class ServerNameGenerator {
    static String[] adjectives = {"fancy", "happy", "itchy", "large", "mammoth", "lazy", "jolly", "silly", "thankful", "stocky"};
    static String[] nouns = {"apple", "car", "house", "toy", "koala", "earth", "bed", "dog", "cat", "mouse"};

    public static void main(String[] args) {
        System.out.println(adjectives[ranString(adjectives)] + "-" + nouns[ranString(nouns)]);
    }

    public static int ranString(String[] arr) {
        return (int) Math.floor(Math.random() * (arr.length - 1));
    }
}
