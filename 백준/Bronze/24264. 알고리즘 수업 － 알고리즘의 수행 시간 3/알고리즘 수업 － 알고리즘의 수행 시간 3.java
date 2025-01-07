import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     // 이중 반복문의 시간 복잡도를 구하는 문제
     // 첫번째 반복문도 n까지, 두번째반복문도 n까지
     // 즉 f(n)= n^2이다.
     // n의 조건이  n(1 ≤ n ≤ 500,000)이기때문에 long으로 변경 

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println((long)n*n);
    System.out.println(2);
    }
}