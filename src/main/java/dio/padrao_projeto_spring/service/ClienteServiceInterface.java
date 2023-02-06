package dio.padrao_projeto_spring.service;

import dio.padrao_projeto_spring.model.Cliente;

public interface ClienteServiceInterface {
    Iterable<Cliente> showAll();
    Cliente searchById(long id);
    void insertCliente(Cliente cliente);
    void updateCliente(long id,Cliente cliente);
    void deleteCliente(long id);
}
