package entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Locations {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "nome_location", nullable = false)
    private String name;

    @Column(name = "città", nullable = false)
    private String city;

    public Locations() {

    }

    public Locations(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Locations{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
