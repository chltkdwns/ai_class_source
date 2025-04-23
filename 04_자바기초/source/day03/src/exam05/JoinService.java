package exam05;

public class JoinService {

    private static JoinService instance =new JoinService(); //내부에서 접근

    private JoinService(){} // 통제 외부에서 접근 불가

    // 회원가입 처리 기능
    public void process(){
        System.out.println("회원가입 처리 완료");
    }

    public static JoinService getInstance(){ //외부에서 접근 할 수있는 get 형태 -> 이거 안됌 위에서 접근을 막아서
        if(instance == null){
            instance = new JoinService();
        }
        return instance; //this가 없어서 instance 사용 불가 객체에 접근 못함 사용하기 위에 내부접근(5번째줄)에 static 추가
    }
}
