import java.time.LocalDate;

public class Human {
    String name;
    private int age;
    private String city;
    String position;


    Human(String name, int age, String city, String position) {
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;

        }
        if (city == null) {
            this.city = "Информация не указана";
        } else {
            this.city = city;
        }
        if (position == null) {
            this.position = "Информация не указана";
        } else {
            this.position = position;
        }
    }

    void say() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + getCity() + " Мне " + getAge() + " лет. Я работаю на должности " + position + ". Будем знакомы!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        if (city != null && !city.isEmpty() && !city.isBlank()) {
            this.city = city;
        } else {
            this.name = "Информация не указана";
        }
    }
}


