package java.br.com.gabdev.dao.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author gabdev
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ ClienteServiceTest.class, ClienteDAOTest.class,
        ProdutoServiceTest.class, ProdutoDAOTest.class,
        VendaDAOTest.class})
public class AllTests {

}
