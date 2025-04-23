package exam06;

public class C extends B{
    int numC = 30;

    public C(){
        super(); // 자동 추가된다 보이지 않아도 있는듯?
        System.out.println("C() 생성자");
    }
}
