import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /**
         * 슈도 코드
         N(수열의 길이) , S(부분합과 비교)
         수열 A 배열 저장
         minLength, start(0) ,end(0),sum(0) 초기화
         while(end<N){
         end++
         while(sum>=S){
         minLength = Math.min(int최소값,end-start) 최소값 갱신
         start++
         }
         }
         출력(minLength>0? minLength : 0 ;
         * */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] A = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int sum = 0;

        while (end < N) {
            sum += A[end];
            end++;
            while (sum >= S) {
                minLength = Math.min(minLength, end - start);
                sum -= A[start];
                start++;
            }
        }
        System.out.println(minLength == Integer.MAX_VALUE ? 0 : minLength);

    }
}
