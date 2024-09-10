package java.br.com.gabdev.dao.dao;

import br.com.gabdev.Domain.Jpa.VendaJpa;
import br.com.gabdev.dao.Jpa.IVendaJpaDAO;
import br.com.gabdev.dao.generic.jpa.GenericJpaDAO;
import br.com.gabdev.exceptions.DAOException;
import br.com.gabdev.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author gabdev
 */
public class VendaExclusaoJpaDAO extends GenericJpaDAO<VendaJpa, Long> implements IVendaJpaDAO {

    public VendaExclusaoJpaDAO() {
        super(VendaJpa.class, "Postgre1");
    }

    @Override
    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public VendaJpa consultarComCollection(Long id) {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

}

