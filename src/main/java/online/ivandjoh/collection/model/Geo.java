package online.ivandjoh.collection.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Geo {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String lat;
    private String lng;
}
