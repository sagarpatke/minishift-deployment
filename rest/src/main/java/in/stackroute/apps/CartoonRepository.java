
package in.stackroute.apps;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import in.stackroute.apps.entity.Cartoon;

@RepositoryRestResource(collectionResourceRel = "cartoons", path = "cartoons")
public interface CartoonRepository extends PagingAndSortingRepository<Cartoon, Long> {

}
