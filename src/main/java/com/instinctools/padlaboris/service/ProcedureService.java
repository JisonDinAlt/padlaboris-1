package com.instinctools.padlaboris.service;

import com.instinctools.padlaboris.model.Procedure;

import java.util.List;

/**
 * Service for {@link Procedure}.
 */
public interface ProcedureService {

    /**
     * Fetches all procedures.
     *
     * @return a list of procedures
     */
    List<Procedure> findAll();

    /**
     * Searches procedure by name.
     *
     * @param procedureName name of a procedure
     * @return a list of diseases
     */
    List<Procedure> findByProcedureName(String procedureName);

    /**
     * Searches procedure by code.
     *
     * @param procedureCode code of a procedure
     * @return a list of procedure
     */
    List<Procedure> findByProcedureCode(String procedureCode);

    /**
     * Searches procedure by class.
     *
     * @param procedureClass class of a procedure
     * @return a list of procedure
     */
    List<Procedure> findByProcedureClass(String procedureClass);

    /**
     * Searches a procedure by id.
     *
     * @param id id of a procedure
     * @return a procedure
     */
    Procedure findById (Integer id);

    /**
     * Inserts or updates a procedure.
     *
     * @param procedure a procedure to save
     * @return a saved procedure
     */
    Procedure save(Procedure procedure);

    /**
     * Removes an existing procedure.
     *
     * @param procedure a procedure to remove
     */
    void delete(Procedure procedure);

    /**
     * Removes a procedure by id.
     *
     * @param id id of a procedure
     */
    void delete(Integer id);

    /**
     * Checks whether a procedure exists.
     *
     * @param id id of a procedure
     * @return true if exists, false otherwise
     */
    boolean exists(Integer id);


}
