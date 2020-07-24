package epam.Exceptions;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	
    	Scanner obj = new Scanner(System.in);
    	int P = obj.nextInt();
    	int T = obj.nextInt();
    	int R = obj.nextInt();
    	CalculateInterest ob= new CalculateInterest();
    	
    	logger.info(ob.compute_simpleinterest(P,T,R));
    	logger.info(ob.compute_compoundinterest(P,T,R));
    }
}
