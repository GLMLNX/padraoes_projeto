package dio.padrao_projeto_spring.repository;
import dio.padrao_projeto_spring.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClienteRep extends CrudRepository<Cliente,Long>{
    
}
