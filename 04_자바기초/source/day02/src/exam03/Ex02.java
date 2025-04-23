package exam03;

public class Ex02 {
    /**
     * main 호출 -> add(10,20) 호출
     * @param args
     */
    public static void main(String[] args) { //메인함수 모든 함수의 시작 함수
        int num1 = 10;
        int num2 = 20;
        int result2 = add(num1, num2);
        System.out.println(result2);
    }

    static int add(int num1, int num2){
        int result = num1 + num2;

        return result;
    }

}

