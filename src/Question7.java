//문제 7: for 문을 이용한 팩토리얼 계산
//for 문을 사용하여 입력받은 숫자의 팩토리얼을 계산하는 프로그램을 작성
//힌트: 최대공약수

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요: ");
        int n = sc.nextInt();
        int result = 1;
        for (int i=1; i <= n; i++){
            result *= i;
        }
        System.out.println(result);
    }
}
