//문제 10: break 문을 사용한 1부터 n까지의 합
//용자가 입력한 n까지 숫자를 더한 후 n >= 100일 때 합을 출력하고,
// break로 종료하는 프로그램을 작성

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요: ");
        int n  = sc.nextInt();
        int sum = 0;

        for (int i=1; i<=n; i++) {
            sum += i;
            if(i>=100){
                break;
            }
        }

        System.out.println("100 이하까지의 합은 " + sum);
    }
}

