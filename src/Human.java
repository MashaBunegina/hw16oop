public class Human {
    String name;
    int age;
    String city;
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
            this.age = Math.abs(age);
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
        void say () {
            System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + " Мне " + age + " лет. Я работаю на должности " + position + ". Будем знакомы!");
        }
    }
