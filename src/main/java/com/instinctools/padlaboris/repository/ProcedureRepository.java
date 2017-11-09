package com.instinctools.padlaboris.repository;

import com.instinctools.padlaboris.model.Procedure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Repository for {@link Procedure}.
 */

public interface ProcedureRepository extends JpaRepository<Procedure, Integer> {

    /**
     * Searches procedure by name.
     * @param procedureName name of a procedure
     * @return a list of procedures
     */
    @Query(value = "SELECT * FROM procedure WHERE procedure_name = :name", nativeQuery = true)
    List<Procedure> findByProcedureName(@Param("name") String procedureName);


    /**
     * Searches procedure by code.
     * @param procedureCode disease code
     * @return a list of diseases
     */
    @Query(value = "SELECT * FROM procedure WHERE procedure_code = :code", nativeQuery = true)
    List<Procedure> findByProcedureCode(@Param("code") String procedureCode);

    /**
     * Searches procedure by class.
     * @param procedureClass disease class
     * @return a list of procedure
     */
    List<Procedure> findByProcedureClass(String procedureClass);
}
