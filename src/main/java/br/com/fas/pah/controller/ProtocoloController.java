
package br.com.fas.pah.controller;

import br.com.fas.pah.entity.ProtocolEntity;
import br.com.fas.pah.modelo.Protocol;
import br.com.fas.pah.service.ProtocolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("protocolo")
public class ProtocoloController {

    @Autowired
    ProtocolService service;
    private String id;

    @PatchMapping("cadastrar")
    @ResponseStatus(HttpStatus.CREATED)
    public void register(@RequestParam(required = true) String protocolo, @RequestParam(required = true) String sintoma) {
        service.createProtocol(ProtocolEntity.from(protocolo, sintoma));
    }

    @GetMapping("listar")
    public ResponseEntity<List<Protocol>> findAllProtocol() {
        List<Protocol> protocols = service.listProtocols();
        return ResponseEntity.ok(protocols);
    }
    @GetMapping("{id}")
    public ResponseEntity<Protocol> findByIdProtocol(@PathVariable long id){
        return ResponseEntity.ok(Protocol.from(service.findByIdProtocol(id)));
    }

    @PostMapping("/atualizar")
    @ResponseStatus(HttpStatus.CREATED)
    public void  updateProtocol(@RequestBody Protocol protocol){
        service.updateProtocol(Protocol.from(protocol));
    }

    @DeleteMapping("excluir")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public  void deleteProtocol(@RequestParam long id){
        service.deleteProtocol(id);
    }
}

