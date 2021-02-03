public class SimpleExam{
    double fv = 1;
    double pv;
    double i;
    double n;
    
  
    
double getFV(double pv, double i, double n){
    return fv = pv * Math.pow((1+i),n);
}    

double getPV(double fv, double i, double n){
    return pv = fv /Math.pow((1+i),n);  
}
    
    
    
void setFV(double newFV){
        newFV = fv;
    }
           
void setPV(double newPV){
    newPV = pv;
}          
    
void setI(double newI){
    newI = i;
}    
    
void setN(double newN){
    newN = n;
}    
    
    
}