package com.Springbootmysql.Springbootmysql.controller;

import com.Springbootmysql.Springbootmysql.entity.Venda;
import com.Springbootmysql.Springbootmysql.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @PostMapping("/venda")
    public Venda addVenda(@RequestBody Venda venda) {
        return vendaService.add(venda);
    }

    @GetMapping("/venda/{id}")
    public Venda getVenda(@PathVariable(value = "id") long id) {
        return vendaService.get(id);
    }

    @PutMapping("/venda/{id}")
    public Venda updateVenda(@RequestBody Venda venda, @PathVariable(value = "id") long id) {
        Optional<Venda> compra = vendaService.findById(id);
        if(compra.isPresent()){
            venda.setId(compra.get().getId());
            return vendaService.update(venda);
        }
        return null;
    }
}
