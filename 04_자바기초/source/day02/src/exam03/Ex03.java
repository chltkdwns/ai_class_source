package exam03;

public class Ex03 {
    public static void main(String[] args) {
        int result1 = add(10,20);
        System.out.println("result1:"+result1);
        int result2 = add(10,20,30);
        System.out.println("result1:"+result2);
    }

    static int add(int num1, int num2){
        return num1 + num2;
    }
    // 두 함수는 같은 함수가 아님
    static int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}