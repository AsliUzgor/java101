package BYS;

public class Course {
    Teacher teacher; // Teacher sınıfından nitelik üretme
    String name;
    String code;
    String prefix;
    int note ;
    int perfNote;

    Course(String name , String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.perfNote = 0;

    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            //this.printTeacher();
        }else{
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor. ");
        }

    }

    void printTeacher(){
        this.teacher.print();
    }
}
