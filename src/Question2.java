//문제 2: while 문을 사용한 1부터 10까지의 합
//while 문을 사용하여 1부터 10까지의 숫자를 더한 값을 출력하는 프로그램을 작성

public class Question2 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while(i<=10){
//            sum = sum + i;
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}