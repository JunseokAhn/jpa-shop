package jpashop4;

import jpashop4.domain4.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain4 {
    public static void main(String[] args) {

        EntityManagerFactory EMF = Persistence.createEntityManagerFactory("hello");
        EntityManager EM = EMF.createEntityManager();
        EntityTransaction ET = EM.getTransaction();

        Order4 order = new Order4();
        Delivery4 delivery = new Delivery4();
        OrderItem4 orderItem = new OrderItem4();

        Movie4 movie = new Movie4();
        movie.setActor("Junseok");
        movie.setDirector("Junsoku");

        //1. 상속으로 movie를 item에 연결했는데, 그럼, ordetItem에는 item을 어떻게 집어넣지?
        //Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
        //Exception in thread "main" java.lang.NullPointerException
        //2. @DiscriminatorColumn??

        order.addDelivery(delivery);
        order.addOrderItem(orderItem);


        ET.begin();
        ET.commit();
        EM.close();
        EMF.close();
    }
}
