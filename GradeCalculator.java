import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. 提示並讀取三項成績
        System.out.print("Homework: ");
        double homework = input.nextDouble();

        System.out.print("Midterm: ");
        double midterm = input.nextDouble();

        System.out.print("Final exam: ");
        double finalExam = input.nextDouble();

        // 2. 計算加權總分
        double total = homework * 0.2
                     + midterm * 0.3
                     + finalExam * 0.5;

        // 3. 及格判斷（包含 60 分，所以用 >=）
        boolean passed = total >= 60;

        // 選做：檢查三項成績是否都在 0–100
        boolean valid = homework >= 0 && homework <= 100
                     && midterm >= 0 && midterm <= 100
                     && finalExam >= 0 && finalExam <= 100;

        // 4. 顯示結果
        System.out.printf("Total: %.1f%n", total);
        System.out.println("Passed: " + passed);
        System.out.println("Valid: " + valid);

        input.close();
    }
}
