package fiap.datarest.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fiap.datarest.model.Produto;

/**
 * @RepositoryRestResource.
 * Spring magicamente cria nossa camada de Repository e saberá receber nosso modelo.
 * Além disso, essa interface possibilita as tarefas de CRUD no Banco de Dados.
 * Finalmente, com essa Annotation também é criada uma camada de Controller internamente.
 * Esse Controller expõe o CRUD através de uma API REST.
 * Portanto, usando esse Annotation, não é necessário criar manualmente Controllers e Services.
 */

@RepositoryRestResource( path = "produtos", collectionResourceRel = "produtos")
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Long> {

}
