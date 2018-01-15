package karenina.persistencia;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

@Repository
public class GenericHibernateDao<T extends Serializable> extends AbstractHibernateDao<T> {

	public void setClazz(T clazzToSet) {
	}
}