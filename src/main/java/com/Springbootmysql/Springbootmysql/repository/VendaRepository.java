package com.Springbootmysql.Springbootmysql.repository;


import com.Springbootmysql.Springbootmysql.entity.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {

    Venda findById(long id);
}
