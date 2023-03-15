package BYS;

public class Course {
    Teacher teacher; // Teacher sınıfından nitelik üretme
    String name;
    String code;
    String prefix;
    int note ;

    Course(String name , String code, String prefix , Teacher teacher){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.teacher = teacher;
    }

    void addTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    void printTeacher(){
        this.teacher.print();
    }
}
