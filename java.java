// import java.util.Scanner;

// class PalindromeCheck {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number to check if it's a palindrome: ");
//         int number = scanner.nextInt();
//         int originalNumber = number;
//         int reversedNumber = 0;

//         while (number > 0) {
//             int digit = number % 10;
//             reversedNumber = reversedNumber * 10 + digit;
//             number /= 10;
//         }

//         if (originalNumber == reversedNumber) {
//             System.out.println(originalNumber + " is a palindrome.");
//         } else {
//             System.out.println(originalNumber + " is not a palindrome.");
    
//         scanner.close();
//     }
// }

// import java.util.Scanner;

// public class prime {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = scanner.nextInt();
//         scanner.close();

//         if (num <= 1) {
//             System.out.println(num + " is not a prime number.");
//             return; 
//         }

//         boolean isPrime = true; // Assume it's prime initially

//         for (int i = 2; i * i <= num; i++) {
//             if (num % i == 0) { // If num is perfectly divisible by 'i'
//                 isPrime = false; // It's not a prime number
//                 break;           // No need to check further, break the loop
//             }
//         }
//         if (isPrime) {
//             System.out.println(num + " is a prime number.");
//         } else {
//             System.out.println(num + " is not a prime number.");
//         }
//     }
// }          


import java.util.Scanner;

public class armstrong{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int originalNumber = number;
        int remainder;
        int result = 0;
        int numberOfDigits = 0;

        int temp = number;
        while (temp != 0) {
            temp /= 10;
            numberOfDigits++;
        }

        int temp1 = number;
        while (temp1 != 0) {
            remainder = temp1 % 10;
            result += Math.pow(remainder, numberOfDigits);
            temp1 /= 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number.");
        }
    }
}   