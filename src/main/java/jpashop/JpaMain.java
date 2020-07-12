package jpashop;

import jpashop.domain.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory EMF = Persistence.createEntityManagerFactory("hello");
        EntityManager EM = EMF.createEntityManager();
        EntityTransaction TS = EM.getTransaction();

        TS.begin();
        Member member = new Member("1");
        Member member2 = new Member("2");
        Member member3 = new Member("3");
        EM.persist(member);
        EM.persist(member2);
        EM.persist(member3);
        TS.commit();
        EM.close();
        EMF.close();
    }
}
