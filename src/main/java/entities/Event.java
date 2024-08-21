package entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Eventi")
public class Event {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "titolo", nullable = false)
    private String title;

    @Column(name = "data_evento", nullable = false)
    private LocalDate eventDate;

    @Column(name = "descrizione_evento", nullable = false)
    private String eventDescription;

    @Column(name = "tipo_evento", nullable = false)
    @Enumerated(EnumType.STRING)
    private EventType eventType;

    @Column(name = "max_partecipanti", nullable = false)
    private int maxParticipants;

    public Event() {
    }

    public Event(String title, LocalDate eventDate, String eventDescription, EventType eventType, int maxParticipants) {
        this.title = title;
        this.eventDate = eventDate;
        this.eventDescription = eventDescription;
        this.eventType = eventType;
        this.maxParticipants = maxParticipants;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", eventDate=" + eventDate +
                ", eventDescription='" + eventDescription + '\'' +
                ", eventType=" + eventType +
                ", maxParticipants=" + maxParticipants +
                '}';
    }
}
