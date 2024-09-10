package br.com.gabdev.dao.Jpa;

import br.com.gabdev.Domain.Jpa.ClienteJpa;
import br.com.gabdev.dao.generic.GenericJpaDB2DAO;

/**
 * @author gabdev
 */
public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDB2DAO() {
        super(ClienteJpa.class);
    }
}
