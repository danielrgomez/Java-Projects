public class Areas{
    double radius = 1;
    double height = 1;
    double base = 1;
    
public Areas(){

}    

public static double areaSquare(double newBase , double newHeight){
    double square_A = (newBase * newHeight);
    double base = newBase;
    double height = newHeight;
    return square_A;
            
}

void setHeight(double newHeight){
    height = newHeight;
}

void setBase(double newBase){
    base = newBase;
}


void setRadius(double newRadius){
    radius = newRadius;
}


}

