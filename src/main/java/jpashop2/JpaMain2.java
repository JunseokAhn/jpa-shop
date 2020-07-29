package jpashop2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain2 {
    public static void main(String[] args) {

        EntityManagerFactory EMF = Persistence.createEntityManagerFactory("hello");
        EntityManager EM = EMF.createEntityManager();
        EntityTransaction ET = EM.getTransaction();

        ET.begin();
        ET.commit();
        EM.close();
        EMF.close();
    }
}
