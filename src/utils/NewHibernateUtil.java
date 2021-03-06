package utils;


 
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


 
public class NewHibernateUtil 
{
   private static SessionFactory sessionFactory = buildSessionFactory();
 
   private static SessionFactory buildSessionFactory() 
   {
      try
      {
         if (sessionFactory == null) 
         {
         sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
         }
         return sessionFactory;
      } catch (Throwable ex) {
         throw new ExceptionInInitializerError(ex);
      }
   }
 
   public static SessionFactory getSessionFactory() {
      return sessionFactory;
   }
   public static org.hibernate.Session getSession() {
	  return getSessionFactory().getCurrentSession();
   }
   
   public static Transaction begainTransaction(){
       Transaction tx = sessionFactory.getCurrentSession().getTransaction();
       if(tx.isActive()){
           return tx;
       }else{
           tx.begin();
       }
       return tx;
   }
   
   public static void endTransaction(Transaction tx){
       tx.commit();
   }
 
   public static void shutdown() {
      getSessionFactory().close();
   }
}