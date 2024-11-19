import java.util.Scanner;

public class FacultyData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Faculty Name:");
        String facultyName = scanner.nextLine();

        System.out.println("Enter Last Grade (single character):");
        char lastGrade = scanner.next().charAt(0);

        System.out.println("Enter Last Degree:");
        scanner.nextLine();
        String lastDegree = scanner.nextLine();

        System.out.println("Enter Number of Subjects:");
        int numberOfSubjects = scanner.nextInt();

        System.out.println("Passed (true/false):");
        boolean isPassed = scanner.nextBoolean();

        System.out.println("Faculty Name: " + facultyName);
        System.out.println("Last Grade: " + lastGrade);
        System.out.println("Last Degree: " + lastDegree);
        System.out.println("Number of Subjects: " + numberOfSubjects);
        System.out.println("Pass: " + (isPassed ? "Yes" : "No"));

       
    }
}