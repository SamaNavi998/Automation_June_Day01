package oop;

public class Demo {
    public static void main(String arg[]){
        Vehicle car = new Car("Toyota","Vitz",2018,5);
        car.displayInfo();
        System.out.println("------------------");

        MotoBike bike = new MotoBike("Honda","CBR",2000);
        bike.setHasCarrier(true);
        bike.displayInfo();
        System.out.println("Having a carrier : "+bike.isHasCarrier());



    }

}
