package dio.padrao_projeto_spring.repository;
import dio.padrao_projeto_spring.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRep extends CrudRepository<Endereco,String>{
    
}
