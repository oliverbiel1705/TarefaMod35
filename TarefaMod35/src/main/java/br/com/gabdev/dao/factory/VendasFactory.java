package br.com.gabdev.dao.factory;

import br.com.gabdev.Domain.Cliente;
import br.com.gabdev.Domain.Venda;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author gabdev
 */
public class VendasFactory {

    public static Venda convert(ResultSet rs) throws SQLException {
        Cliente cliente = ClienteFactory.convert(rs);
        Venda venda = new Venda();
        venda.setCliente(cliente);
        venda.setId(rs.getLong("ID_VENDA"));
        venda.setCodigo(rs.getString("CODIGO"));
        venda.setValorTotal(rs.getBigDecimal("VALOR_TOTAL"));
        venda.setDataVenda(rs.getTimestamp("DATA_VENDA").toInstant());
        venda.setStatus(Venda.Status.getByName(rs.getString("STATUS_VENDA")));
        return venda;
    }
}
