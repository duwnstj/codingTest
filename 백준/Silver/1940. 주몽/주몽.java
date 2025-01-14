import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * 슈도 코드
         * 첫째 줄 N(재료의 개수) 입력 받기
         * 둘째 줄 M(갑옷을 만드는데 필요한 수)
         * N개의 재료들이 가지는 고유한 번호(재료+재료 =M)
         * for(N){
         *     재료들 배열에 저장
         * }
         * 배열 오름차순 정렬
         * count 초기화,i,j 초기화
         * while(i<j){
         *     if(i+j<M) i++
         *     if(i+j>M) j--
         *     if(i+j==M) count++ i++ j--
         * }
         * 출력 : 갑옷을 만들 수 있는 개수 M
         *
         * */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int count = 0;
        int i = 0;
        int j = N - 1;

        while (i < j) {
            if (A[i] + A[j] < M) i++;
            else if (A[i] + A[j] > M) j--;
            else {
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);

    }
}
