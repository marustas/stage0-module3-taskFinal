package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        while (number > 0) {
            int digit;
            int sum = 0;
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
            System.out.println(sum);
        }
    }
}
