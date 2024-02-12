package org.glamourArts.Data.Model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.util.List;

@Data
@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long adminId ;
    private String adminName ;
    private String adminPassword ;
    private String adminEmail ;
    private  boolean isEnabled ;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Artist> listOfArtist;

}
