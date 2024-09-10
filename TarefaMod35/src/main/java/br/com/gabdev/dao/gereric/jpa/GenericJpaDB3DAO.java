package br.com.gabdev.dao.generic.jpa;

import br.com.gabdev.dao.Jpa.Persistente;

import java.io.Serializable;

/**
 * @author gabdev
 */
public abstract class GenericJpaDB3DAO <T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB3DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Mysql1");
    }

}