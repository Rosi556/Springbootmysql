package com.Springbootmysql.Springbootmysql.repository;


import com.Springbootmysql.Springbootmysql.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

   Produto findById(long id);
}
