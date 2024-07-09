import java.util.Scanner;

public class MyPyramid {
    public static void main(String[] args) {
        System.out.print("Enter your word : ");
        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();
        char[] charArray = pattern.toCharArray();


        int length = pattern.length();

        for (int i = 0; i < length; i++) {

            for (int j = 0; j < (length - i - 1) * 2; j++) {
                System.out.print(" ");
            }

            for (int cha = i; cha >= 0; cha--) {
                System.out.print(charArray[cha] +  " ");
            }
            for (int las = 1; las <= i; las++) {
                System.out.print(charArray[las] + " ");
            }

            System.out.println();
        }

    }
}
