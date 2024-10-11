//문제 5: continue 문을 사용한 짝수 출력
//1부터 10까지의 숫자 중 짝수만 출력하는 프로그램을 작성

public class Question5 {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            if(i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}