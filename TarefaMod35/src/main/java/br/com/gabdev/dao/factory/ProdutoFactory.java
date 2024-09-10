package br.com.gabdev.dao.factory;

import br.com.gabdev.Domain.Produto;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author gabdev
 */
public class ProdutoFactory {


    public static Produto convert(ResultSet rs) throws SQLException {
        Produto prod = new Produto();
        prod.setId(rs.getLong("ID_PRODUTO"));
        prod.setCodigo(rs.getString("CODIGO"));
        prod.setNome(rs.getString("NOME"));
        prod.setDescricao(rs.getString("DESCRICAO"));
        prod.setFornecedores(rs.getString("FORNECEDOR"));
        prod.setValor(rs.getBigDecimal("VALOR"));
        return prod;
    }
}
