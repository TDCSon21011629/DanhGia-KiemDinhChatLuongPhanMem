import java.util.Scanner;

public class CheckEvenOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên: ");
        int number = scanner.nextInt();

        // Kiểm tra số chẵn hay số lẻ
        if (number % 2 == 0) {
            System.out.println(number + " là số chẵn.");
        } else {
            System.out.println(number + " là số lẻ.");
        }

        scanner.close();
    }

    public String checkNumber(int number) {
        if (number % 2 == 0) {
            return number + " là số chẵn.";
        } else {
            return number + " là số lẻ.";
        }
    }
}

