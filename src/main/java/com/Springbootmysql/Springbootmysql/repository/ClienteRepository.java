package com.Springbootmysql.Springbootmysql.repository;

import com.Springbootmysql.Springbootmysql.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

    //Tipo  NomeDoMetodo (Tipo Varialvel)

    Cliente findById(long id);


}
