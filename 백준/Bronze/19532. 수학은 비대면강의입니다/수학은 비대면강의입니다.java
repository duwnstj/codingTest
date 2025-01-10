import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        /**
         * ax +by = c
         * dx + ey = f
         * x,y  -999<= x,y <=999
         * rP
         *
         * 입력 : a,b,c,d,e,f (공백으로 구분) StringTokenizer
         * 출력 : x,y ( 공백으로 구분) StringTokenizer
         */
        Scanner sc = new Scanner(System.in);
        String list = sc.nextLine();
        StringTokenizer st = new StringTokenizer(list);

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        // detA      detAx     detAy
        //[a  b]     [c  b]    [a c]
        //[d  e]     [f  e]    [d f]
        //계수행렬 판별식
        int determinant = a * e - b * d;

        // x 와 y의 값을 가짐
        if (determinant != 0) {
            int x = (c * e - b * f) / determinant;
            int y = (a * f - c * d) / determinant;
            System.out.println(x + " " + y);
        }


    }
}
