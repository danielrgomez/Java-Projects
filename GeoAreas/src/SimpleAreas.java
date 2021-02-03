public class SimpleAreas{
    double radius = 1;
    double height = 1;
    double base = 1;
    
public SimpleAreas(){

}    

void setBase(double newBase){
    base = newBase;
}

void setHeight(double newHeight){
    height = newHeight;
}

void setRadius(double newRadius){
    radius = newRadius;
}


double getSquareArea(double base, double height){
    return base * height;
}

double getTriangleArea(double base, double height){
    return base * height * 0.5;
}

double getCircleArea(double radius){
    return radius * Math.PI;
}


}