package jpabook.jpashop;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import jpabook.jpashop.domain.Delivery;
import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.OrderItem;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            // 배송 생성
            Delivery delivery = new Delivery();
            delivery.setCreatedBy("gil");
            delivery.setLastModifiedBy("sang-gil");
            em.persist(delivery);

            //오더 생성
            Order order = new Order();
            order.setCreatedBy("gil");
            order.setName("gil");
            order.setDelivery(delivery); // 배송 입력

            // 오더에 관한 오더아이템 생성
            OrderItem orderItem = new OrderItem();
            orderItem.setOrderPrice(20000);
            OrderItem orderItem1 = new OrderItem();
            orderItem1.setOrderPrice(30000);

            order.addOrderItem(orderItem);
            order.addOrderItem(orderItem1);

            em.persist(order);
            em.persist(orderItem);
            em.persist(orderItem1);



            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
    }
}
