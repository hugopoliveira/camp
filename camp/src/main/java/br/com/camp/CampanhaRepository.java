package br.com.camp;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "campanha", path = "campanhas")
public interface CampanhaRepository extends PagingAndSortingRepository<Campanha, Long> {
}