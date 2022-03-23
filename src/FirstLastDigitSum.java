public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int lastDigit = 0;
        int firstDigit = 0;
        int originalNumber = number;
        int reverse = 0;
        int lastDigitOfReversedNumber = 0;

        lastDigit = number % 10;

        while (originalNumber > 0) {
            lastDigitOfReversedNumber = originalNumber % 10;
            reverse = reverse * 10 + lastDigitOfReversedNumber;
            originalNumber /= 10;
        }
        firstDigit = reverse % 10;

        return firstDigit + lastDigit;
    }
}
