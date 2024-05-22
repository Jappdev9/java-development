import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        double[] testScores = {78, 85, 92, 64, 72, 88, 91, 68, 75, 83};

        double average = calculateAverage(testScores);
        double highScore = findHighScore(testScores);
        double lowScore = findLowScore(testScores);
        double median = calculateMedian(testScores);

        System.out.println("Average score: " + average);
        System.out.println("High score: " + highScore);
        System.out.println("Low score: " + lowScore);
        System.out.println("Median score: " + median);
    }

    public static double calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    public static double findHighScore(double[] scores) {
        double max = scores[0];
        for (double score : scores) {
            if (score > max) {
                max = score;
            }
        }
        return max;
    }

    public static double findLowScore(double[] scores) {
        double min = scores[0];
        for (double score : scores) {
            if (score < min) {
                min = score;
            }
        }
        return min;
    }

    public static double calculateMedian(double[] scores) {
        Arrays.sort(scores);
        int middle = scores.length / 2;
        if (scores.length % 2 == 0) {
            return (scores[middle - 1] + scores[middle]) / 2.0;
        } else {
            return scores[middle];
        }
    }
}