
import java.rmi.*;


public class Server {
    
    private static final String hostName = "localhost";
    
    public static void main(String[] args) throws Exception {
        
    
        CalculatorImplementation temp = new CalculatorImplementation();
        
               
        String rmiObjectName = "rmi://" + hostName + "/myCalculator";
        
        
        Naming.rebind(rmiObjectName, temp);
        
    }
}
