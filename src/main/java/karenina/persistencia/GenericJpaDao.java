package karenina.persistencia;

import java.io.Serializable;
import org.springframework.stereotype.Repository;

@Repository
public class GenericJpaDao <T extends Serializable> extends AbstractJpaDao<T>{
	
}