//문제 6: 두 수의 최대공약수 (while 문 사용)
//두 개의 숫자를 입력받아 그 숫자들의 최대공약수를 구하는 프로그램을 작성
//힌트: 최대공약수



import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력해주세요: ");
        int a = sc.nextInt();
        System.out.println("두 번째 숫자를 입력해주세요: ");
        int b = sc.nextInt();

        while(b != 0){
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        System.out.println("최대공약수 는 : " + a);
    }
}