package com.sjo.dao.jdbc.ressource;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.sjo.dao.jdbc.MoyenDeTransportDao;
import com.sjo.model.ressource.MoyenDeTransport;



/**
 * @version 1.0
 * @created 17-Jun-2013 8:12:03 PM
 */

@Repository("moyenDeTransportDao")
public class MoyenDeTransportDaoImpl extends JdbcDaoSupport implements MoyenDeTransportDao{
	@Autowired
    public MoyenDeTransportDaoImpl(DataSource dataSource) {
        setDataSource(dataSource);
    }

    private static final String CREATE_MOYENDETRASPORT = "INSERT INTO MOYENDETRASPORT  (moyenDeTransportID, immatriculation, isDisponible, chargeMax, kilometrage, kilometrage, chargeMin, m_Equipement, m_TypeMoyenTransport)"
            + " values ?, ?, ?, ?, ?, ?, ? , ? , ? ";
    private static final String DELETE_MOYENDETRASPORT = "DELETE FROM MOYENDETRASPORT WHERE moyenDeTransportID = ?";
    private static final String MODIFY_MOYENDETRASPORT = "UPDATE MOYENDETRASPORT SET moyenDeTransportID = ?, " +
    

            "moyenDeTransportID= ?, " +
            "immatriculation = ?, " +
            "isDisponible = ?, " +
            "chargeMax = ?, " +
            "kilometrage = ?, " +
            "chargeMin= ? " +
            "m_Equipement= ? " +
            "m_TypeMoyenTransport= ? " +
            "WHERE moyenDeTransportID = ?";

    public MoyenDeTransport createMoyenDeTransport(MoyenDeTransport moyenDeTransport) {

        getJdbcTemplate().update(CREATE_MOYENDETRASPORT,
                moyenDeTransport.getMoyenDeTransportID(),
                moyenDeTransport.getImmatriculation(),
                moyenDeTransport.getIsDisponible(),
                moyenDeTransport.getChargeMax(),
                moyenDeTransport.getChargeMin(),
                moyenDeTransport.getKilometrage(),
                moyenDeTransport.getM_Equipement(),
                moyenDeTransport.getTypeMoyenTransportID(),
                moyenDeTransport.getMoyenDeTransportID());
        return moyenDeTransport;
    }

    public String deleteMoyenDeTransport(MoyenDeTransport moyenDeTransport) {
        getJdbcTemplate().update(DELETE_MOYENDETRASPORT, moyenDeTransport.getMoyenDeTransportID());
        return "deleted";
    }

    public MoyenDeTransport modifyMoyenDeTransport(MoyenDeTransport moyenDeTransport) {
        getJdbcTemplate().update(MODIFY_MOYENDETRASPORT,
        		 moyenDeTransport.getMoyenDeTransportID(),
                 moyenDeTransport.getImmatriculation(),
                 moyenDeTransport.getIsDisponible(),
                 moyenDeTransport.getChargeMax(),
                 moyenDeTransport.getChargeMin(),
                 moyenDeTransport.getKilometrage(),
                 moyenDeTransport.getM_Equipement(),
                 moyenDeTransport.getTypeMoyenTransportID(),
                 moyenDeTransport.getMoyenDeTransportID());

        return moyenDeTransport;
    }
	

}