package br.com.gabdev.services;

import br.com.gabdev.Domain.Produto;
import br.com.gabdev.dao.IProdutoDAO;
import br.com.gabdev.services.generic.GenericService;

/**
 * @author gabdev
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}
