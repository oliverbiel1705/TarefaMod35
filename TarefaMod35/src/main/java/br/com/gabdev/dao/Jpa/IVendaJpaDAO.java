package br.com.gabdev.dao.Jpa;

import br.com.gabdev.Domain.Jpa.VendaJpa;
import br.com.gabdev.exceptions.DAOException;
import br.com.gabdev.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author gabdev
 */
public interface IVendaJpaDAO extends IGenericJapDAO<VendaJpa, Long>{

    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public VendaJpa consultarComCollection(Long id);
}

