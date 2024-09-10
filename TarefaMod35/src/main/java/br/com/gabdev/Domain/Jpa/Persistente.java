package br.com.gabdev.Domain.Jpa;

import javax.persistence.MappedSuperclass;

/**
 * @author gabdev
 */
@MappedSuperclass
public interface Persistente {
    public Long getId();

    public void setId(Long id);
}