package BYS;

public class Main {
    public static void main(String[] args){
        Teacher teacher1 = new Teacher("Mehmet Hoca", "TRH", "5555");
        Course tarih = new Course("Tarih", "101" , "TRH" , teacher1);
        tarih.printTeacher();
        tarih.addTeacher(teacher1);
    }
}
