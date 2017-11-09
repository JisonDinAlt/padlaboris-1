package com.instinctools.padlaboris.service;

import com.instinctools.padlaboris.model.Procedure;
import com.instinctools.padlaboris.repository.ProcedureRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * class that implements the Procedures work and databases.
 */

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))

public class DefaultProcedureService implements ProcedureService {

    private final ProcedureRepository procedureRepository;

    @Override
    public List<Procedure> findAll() {
        return procedureRepository.findAll();
    }

    @Override
    public List<Procedure> findByProcedureName(final String procedureName) {
        return procedureRepository.findByProcedureName(procedureName);
    }

    @Override
    public List<Procedure> findByProcedureCode(final String procedureCode) {
        return procedureRepository.findByProcedureCode(procedureCode);
    }

    @Override
    public List<Procedure> findByProcedureClass(final String procedureClass) {
        return procedureRepository.findByProcedureClass(procedureClass);
    }

    @Override
    public Procedure findById(final Integer id) {
        return Optional.ofNullable(procedureRepository.findOne(id)).orElseThrow(RuntimeException::new);
    }

    @Override
    public Procedure save(final Procedure procedure) {
        return procedureRepository.save(procedure);
    }

    @Override
    public void delete(final Procedure procedure) {
        procedureRepository.delete(procedure);
    }

    @Override
    public void delete(final Integer id) {
        procedureRepository.delete(id);
    }

    @Override
    public boolean exists(final Integer id) {
        return procedureRepository.exists(id);
    }
}
