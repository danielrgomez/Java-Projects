class Geometry{
    double radius;
    double height;
    double base;
    
Geometry(){
    radius = 1;
    height = 1;
    base = 1;
}    
    
Geometry(double newBase){
    base = newBase;
}




double areaSquare(){
    return height * base;
}    
    
double areaTriangle(){
    return base * height * 0.5;
}    

double areaCircle(){
    return radius * Math.PI;
    
}

double basePlus(){
return ++base;
}

}