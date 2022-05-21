package com.portafolio.SpringBoot.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@Getter @Setter
@Entity
@Table(name="experiencia")
public class experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_ex")
    @javax.persistence.Id
    private Long id_ex;
    @Column(name="trabajo")
    private String trabajo;
    @Column(name="empresa_n")
    private String empresa_n;
    @Column(name="empresa_l")
    private String empresa_l;
    @Column(name="inicio_ex")
    private Date inicio_ex;
    @Column(name="fin_ex")
    private Date fin_ex;
    @Column(name="descripcion_ex")
    private String descripcion_ex;
    
    public experiencia(){
    }
    public experiencia(Long id_ex, String trabajo, String empresa_n, String empresa_l, Date inicio_ex, Date fin_ex, String descripcion_ex){
        this.id_ex = id_ex;
        this.trabajo = trabajo;
        this.empresa_n = empresa_n;
        this.empresa_l = empresa_l;
        this.inicio_ex = inicio_ex;
        this.fin_ex = fin_ex;
        this.descripcion_ex = descripcion_ex;
    }
}
