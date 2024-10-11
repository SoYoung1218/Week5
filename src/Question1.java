//문제 1: for 문을 이용한 구구단 출력
//for 문을 사용하여 구구단 중 7단을 출력하는 프로그램을 작성

public class Question1 {
    public static void main(String[] args) {
        for(int i=1; i<=9; i++){
            System.out.println("7 * "+i+" = "+7*i);
        }
    }
}

/*구구단 전체 출력
public class Question1 {
    public static void main(String[] args) {
        for(int i=2; i<=9; i++){
            for(int j=1; j<=9; j++){
                System.out.print(i+" * "+j+" = "+j*i +"\t");
            }
            System.out.println("");

        }
    }
}
*/