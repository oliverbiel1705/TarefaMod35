package br.com.gabdev.services;


import br.com.gabdev.Domain.Cliente;
import br.com.gabdev.exceptions.DAOException;
import br.com.gabdev.services.generic.IGenericService;

/**
 * @author gabdev
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

    //	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
    Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}