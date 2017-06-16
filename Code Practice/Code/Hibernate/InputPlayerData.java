
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

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Player addPlayer = new Player();
        addPlayer.setPlayerfn("Blake");
        addPlayer.setPlayerln("Turley");
        addPlayer.setPlayerun("GreatGoldenBaby");
        addPlayer.setPlayeremail("blake@gmail.com");

        session.save(addPlayer);
        transaction.commit();

        System.out.println("Items successfully added.");

    }
}
