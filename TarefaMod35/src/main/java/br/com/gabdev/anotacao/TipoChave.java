package br.com.gabdev.anotacao;

import java.lang.annotation.*;

/**
 * @author gabdev
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}