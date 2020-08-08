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

        try {
            ET.begin();

            Order4 order = new Order4();
            Delivery4 delivery = new Delivery4();
            OrderItem4 orderItem = new OrderItem4();

            Movie4 movie = new Movie4();
            movie.setActor("Junseok");
            movie.setDirector("Junsoku");

            //1. 상속으로 movie를 item에 연결했는데, 그럼, ordetItem에는 item을 어떻게 집어넣지?
            // >> 자바의 다형성으로 굳이item이 아니더라도 movie등을 집어넣을수있다

            orderItem.setItem(movie);

            order.addDelivery(delivery);
            order.addOrderItem(orderItem);

            EM.persist(order);

            ET.commit();
        } catch (Exception e) {
            e.printStackTrace();
            ET.rollback();
        } finally {
            EM.close();
        }
        EMF.close();
    }
}
