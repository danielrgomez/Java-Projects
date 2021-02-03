public class SimplePerimeters{
    
double side_1;
double side_2;
double side_3;
double rad;


void setNewSide(double newSide_1){
    side_1 = newSide_1 ;
}
    

void setSide_2(double newSide_2){
    side_2 = newSide_2;
    
}
    
void setSide_3(double newSide_3){
    side_3 = newSide_3;
}    
 
void setRad_1 (double newRad){
    rad = newRad;
}

double sqPerimeter(){
    return side_1 * 4;
}

double tPerimeter(double side_1, double side_2, double side_3){
    return side_1 + side_2 + side_3;
}
    
double cPerimeter(){
    return 2 * rad * Math.PI;
}    
   
}