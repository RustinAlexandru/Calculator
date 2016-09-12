import java.rmi.*;

public interface ICalculator extends Remote {
    
    
    public double minus (double firstOperand, double secondOperand) throws RemoteException;
    public double plus (double firstOperand, double secondOperand) throws RemoteException;
    public double multiply (double firstOperand, double secondOperand) throws RemoteException;
    public double division (double firstOperand, double secondOperand) throws RemoteException;
    public double inverse (double operand) throws RemoteException;
    public double sqrt (double operand) throws RemoteException;
    public double power (double firstOperand, double secondOperand) throws RemoteException;
    public double factorial (double operand) throws RemoteException;
    
    
    
}
