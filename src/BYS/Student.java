package BYS;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes , Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2 , int note3, int perfNote1 , int perfNote2 , int perfNote3){
        if(note1 >= 0 && note1 <= 100 && perfNote1 >= 0 && perfNote1 <= 100){
            c1.note = note1;
            c1.perfNote = perfNote1;
        }
        if(note2 >= 0 && note2 <= 100 && perfNote2 >= 0 && perfNote2 <= 100){
            c2.note = note2;
            c2.perfNote = perfNote2;
        }
        if(note3 >= 0 && note3 <= 100 && perfNote3 >= 0 && perfNote3 <= 100){
            c3.note = note3;
            c3.perfNote = perfNote3;
        }
    }
    void printNote(){
        System.out.println(c1.name + " Notu :\t " + this.c1.note);
        System.out.println(c2.name + " Notu :\t " + this.c2.note);
        System.out.println(c3.name + " Notu :\t " + this.c3.note);
        System.out.println(c1.name + " Sözlü Notu :\t " + this.c1.perfNote);
        System.out.println(c2.name + " Sözlü Notu :\t " + this.c2.perfNote);
        System.out.println(c3.name + " Sözlü Notu :\t " + this.c3.perfNote);
        System.out.println("Ortalamanız : " + this.avarage);
    }
    void avarage(){
        this.avarage = ((this.c1.note*0.80 + this.c1.perfNote*0.20) + (this.c2.note*0.80 + this.c2.perfNote * 0.20) +
                (this.c3.note * 0.80 + this.c3.perfNote*0.20)) / 3.0;
    }
    void isPass(){
        if(this.avarage >= 50){
            System.out.println("Sınıfı geçtiniz.");
            isPass = true;
            avarage();
        }else{
            System.out.println("Sınıfta kaldınız .");
            isPass = false;
            avarage();
        }

        printNote();
    }

}
