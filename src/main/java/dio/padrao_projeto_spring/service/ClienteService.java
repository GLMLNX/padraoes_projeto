package dio.padrao_projeto_spring.service;

import dio.padrao_projeto_spring.model.Cliente;
import dio.padrao_projeto_spring.repository.ClienteRep;
import dio.padrao_projeto_spring.repository.EnderecoRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService implements ClienteServiceInterface{
    @Autowired
    private ClienteRep clienteRep;
    @Autowired
    private EnderecoRep enderecoRep;

    @Override
    public Iterable<Cliente> showAll() {
        return clienteRep.findAll();
    }

    @Override
    public Cliente searchById(long id) {
        return clienteRep.findById(id).get();
    }

    @Override
    public void insertCliente(Cliente cliente) {
        clienteRep.save(cliente);
    }

    @Override
    public void updateCliente(long id, Cliente cliente) {
        Optional<Cliente> clienteVar = clienteRep.findById(id);
        if (clienteVar.isPresent()){
            insertCliente(clienteVar.get());
        }
    }

    @Override
    public void deleteCliente(long id) {
        clienteRep.deleteById(id);
    }
}
