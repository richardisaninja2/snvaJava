public class Shipment extends BoxWeight{
    double shippingCost;
    Shipment(){
        super();
        shippingCost = 15;
    }
    Shipment(double width, double height, double depth, double weight, double shippingCost){
        super(width, height, depth, weight);
        this.shippingCost = shippingCost;
    }
    Shipment(double len, double weight, double shippingCost){
        super(len, weight);
        this.shippingCost = shippingCost;
    }
    Shipment(Cube obj, double weight, double shippingCost){
        super(obj, weight);
        this.shippingCost = shippingCost;
    }


}
