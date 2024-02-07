import javax.swing.*;

public class Cube {

    private double width;
    private double height;
    private double depth;

    Cube(){
        height = 2;
        width = 3;
        depth = 4;
    }
    Cube(double height, double width, double depth){
        this.depth = depth;
        this.height = height;
        this.width = width;
    }
    Cube(double len){
        height = depth = width = len;
    }
    Cube(Cube obj){
        width = obj.width;
        height = obj.height;
        depth = obj.height;
    }
    double volume(){
        return width * height * depth;
    }
}
