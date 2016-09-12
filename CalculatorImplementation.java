import java.rmi.*;
import java.rmi.server.*;
import static java.lang.Double.*;

public class CalculatorImplementation extends UnicastRemoteObject implements ICalculator {
    
    public CalculatorImplementation() throws RemoteException {
        
    }
    
    @Override
    public double minus (double firstOperand, double secondOperand) throws RemoteException {
       return firstOperand - secondOperand;
    }
    
    @Override
    public double plus (double firstOperand, double secondOperand) throws RemoteException {
        return firstOperand + secondOperand;
    }
    
    @Override
    public double multiply (double firstOperand, double secondOperand) throws RemoteException {
        return firstOperand * secondOperand;
    }
    
    @Override
    public double division (double firstOperand, double secondOperand) throws RemoteException {
        if (Double.isNaN(firstOperand / secondOperand) ||
                POSITIVE_INFINITY == (firstOperand / secondOperand) 
               || NEGATIVE_INFINITY == (firstOperand / secondOperand)) return Double.NaN;
            else return firstOperand / secondOperand;
    }
    
    @Override
    public double inverse (double operand) throws RemoteException {
        if (Double.isNaN(Math.pow(operand, -1))) return Double.NaN;
            else return  Math.pow(operand, -1);
    }
    
    @Override
    public double sqrt (double operand) throws RemoteException {
         return Math.sqrt(operand);
    }
    
    @Override
    public double power (double firstOperand, double secondOperand) throws RemoteException {
        return Math.pow(firstOperand, secondOperand);
    }
    
    @Override
    public double factorial (double operand) throws RemoteException {
        
        
      double tmp = (operand - 0.5) * Math.log(operand + 4.5) - (operand + 4.5);
      double ser = 1.0 + 76.18009173    / (operand + 0)   - 86.50532033    / (operand + 1)
                       + 24.01409822    / (operand + 2)   -  1.231739516   / (operand + 3)
                       +  0.00120858003 / (operand + 4)   -  0.00000536382 / (operand + 5);
      tmp = tmp + Math.log(ser * Math.sqrt(2 * Math.PI));
      return Math.exp(tmp) * operand;
   
    }
    
}
