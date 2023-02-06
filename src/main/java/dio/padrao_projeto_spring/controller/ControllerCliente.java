package dio.padrao_projeto_spring.controller;

import dio.padrao_projeto_spring.model.Cliente;
import dio.padrao_projeto_spring.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ControllerCliente {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<Iterable<Cliente>> showAll(){
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.showAll());
    }
    @GetMapping("{id}")
    public ResponseEntity<Cliente> searchById(@PathVariable(name = "id") long id){
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.searchById(id));
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable(name = "id")long id){
         clienteService.deleteCliente(id);
         return ResponseEntity.status(HttpStatus.OK).build();
    }
    @PutMapping("{id}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable(name = "id")long id,@RequestBody Cliente cliente){
        clienteService.updateCliente(id,cliente);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @PostMapping
    public ResponseEntity<Cliente> insertCliente(@RequestBody Cliente cliente){
        clienteService.insertCliente(cliente);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
