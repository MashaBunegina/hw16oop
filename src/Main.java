import Transport.Car;

import java.security.Key;

public class Main {
    public static void main(String[] args) {
        Human Maks = new Human( "Максим",-35 , "Минск", "бренд менеджер");
        Maks.setCity(null);
        Maks.say();

        Human Ann = new Human("Аня", 29 , "Москва", "методист");
        Ann.setAge(30);
        Ann.say();

        Human Kate = new Human("Катя", 28, "Калининград", "продакт-менеджер");
        Kate.say();

        Human Artem = new Human("Артем", 27, "Москва", "директор по развитию");
        Artem.say();
        Human Vladimir = new Human ( "Владимир", 21, "Казань", null);
        Vladimir.say();



        Car Lada = new Car("Lada ", " Granta", 1.7, "желтый", 2015, "Россия", "Механика", "Седан", "111", 5, false, null);
        Lada.car();

        Car Audi = new Car( "Audi ", " A8 50L TDI Quattro", 3.0, "черный", 2020, "Германия", "Автомат", "Седан", "222", 5, false, null);
        Audi.car();

        Car BMW = new Car("BMW ", " Z8", 3.0, "черный" , 2021, "Германия", "Автомат", "Хэтчбэк", "333", 5, false, null);

        BMW.car();

        Car KIA = new Car("KIA "," Sportage 4-го поколния", 2.4, "красный", 2018, "Южная Корея", "Автомат", "Седан", "444", 5 , false, null);
        KIA.car();

        Car Hyundai = new Car("Hyundai "," Avante", 1.6, "оранжевый", 2016, "Южная корея", "Автомат","Седан", "555", 5, false, null );
        Hyundai.car();

        Flower Rose = new Flower( "Роза", "Голландия", 35.59, 0);
        Rose.flower();
        Flower Hrizantema = new Flower( "Хризантема", " ", 15, 5);
        Hrizantema.flower();
        Flower Pion = new Flower( "Пион", "Англия", 69.9, 1);
        Pion.flower();
        Flower Gypsofila = new Flower( "Гипсофила", "Турция", 19.05, 10);
        Gypsofila.flower();
        calculateCostOfFlowers(
                Rose, Rose,Rose,
                Hrizantema, Hrizantema,Hrizantema,Hrizantema,Hrizantema,
                Gypsofila
                );

    }
    private static void calculateCostOfFlowers(Flower...flowers){
        double totalCost = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minimumLifeSpan){
                minimumLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
        }
        System.out.println("Стоимость букета: " + totalCost);
        System.out.println("Срок стояния букета: " + minimumLifeSpan);
    }
}
