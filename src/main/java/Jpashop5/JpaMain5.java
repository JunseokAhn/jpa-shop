package Jpashop5;

import Jpashop5.domain5.Movie5;
import jpashop3.domain3.Movie3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain5 {
    public static void main(String[] args) {
        EntityManagerFactory EMF = Persistence.createEntityManagerFactory("hello");
        EntityManager EM = EMF.createEntityManager();
        EntityTransaction ET = EM.getTransaction();

        Movie5 movie = new Movie5();
        movie.setActor("Junseok");
        movie.setDirector("Junsoku");

        EM.persist(movie);
        ET.begin();
        ET.commit();
        EM.close();
        EMF.close();
    }
}
