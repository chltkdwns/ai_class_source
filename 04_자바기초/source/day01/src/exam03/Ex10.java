package exam03;

public class Ex10 {
    public static void main(String[] args){
        int num1 = 10;
        double num2 = 10.123;
        /**
         * 연산은 같은 자료형끼리만 가능
         * 연산을 하기 위해서 다른 자료형을 변경해서 같은 자료형으로 맞춰준다
         * (자동)
         * 1. double로 더하기 -
         * 2. int로 더하기
         */
        System.out.println(num1 + num2);

        double result = num1 + num2;
        System.out.println(result);
    }
}
