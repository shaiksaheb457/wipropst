package com.example.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.model.PAN;
import com.example.util.HibernateUtil;

public class MainApp {
    public static void main(String[] args) {
        // Create sample PAN
        PAN pan = new PAN();
        pan.setPanholderName("Arun Kumar");
        pan.setPanNumber("ABCDE1234Z");

        // Hibernate save
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();

            session.save(pan);

            transaction.commit();
            System.out.println("PAN record saved successfully!");
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
}
