package ex08.student;

public class MathStudent implements Student {

    private static final String NAME = "MATH"; // new 할 때마다 바뀌지 않아서 static 으로 고정

    public void doHomework() {
        System.out.println("수학 숙제를 합니다.");}

    public boolean isSameHomework(String keyboard){
        return NAME.equals(keyboard.toUpperCase()); // 키보드 입력값이 항상 NAME과 같고 대문자가 오도록 설정
    }
}
