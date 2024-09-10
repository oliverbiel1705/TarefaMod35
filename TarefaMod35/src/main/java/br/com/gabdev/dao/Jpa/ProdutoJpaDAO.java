package br.com.gabdev.dao.Jpa;

import br.com.gabdev.Domain.Jpa.ProdutoJpa;
import br.com.gabdev.dao.generic.jpa.GenericJpaDAO;

/**
 * @author gabdev
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class, "Postgre1");
    }

}

