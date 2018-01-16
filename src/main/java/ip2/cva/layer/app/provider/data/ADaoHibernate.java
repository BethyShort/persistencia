package ip2.cva.layer.app.provider.data;

import ip2.cva.layer.app.resources.data.interfaces.IEntity;
import ip2.cva.layer.app.resources.data.interfaces.IEntityBody;
import ip2.cva.layer.app.resources.data.interfaces.IEntityPk;
import ip2.cva.layer.app.resources.data.interfaces.IGenericDao;

/**
 * Se elimina la implemenación original, porque Hibernate es una implementación de JPA y 
 * debería compartir interfaz con todas las implementaciones JPA.
 *
 * @param <T>
 */
public abstract class AHibernateDao <J extends IEntityPk, K extends IEntityBody,T extends IEntity<J,K>> implements IGenericDao<J,K,T>{}