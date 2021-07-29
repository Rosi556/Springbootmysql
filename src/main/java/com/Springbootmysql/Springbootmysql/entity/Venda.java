package com.Springbootmysql.Springbootmysql.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "venda")
@Getter
@Setter
public class Venda implements Serializable {

    private static final long SerialVersionUId= 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    @NotNull
    private BigDecimal total;

    @OneToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    @OneToMany
    private List<Produto> produtos;


}
