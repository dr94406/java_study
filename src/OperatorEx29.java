package src;

import static java.lang.Integer.toBinaryString;

public class OperatorEx29 {
    public static void main(String[] args) {
        byte p = 10;
        byte n = -10;
        System.out.printf("p = %d \t%s%n", p, toBinaryString(p));
        System.out.printf("~p = %d \t%s%n", p, toBinaryString(~p));
        System.out.printf("~p+1 = %d \t%s%n", p, toBinaryString(~p + 1));
        System.out.printf("~~p = %d \t%s%n", p, toBinaryString(~~p));
    }

    // 10진 정수를 2진수로 변환하는 메서드
    static String toBinaryString(int x) {
        String zero = "0000000000000000000000000000000000";
        String tmp = zero + Integer.toBinaryString(x);
        return tmp.substring(tmp.length() - 32);
    }
}
