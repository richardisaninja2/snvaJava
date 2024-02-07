public class BoxWeight extends Cube{
    double weight;

    BoxWeight(){
        super(); //calls the superclass constructor
        weight = 3.5;
    }
    BoxWeight(double width,double height,double depth,double weight){
        super(width, height, depth);
        this.weight = weight;
    }
    BoxWeight(double len, double weight){
        super(len);
        this.weight = weight;
    }
    BoxWeight(Cube obj, double weight ){
        super(obj);
        this.weight = weight;
    }
}
