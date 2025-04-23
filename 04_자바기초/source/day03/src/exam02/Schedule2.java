package exam02;

public class Schedule2 {
    private int year;
    private int month;
    private int day;

    public Schedule2(){
        this(2025, 4, 22); //this는 무조건 첫줄에 / 아래로 내려가면 오류 발생
    }

    public Schedule2(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year; //this 생략 객체의 지원에 접근하기 위한 주소
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void showDate(){
        System.out.printf("year = %d, month = %d, day = %d\n", year, month, day);
    }

    public Schedule2 getThis(){
        showDate();
        return this;
    }
}
