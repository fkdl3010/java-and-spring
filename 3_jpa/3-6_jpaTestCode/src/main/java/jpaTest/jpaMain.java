package jpaTest;

import javax.persistence.*;

public class jpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
            Member member = em.find(Member.class,1L);

            member.setName("Test!!");

            tx.commit();
        }catch (Exception e){

        }
    }
}
