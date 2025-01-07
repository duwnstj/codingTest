import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 이중 반복문의 실제 시간 복잡도를 구하는 문제
        // 첫 번째 반복문(i)은 1부터 n-1까지 반복
        // 두 번째 반복문(j)은 i+1부터 n까지 반복
        // 예를 들어, n이 7일 때:
        // i = 1일 때, j는 [2, 3, 4, 5, 6, 7] -> 6번 반복
        // i = 2일 때, j는 [3, 4, 5, 6, 7] -> 5번 반복
        // i = 3일 때, j는 [4, 5, 6, 7] -> 4번 반복
        // i = 4일 때, j는 [5, 6, 7] -> 3번 반복
        // i = 5일 때, j는 [6, 7] -> 2번 반복
        // i = 6일 때, j는 [7] -> 1번 반복
        // 따라서 전체 실행 횟수는 1부터 n-1까지의 합이므로, 등차수열의 합으로 구할 수 있다.
        // 등차수열의 합 공식은 n(n-1)/2이다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Long n = Long.parseLong(br.readLine());
        // 코드1의 수행 횟수 출력
        bw.write(n * (n - 1) / 2+"\n");

        // 수행 횟수의 최고차항 차수는 2이다 (n^2의 차수는 2)
        bw.write(2+"\n");
        bw.flush();

    }
}
