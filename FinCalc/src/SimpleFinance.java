public class SimpleFinance{
    double fv;
    double pv;
    double i;
    double n;
    
    
double presValue(double fv, double i, double n){
    return fv / Math.pow((1 + i),n);
}
    
double futValue(double pv, double i, double n){
    return pv* Math.pow((1+i),n);
}
    
void setpresVal(double newPV){
    newPV = pv;
}    
    
void setFV(double newFV){
    newFV = fv;
}    
    
void setI(double newI){
    newI = i;
}

void setN(double newN){
   newN = n;
}
  
    
    
    
    
}