package com.mohacel.customkeys.generator;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import java.io.Serializable;

public class EmpIdGenerator implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) {
        String prefix = "dev";
        String query = "SELECT MAX(EMP_ID_COL) FROM EMPLOYEE_TAB";
        String maxId = (String) session.createNativeQuery(query).uniqueResult();

        if (maxId != null && maxId.matches(prefix + "\\d+")) {
            int id = Integer.parseInt(maxId.substring(prefix.length()));
            return prefix + (++id);
        }

        return prefix + "1001";
    }
}

