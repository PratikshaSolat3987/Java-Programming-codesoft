import java.util.*;

public class QuizApp {
    private static Map<String, List<String>> quizQuestions = new HashMap<>();
    private static Map<String, String> correctAnswers = new HashMap<>();
    private static int score = 0;

    public static void main(String[] args) {
        initializeQuiz();
        startQuiz();
        displayResult();
    }

    private static void initializeQuiz() {
        quizQuestions.put("What is the capital of France?", Arrays.asList("A. Paris", "B. London", "C. Berlin", "D. Rome"));
        correctAnswers.put("What is the capital of France?", "A");
        // Add more quiz questions and correct answers here
    }

    private static void startQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (String question : quizQuestions.keySet()) {
            System.out.println(question);
            List<String> options = quizQuestions.get(question);
            for (String option : options) {
                System.out.println(option);
                System.out.println(option);
            }

            System.out.print("Enter your answer: ");
            String userAnswer = scanner.next();

            if (userAnswer.equalsIgnoreCase(correctAnswers.get(question))) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + correctAnswers.get(question));
            }
        }
    }

    private static void displayResult() {
        System.out.println("Quiz completed!");
        System.out.println("Your final score is: " + score);
        // Display summary of correct/incorrect answers
    }
}

