package entities;

import dao.EventsDAO;
import exceptions.NotFoundException;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class App {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("U4W3D3");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

        EventsDAO ed = new EventsDAO(em);

        Event poveroPiero = new Event("Povero Piero", LocalDate.of(2025, 2, 16), "Portiamo un pupazzo sul fiume e gli diamo fuoco.", EventType.PUBBLICO, 1000);

        ed.save(poveroPiero);

        try {
            System.out.println(ed.getEventById(poveroPiero.getId()));
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            ed.deleteEvent(poveroPiero.getId());
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }

        em.close();
        emf.close();
    }
}
