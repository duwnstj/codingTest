import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * i는 1~n-2
         * j는 i+1 ~ n-1
         * k는 j+1 ~ n
         * n이 5라 가정
         * i = 1 j = 2 k [3,4,5] 3번
         * i = 1 j = 2 k [4,5] 2번
         * i = 1 j = 2 k [5] 1번
         * i = 2 j = 3 k [4,5] 2번
         * i = 2 j = 3 k [5] 1번
         * i = 3 j = 4 k [5] 1번
         *(3+2+1) +(2+1) + (1) = 10 번
         *         즉 경우의 수를 구하는 문제 !
         *         3가지경우일 때 3*2*1 = 6가지의 경우의 수가 나옴
         *         공식이 n이 5이고 3개의 반복문이 도니까
         *         5*4*3 / 6 = 10
         *         n*(n-1)(n-2)/6 이 공식이 나온다
         *
         * */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Long n = Long.parseLong(br.readLine());
        // 코드1의 수행 횟수 출력
        bw.write(n * (n - 1) * (n - 2) / 6 + "\n");


        // 수행 횟수의 최고차항 차수는 3이다 (n^3의 차수는 3)
        bw.write(3 + "\n");
        bw.flush();

    }
}
