package exam01;

public class Student {
    static int id; //학번
    String name; //이름
    String major; //전공과목
    final int NUM = 100; // 정적 메모리, 객체 생성 후에만 접근 가능

    static final int NUM2 = 200; //정적 상수, 객체 X, 클래스명으로 접근 가능한 상수

    /**
     * 기본 생성자
     * 정의가 되어있지 않으면 public Student(){}
     */
    public Student(){
        //객생 생성 이후 실행되는 코드
        /**
         * 객체 생성 이후에는 변수 공간에 값을 최초로 넣어주는 초기화 작업을 주로 진행
         */
        /*
        id = 1000;
        name = "이이름";
        major = "컴퓨터과학";
         */
    }


    /*public Student(int _id, String _name, String _major)
    {
        id = _id;
        name = _name;
        major = _major;

    }*/
    public Student(int id, String name, String major){
            this.id = id;
        this.name = name;
        this.major = major;
    }

    void study(){
        System.out.printf("id = %d, name = %s, major = %s\n", id, name, major);
    }

    static void staticMethod(){ // 정적 메서드로 객체 생성과는 아무런 상관 X
        System.out.println("staticMethod()!");
    }
}
    