package com.atul.spring.data.productdata.entity;

import java.io.Serializable;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;


public class CustomRandomIdGenerator implements IdentifierGenerator {

    @Override public Serializable generate(final SharedSessionContractImplementor sharedSessionContractImplementor,
            final Object o)
            throws HibernateException {
        return null;
    }
}
