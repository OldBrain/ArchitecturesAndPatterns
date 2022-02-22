package ru.avbugorov.architecturesandpatterns.models;

import javax.persistence.*;

@Entity
@Table(name = "message")

public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
