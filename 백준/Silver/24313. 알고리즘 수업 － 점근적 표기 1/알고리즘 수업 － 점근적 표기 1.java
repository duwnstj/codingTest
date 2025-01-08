import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        /**
         * f(n) <= c*g(n)  c  n0
         * f(n) = a1*n+a0  a1*n0+a0 <= c*n0
         * 첫번째조건  : a1*n0+a0 <= c*n0
         * 두번째 조건 : n이 점점 커지게 될 때 a0 상수의 값은 영향을 거의 미치지 않는다
         * a1의 값에 따라 n의 커짐 속도가 빠르게 증가함 따라서 a1<= c 라는 조건이 나오게 된다.
         *
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        boolean a = a1*n0+a0 <= c*n0;
        boolean b = a1<=c;

        if(a && b ){
            bw.write(1+"\n");
        }else{
            bw.write(0+"\n");
        }
        bw.flush();

    }
}
