package entities;

import dao.EventsDAO;
import dao.LocationsDAO;
import dao.ParticipationDAO;
import dao.PersonDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.UUID;

public class App {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("U4W3D3");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();

        EventsDAO ed = new EventsDAO(em);
        LocationsDAO ld = new LocationsDAO(em);
        ParticipationDAO pd = new ParticipationDAO(em);
        PersonDAO ped = new PersonDAO(em);

        /*Location adda = new Location("Fiume Adda", "Trezzo sull'Adda");
        ld.save(adda);
        Location addaToAdd = ld.findById(adda.getId());
        Event poveroPiero = new Event("Povero Piero", LocalDate.of(2025, 2, 16), "Portiamo un pupazzo sul fiume e gli diamo fuoco.", EventType.PUBBLICO, 1000, addaToAdd);
        ed.save(poveroPiero);*/


        /*Person aldo = new Person("Aldo", "Baglio", "aldo.baglio@gmail.com", LocalDate.of(1990, 2, 5), Genres.MASCHIO, new ArrayList<>());
        ped.save(aldo);*/

        /*Participation aldoParticipation = new Participation(ped.findById(UUID.fromString("d961a23c-b69a-442a-87b5-0ed08dc913be")), ed.getEventById(UUID.fromString("6ac3e518-1673-4932-8148-a0092d198c8b")), ParticipationState.CONFERMATA);
        pd.save(aldoParticipation);*/

        System.out.println(ped.findById(UUID.fromString("d961a23c-b69a-442a-87b5-0ed08dc913be")).getParticipations());
        /*try {
            System.out.println(ed.getEventById(poveroPiero.getId()));
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            ed.deleteEvent(poveroPiero.getId());
        } catch (NotFoundException e) {
            System.out.println(e.getMessage());
        }*/

        em.close();
        emf.close();
    }
}
