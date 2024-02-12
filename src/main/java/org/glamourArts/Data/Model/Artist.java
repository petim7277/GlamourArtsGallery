package org.glamourArts.Data.Model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Artist {
     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Long artistId;
    private String username;
    private String password;
    private boolean isEnable=false;
    private String email;
//    @ManyToOne(mappedBy = "artist",cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @OneToMany(fetch = FetchType.LAZY)
//    private List<Art> artList;
}
