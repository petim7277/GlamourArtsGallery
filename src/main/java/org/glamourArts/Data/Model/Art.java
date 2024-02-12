package org.glamourArts.Data.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
 @Data
 @Entity
public class Art {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long artId;
    private String artName;
    private String artDescription;
    private LocalDate DateUploaded = LocalDate.now();
    private  boolean isPublished = false;
    private BigDecimal price;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "artistId")
    private Artist artist;
}
