package com.abad.client;

import com.abad.entities.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by Virendra on 25-06-2020.
 */
public class ClientTest
{

    public static void main(String[] args) {

        EntityManagerFactory entityMgrFactory = null;
        EntityManager entityMgr = null;
        EntityTransaction transaction = null;

        Student student = null;
        boolean flag = false;

        try {

            entityMgrFactory = Persistence.createEntityManagerFactory("persistence");
            entityMgr = entityMgrFactory.createEntityManager();
            transaction = entityMgr.getTransaction();

            transaction.begin();

            student = new Student();
            student.setId(1001);
            student.setDob("3-6-1987");
            student.setFirstNm("Hriday");
            student.setLastNm("Kumar");

            entityMgr.persist(student);
            //entityMgr.merge(student);
            flag = true;
            System.out.println("Hey Baby");

        } catch (Exception ex) {
            ex.getStackTrace();
        } finally {

            if (transaction != null) {
                if (flag) {
                    transaction.commit();

                    System.out.println("Record is inserted ");
                } else {
                    transaction.rollback();
                }
            }

            if (entityMgr != null && entityMgrFactory != null) {
                entityMgr.close();
                entityMgrFactory.close();
            }
        }
    }


}
