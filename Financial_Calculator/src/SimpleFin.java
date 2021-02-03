public class SimpleFin{
    double pv;
    double fv;
    double i;
    double pmt;
    double n;
    double fvo;
    double pvo;
    double cfs;
    double PVCFresult;
    double sar;
    double numPMTYear;
    double numYears;
    double pdsYear;
    double iNOM;
    double m;
    
void setPres(double newPV){
    newPV = pv;
}

void setFut(double newFV){
    newFV = fv;
}
    
void setInt(double newInt){
    newInt = i;
}

void setPMT(double newPMT){
    newPMT = pmt;
}

void setN(double newN){
    newN = n;
}

void setFVOrd(double newFVOrd){
    newFVOrd = fvo;
}

void setPVOrd(double newPVOrd){
    newPVOrd = pvo;
}

//1st time value of money question. Calculates Future Value
double getFut(double pv, double i, double n){
    return pv * Math.pow((1+i),n);
}

//2nd time value of money question. Calculates Present Value
double getPres(double fv, double i, double n){
    return fv / Math.pow((1+i),n);
}

//3rd time value of money question. Calculates FV of an Annuiy
double getFVOrd(double pmt, double i, double n){
   return pmt * ((Math.pow((1 + i),n) -1) / i);
}

//4th time value of money question. Calculates FV of an Annuity Due
double getFVADue(double fvo, double i){
    return fvo * (1 + i);
}

//5th time value of money question. Calculates Present Value of an Ordinary Annuity
double getPVAOrd(double pmt, double i, double n){
    return pmt * ((1 / Math.pow((1 + i), n)) / i);
}   
    
//6th time value of moeny question. Caluclates Present Value of an Annuity Due    
double getPVADue(double pvo, double i){
    return pvo * (1 + i);
}    

//7th time value of money question. Calculates Present Value of a Perpetuity
double getPVP(double pmt, double i){
    return pmt / i;
}

//8th time value of money question. Calculates the Present Value of Cash Flows
double PresCF(double [] cfs, double i){
    
    for (int x = 0; x < cfs.length; x++){
    double cfPV = cfs[x] / Math.pow((1+i),(x));   
    PVCFresult += cfPV;
    
    }
    return PVCFresult;   
}

//9th time value of money question. Calculates the Periodic Rate (Iper)
double getIPer(double sar,double numPMTYear){
    return sar/ numPMTYear;
}

//10th time value of money question. Calculates the Number of Periods
double getNumPer(double numYears, double pdsYear){
    return numYears * pdsYear;
}

//11th time value of money question. Calculates the Effective Annual Rate
double getEFF(double iNOM, double m){
    return Math.pow(1 + (iNOM / m),m) -1;
}













}

