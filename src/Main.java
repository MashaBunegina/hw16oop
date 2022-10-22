public class Main {
    public static void main(String[] args) {
        Human Maks = new Human( "Максим",35 , "Минск", "бренд менеджер");
        Maks.say();

        Human Ann = new Human("Аня", 29 , "Москва", "методист");
        Ann.say();

        Human Kate = new Human("Катя", 28, "Калининград", "продакт-менеджер");
        Kate.say();

        Human Artem = new Human("Артем", 27, "Москва", "директор по развитию");
        Artem.say();


        Car Lada = new Car("Lada ", " Granta", 1.7, "желтый", 2015, "Россия");
        Lada.car();

        Car Audi = new Car( "Audi ", " A8 50L TDI Quattro", 3.0, "черный", 2020, "Германия");
        Audi.car();

        Car BMW = new Car("BMW ", " Z8", 3.0, "черный" , 2021, "Германия");

        BMW.car();

        Car KIA = new Car("KIA "," Sportage 4-го поколния", 2.4, "красный", 2018, "Южная Корея" );
        KIA.car();

        Car Hyundai = new Car("Hyundai "," Avante", 1.6, "оранжевый", 2016, "Южная корея" );
        Hyundai.car();

    }
}