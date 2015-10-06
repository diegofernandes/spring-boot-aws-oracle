package zone.cyclops.estoque.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import zone.cyclops.estoque.domain.Teste;

@Repository
public interface TesteRepository extends CrudRepository<Teste, Long> {
	
	public List<Teste> findByTexto(String texto);

}
