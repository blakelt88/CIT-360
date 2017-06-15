
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.cfg.Configuration;  

/**
 *
 * @author Blake
 */
  
public class InputPlayerData {  
public static void main(String[] args) {  
      
    //This will create the configuration object
     
    Configuration inputPlayerCFG = new Configuration();  
    
    //This will fill the data of the configuration file
    
    inputPlayerCFG.configure("playerdatahibernate.cfg.xml");  
      
		// Creation of the session factory, session configuration and transaction objects
    SessionFactory factory = inputPlayerCFG.buildSessionFactory();  
    Session session = factory.openSession();
    Transaction inputPlayerTransaction = session.beginTransaction();  
          
    Player addPlayer = new Player();  
    addPlayer.setPlayerID(1);  
    addPlayer.playerFN("Blake");  
    addPlayer.playerLN("Turley");
    addPlayer.playerUN("GreatGoldenBaby");
    addPlayer.playerEmail("someemail@gmail.com");
    addPlayer.playerPhone("999-999-9999");
    
    // Insertion get's committed to the DB
      
    inputPlayerTransaction.commit();
    
    // The session with the databases is closed
    session.close();  
      
    // Message to declare that it worked.   
      
    System.out.println("Player successfully added");  
      
}  
}  