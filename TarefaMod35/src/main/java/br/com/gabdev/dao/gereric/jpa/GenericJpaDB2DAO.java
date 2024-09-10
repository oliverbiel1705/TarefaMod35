package br.com.gabdev.dao.generic.jpa;

import br.com.gabdev.dao.Jpa.Persistente;

import java.io.Serializable;

/**
 * @author gabdev
 */
public abstract class GenericJpaDB2DAO <T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB2DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Postgre2");
    }

}
