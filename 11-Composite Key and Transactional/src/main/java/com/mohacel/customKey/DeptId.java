package com.mohacel.customKey;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

public class DeptId implements IdentifierGenerator {


    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object o) throws HibernateException {
        String prefix = "dev";
        String query = "SELECT MAX(EMP_DEPT_ID_COL) FROM EMPLOYEE_TAB";
        String maxId =(String) session.createNativeQuery(query).uniqueResult();
        if(maxId != null && maxId.matches(prefix+"\\d+")){
            Integer id = Integer.parseInt(maxId.substring(prefix.length()));
            return   prefix +(++id);
        }
        return prefix+"100";
    }
}

