package br.com.gabdev.anotacao;

import java.lang.annotation.*;

/**
 * @author gabdev
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Tabela {

    String value();
}
