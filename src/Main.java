public class Main {
    public static void main(String[] args) {


        Cube one = new Cube();
        System.out.println(one.volume());

        Cube two = new Cube(2, 3, 5);
        System.out.println(two.volume());

        Cube three = new Cube(12);
        System.out.println(three.volume());


        Cube four = new Cube(two);
        System.out.println(four.volume());

        BoxWeight boxWeight1 = new BoxWeight();
        System.out.println(boxWeight1.weight);
        System.out.println(boxWeight1.volume());

        BoxWeight boxWeight2 = new BoxWeight(2,3,4,5);
        System.out.println(boxWeight2.weight+" 2 weight");
        System.out.println(boxWeight2.volume()+"2 volume");

        BoxWeight boxWeight3 = new BoxWeight(three, 2.5);
        System.out.println(boxWeight3.weight+" 3 weight");
        System.out.println(boxWeight3.volume()+"3 volume");


        Shipment shipment1 = new Shipment();
        System.out.println(shipment1.shippingCost + " shippingcost no const");

        Shipment shipment2 = new Shipment(2,3,4,5, 25);
        System.out.println(shipment2.volume() + " shippingcost const");

        Shipment shipment3 = new Shipment(shipment1, 13, 25);
        System.out.println(shipment3.volume() + " shipment 3 volume");

        Shipment shipment4 = new Shipment(15, 12, 225);
        System.out.println(shipment4.volume() + " shipment4 volume");
        System.out.println(shipment4.shippingCost + " shipment4 shipping cost");

    }
}