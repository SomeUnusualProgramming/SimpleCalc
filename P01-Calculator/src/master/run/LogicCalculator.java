package master.run;

public class LogicCalculator {
    
    public static double oblicz(double arg1, double arg2, String operacja){
        switch (operacja) {
           case "+":
               return arg1+arg2;
           case "-":
               return arg1-arg2;
           case "/":
               return arg1/arg2;
           case "*":
               return arg1*arg2;
           default:
               return 0.0;
       }
        
    }
    
}
