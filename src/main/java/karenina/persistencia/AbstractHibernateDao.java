package karenina.persistencia;

/**
 * Se elimina la implemenación original, porque Hibernate es una implementación de JPA y 
 * debería compartir interfaz con todas las implementaciones JPA.
 *
 * @param <T>
 */
public abstract class AbstractHibernateDao <T extends Entity> implements IGenericDao<T>{}