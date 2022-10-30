public class Flower {
   private String flowerName;
   private String country;
   private double cost;
   int lifeSpan;

   Flower(String flowerName, String country, double cost, int lifeSpan) {
      if (flowerName == null && flowerName.isEmpty()) {
         this.flowerName = "цветок";
      } else {
         this.flowerName = flowerName;
      }
      if (country == null && country.isEmpty() && country.isBlank()) {
         this.country = "Россия";
      } else {
         this.country = country;

      }
      if (cost <= 0) {
         this.cost = 1;
      } else {
         this.cost = cost;
      }
      if (lifeSpan == 0) {
         this.lifeSpan = 3;
      } else {
         this.lifeSpan = lifeSpan;
      }
   }

   void flower() {
      System.out.println("Название цветка: " + flowerName + ". Страна происхождения:  " + country + " Стоимость: " + cost + ". Срок стояния:  " + lifeSpan);
   }

   public int getLifeSpan() {
      return lifeSpan;
   }

   public String getFlowerName() {
      return flowerName;
   }

   public String getCountry() {
      return country;
   }

   public double getCost() {
      return cost;
   }

   public void setFlowerName(String flowerName) {
     this.flowerName = flowerName;
   }

   public void setCountry(String country) {
      this.country = country;

      }


   public void setCost(double cost) {
      this.cost = cost;
      }
   }



