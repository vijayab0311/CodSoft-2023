import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Student Grade Calculator");
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Initialize variables to store total and average
        double totalMarks = 0;
        double average;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the marks for Subject " + i + ": ");
            double marks = scanner.nextDouble();
            totalMarks += marks;
        }

        // Calculate the average
        average = totalMarks / numSubjects;

        // Determine the letter grade
        String grade = getLetterGrade(average);

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + average);
        System.out.println("Letter Grade: " + grade);

        scanner.close();
    }

    // Function to determine the letter grade
    public static String getLetterGrade(double average) {
        if (average >= 90) {
            return "A+";
        } else if (average >= 80) {
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
