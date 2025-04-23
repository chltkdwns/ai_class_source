package exam1;

public class test02 {
    public static void main(String[] args) {
        for(int student = 1; student <= 40; student++){
            System.out.printf("학생%d, 방번호 %d번\n",student, student % 10);
        }
    }
}
