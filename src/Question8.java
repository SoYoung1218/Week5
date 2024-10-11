//문제 8: while 문을 사용한 100 이하 홀수의 합
//while 문을 사용하여 1부터 100까지의 홀수의 합을 구하는 프로그램을 작성

public class Question8 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i <= 100) {
            if(i % 2 !=0){
                sum += i;
            }
            i += 2;
        }

        System.out.println("1부터 100까지의 홀수의 합: " + sum);
    }
}