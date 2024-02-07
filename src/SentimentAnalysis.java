import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SentimentAnalysis {
    private static final Set<String> POSITIVE_WORDS = new HashSet<>(Arrays.asList(
            "happy", "joy", "love", "excellent", "good", "great", "positive", "fortunate", "delight", "bliss"
            // Add more positive words here
    ));

    private static final Set<String> NEGATIVE_WORDS = new HashSet<>(Arrays.asList(
            "sad", "hate", "terrible", "bad", "poor", "negative", "unfortunate", "awful", "miserable", "pain"
            // Add more negative words here
    ));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text string for sentiment analysis:");
        String input = scanner.nextLine().toLowerCase();

        String sentiment = analyzeSentiment(input);
        System.out.println("The sentiment of the text is: " + sentiment);
    }

    private static String analyzeSentiment(String text) {
        int positiveCount = 0;
        int negativeCount = 0;

        for (String word : text.split("\\s+")) {
            if (POSITIVE_WORDS.contains(word)) {
                positiveCount++;
            } else if (NEGATIVE_WORDS.contains(word)) {
                negativeCount++;
            }
        }

        if (positiveCount > negativeCount) {
            return "Positive";
        } else if (negativeCount > positiveCount) {
            return "Negative";
        } else {
            return "Neutral";
        }
    }
}
