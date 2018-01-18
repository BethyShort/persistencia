package ip2.cva.layer.app.resources.data.dao.provider.jdbc;

import java.util.List;

import ip2.cva.layer.app.resources.data.interfaces.IDao;
import ip2.cva.layer.app.resources.data.interfaces.IEntidad;
import ip2.cva.layer.app.resources.data.interfaces.IEntidadCuerpo;
import ip2.cva.layer.app.resources.data.interfaces.IEntidadPk;

public abstract class AJdbcDaoGenerico <J extends IEntidadPk, K extends IEntidadCuerpo, L extends IEntidad<J,K>>  implements IDao<J,K,L> {

	public L findByPk(final J pk) {
		return null;
	}

	public List<L> findAll() {
		return null;
	}

	public void create(final L entity) {
	}

	public L update(final L entity) {
		return null;
	}

	public void delete(final L entity) {
	}

	public void deleteByPk(final J pk) {
	}
}