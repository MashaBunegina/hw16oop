public class Car {
   String brand;
   String model;
   double engineVolume;
   String colour;
   int productionYear;
   String productionCountry;

   Car ( String brand, String model, double engineVolume, String colour, int productionYear , String productionCountry ) {
       if (brand == null || brand.isEmpty()) {
           this.brand = "default";
       } else {
           this.brand = brand;
       }
       if (model == null || model.isEmpty()) {
           this.model = "default";
       } else {
           this.model = model;
       }
       if (engineVolume >= 0) {
           this.engineVolume = 1.5;
       } else {
           this.engineVolume = engineVolume;
       }
               if (colour == null && colour == "") {
                   this.colour = "белый";
               } else {
                   this.colour = colour;
               }
                       if (productionYear > 0) {
                           this.productionYear = 2000;
                       } else {
                           this.productionYear = productionYear;
                       }
                               if (productionCountry == null || productionCountry.isEmpty()) {
                                   this.productionCountry = "default";
                               } else {
                                   this.productionCountry = productionCountry;
                               }
                           }

                           void car () {
                               System.out.println(brand + model + ",  " + productionYear + " год выпуска, сборка в " + productionCountry + ", цвет " + colour + ", " + "объем двигателя - " + engineVolume + " л.");
                           }
                       }
