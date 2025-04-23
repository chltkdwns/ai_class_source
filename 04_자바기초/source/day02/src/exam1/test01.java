package exam1;

public class test01 {
    public static void main(String[] args) {
        int num1 = 20;
        double num2 = 3.5;
        int result = num1 * (int)num2; //오답
        double result2 = (int)(num1 * num2);
        System.out.printf("result1 = %d,result2 = %f",result,result2);
    }
}
