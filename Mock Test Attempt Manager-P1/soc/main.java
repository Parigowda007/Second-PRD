
public class MockTestAttemptManager {

    public static void main(String[] args) {

        // Hard-coded values
        int[] scores = {48, 57, 68};
        int[] correct = {24, 29, 34};
        int[] incorrect = {26, 21, 16};

        int passMark = 60;
        int maxAttempts = 3;

        int attempt = 0;
        int bestScore = 0;
        boolean passed = false;

        System.out.println("===== MOCK TEST ATTEMPT REPORT =====\n");

        while (attempt < maxAttempts && !passed) {

            int score = scores[attempt];

            if (score > bestScore) {
                bestScore = score;
            }

            System.out.println("Attempt " + (attempt + 1));
            System.out.println("Score : " + score);
            System.out.println("Correct Answers : " + correct[attempt]);
            System.out.println("Incorrect Answers : " + incorrect[attempt]);

            String result = (score >= passMark) ? "Passed" : "Failed";
            System.out.println("Result : " + result);

            if (score >= passMark) {
                passed = true;

                if (score >= 80) {
                    System.out.println("Recommendation : Excellent Performance");
                } else {
                    System.out.println("Recommendation : Good Job");
                }
            } else {
                int remaining = maxAttempts - (attempt + 1);
                System.out.println("Remaining Attempts : " + remaining);

                if (remaining > 0) {
                    System.out.println("Recommendation : Practice and try again.");
                } else {
                    System.out.println("Recommendation : Attend revision classes.");
                }
            }

            System.out.println();

            attempt++;   // Increment operator
        }

        System.out.println("Best Score : " + bestScore);

        if (passed) {
            System.out.println("Final Result : MOCK TEST CLEARED");
            System.out.println("Message : Student passed on attempt " + attempt + ".");
        } else {
            System.out.println("Final Result : MOCK TEST NOT CLEARED");
            System.out.println("Message : Student failed all attempts.");
        }
    }
}
