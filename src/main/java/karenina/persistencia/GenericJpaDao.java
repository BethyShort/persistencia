package karenina.persistencia;

import org.springframework.stereotype.Repository;

@Repository
public class GenericJpaDao <T extends Entity>  extends AbstractJpaDao<T>{
	
}