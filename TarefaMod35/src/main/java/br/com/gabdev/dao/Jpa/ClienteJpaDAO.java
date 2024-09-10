package br.com.gabdev.dao.Jpa;

import br.com.gabdev.Domain.Jpa.ClienteJpa;
import br.com.gabdev.dao.generic.jpa.GenericJpaDAO;

/**
 * @author gabdev
 */
public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO<C> {

    public ClienteJpaDAO() {
        super();
    }

}
