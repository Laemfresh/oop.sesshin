public class Main {
    public static void main(String[] args) {
     /*   Book book = new Book();
        book.name = "Life and Death";
        book.author ="Lermontov";
        book.year =1947;
        Book.method(book.name,book.author,book.year);*/
        
     /*   book.name="Life and Death.";
        book.author="Mihail Lermontov.";
        book.year= 1947;
        book.method();*/
      /*  Counter counter = new Counter();
        System.out.println(counter.value);
        System.out.println("chislo");
        counter.increment();
        System.out.println("chislo");

        counter.dicrement();*/

        Student student = new Student();
        student.name = "Artur";
        student.birthday= 2005;
        student.schoolNumber = 121;
        student.adresName = "Necrasovca ";

        Student student1 = new Student();
        student1.name = "Nikolai";
        student1.birthday = 2001;
        student1.adresName = "Lubaynsk";
        student1.schoolNumber = 134;

        Student student2 = new Student();
        student2.name = "Vasiliy";
        student2.birthday = 2001;
        student2.schoolNumber = 123;
        student2.adresName = "Lomonosova";

        System.out.println(student.name +" "+ student.birthday +" "+ student.adresName +" "+ student.schoolNumber);
        System.out.println(student1.name +" "+ student1.birthday +" "+ student1.adresName +" "+ student1.schoolNumber);
        System.out.println(student2.name +" "+ student2.birthday +" "+ student2.adresName +" "+ student2.schoolNumber);

    }
}