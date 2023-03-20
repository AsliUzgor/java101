package BYS;

public class Main {
    public static void main(String[] args){
        Teacher t1 = new Teacher("Ahmet Hoca", "TRH", "5555");
        Teacher t2 = new Teacher("Graham Bell " , "FZK", "0000");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "1111");

        Course tarih = new Course("Tarih", "101" , "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102","FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji", "103","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Kemal Sunal" , "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(100,100,50,20,60,40);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "124", "4", tarih,fizik,biyo);
        s2.addBulkExamNote(84,25,63,40,80,100);
        s2.isPass();
    }
}
