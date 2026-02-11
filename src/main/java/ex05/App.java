package ex05;

import ex05.teacher.HtmlTeacher;
import ex05.teacher.PythonTeacher;
import ex05.teacher.Teacher;

public class App {
    public static void main(String[] args) {
        Teacher tt = new PythonTeacher();
        tt.수업하기();
    }
}
