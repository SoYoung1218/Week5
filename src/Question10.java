//문제 10: break 문을 사용한 1부터 n까지의 합
//용자가 입력한 n까지 숫자를 더한 후 n >= 100일 때 합을 출력하고,
// break로 종료하는 프로그램을 작성

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n 값을 입력하세요: ");
        int n = scanner.nextInt();

        int sum = 0;


        for (int i = 1; i <= n; i++) {
            sum += i;


            if (n >= 100) {
                System.out.println("n이 100 이상입니다. 합은 " + sum + "입니다.");
                break;
            }
        }
        if (n < 100) {
            System.out.println("n이 100 미만입니다. 합은 " + sum + "입니다.");
        }

        scanner.close();
    }
}