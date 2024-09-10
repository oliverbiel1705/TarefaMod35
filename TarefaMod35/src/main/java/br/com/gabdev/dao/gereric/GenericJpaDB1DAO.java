package br.com.gabdev.dao.generic;

import br.com.gabdev.dao.Jpa.Persistente;
import br.com.gabdev.dao.generic.jpa.GenericJpaDAO;

import java.io.Serializable;

/**
 * @author gabdev
 */
public abstract class GenericJpaDB1DAO <T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB1DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Postgre1");
    }

}
