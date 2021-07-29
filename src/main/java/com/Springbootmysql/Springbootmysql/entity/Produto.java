package com.Springbootmysql.Springbootmysql.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "produto")
public class Produto implements Serializable {

    private static final long SerialVersionUId= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull
    @Column(name = "nome")
    @Size(min = 1, max = 100)
    private String nome;

    @NotNull
    @Column(name = "valor")
    private BigDecimal valor;

}
