import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 수를 입력하세요 : ");
        int a = sc.nextInt();

        System.out.print("두 번째 수를 입력하세요 : ");
        int b = sc.nextInt();


        System.out.print("연산자를 선택하세요 (+), (-), (/), (*)");
        String op = sc.next();

        switch (op){
            case "+":
                System.out.print(a+b);
                break;
            case "-":
                System.out.print(a-b);
                break;
            case "/":
                System.out.print(a/b);
                break;
            case "*":
                System.out.print(a*b);
                break;
            default:
                System.out.print("올바른 연산자를 입력하세요");
                break;
        }
        sc.close();
    }
}
