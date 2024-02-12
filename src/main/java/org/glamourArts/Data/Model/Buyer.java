package org.glamourArts.Data.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Buyer {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long buyerId ;
    private  String buyerName ;
    private  String buyerPassword ;
    private  String buyerEmail ;
    private  boolean isLogin ;
    
}
