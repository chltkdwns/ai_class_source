package exam1;

public class test03 {
    public static void main(String[] args) {
        int building = 1;
        switch (building){
            case 1:
                System.out.println("1층 약국입니다.");
            case 2:
                System.out.println("2층 정형외과입니다.");
                break;
            case 3:
                System.out.println("3층 피부과입니다.");
                break;
            case 4:
                System.out.println("4층 치과입니다.");
                break;
            case 5:
                System.out.println("5층 헬스장입니다.");
                break;
            default:
                System.out.println("건물의 층수는 1~5층 입니다.");
        }
    }
}
