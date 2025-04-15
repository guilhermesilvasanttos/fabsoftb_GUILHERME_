package br.univille.projfabsoft.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.projfabsoft.entity.Cliente;
import br.univille.projfabsoft.service.ClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteComtroller {
    @Autowired
    private ClienteService service;
    
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    @GetMapping
    public ResponseEntity<List<Cliente>> getClientes(){
        var listaClientes = service.getALL();

        return new ResponseEntity<List<Cliente>>(listaClientes, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Cliente> postCliente(@RequestBody Cliente cliente){
        if(cliente == null){
            return ResponseEntity.badRequest().build();
        }
        if (cliente.getId() == 0){
            service.save(cliente);
            return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
        }
        return ResponseEntity.badRequest().build();
    }
}
