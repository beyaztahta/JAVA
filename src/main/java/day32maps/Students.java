package day32maps;

public class Students {

    public String name;
    public String email;
    public int age;
    public boolean success;

    public Students(String name, String email, int age, boolean success) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.success = success;
    }

    @Override
    public String toString() {  //bu classtan olusturdugunuz objelerin detaylarını yazar.Ekranda ne gormek istiyorsak onu yazabiliriz.
                                 // Datayı okunabilir gormek istiyorsan.Bu methodu kaldırısan yazılan objenin reference nı gosterir.
        return "Students{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", success=" + success +
                '}';
    }
}
