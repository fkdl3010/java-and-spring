package hellojpa;

import java.util.ArrayList;
import java.util.function.Consumer;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Hibernate;
import sun.jvm.hotspot.debugger.win32.coff.TestDebugInfo;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {

            Member member = new Member();
            member.setUsername("sanggil");
            em.persist(member);

            List<Member> resultList = em.createNativeQuery("select * from MEMBER",Member.class).getResultList();
            Consumer<Member> memberFind = (obj) -> {
                System.out.println(obj.getUsername());
            };
            resultList.forEach(memberFind);

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }

        emf.close();

    }


}
