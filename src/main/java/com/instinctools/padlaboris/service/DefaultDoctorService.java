package com.instinctools.padlaboris.service;


import com.instinctools.padlaboris.model.Doctor;
import com.instinctools.padlaboris.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * class that implements the Disease's work and databases.
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))

public class DefaultDoctorService implements DoctorService {

    private final DoctorRepository doctorRepository;

    @Override
    public List<Doctor> findAll() {
        return doctorRepository.findAll();
    }

    @Override
    public List<Doctor> findByDoctorLastName(final String doctorLastName) {
        return doctorRepository.findByDoctorLastName(doctorLastName);
    }

    @Override
    public List<Doctor> findByDoctorDepartment (final String doctorDepartment) {
        return doctorRepository.findByDoctorDepartment(doctorDepartment);
    }

    @Override
    public Doctor findById(final Integer id) {
        //todo custom exception
        return Optional.ofNullable(doctorRepository.findOne(id)).orElseThrow(RuntimeException::new);
    }

    @Override
    public Doctor save(final Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public void delete(final Doctor doctor) {
        doctorRepository.delete(doctor);
    }

    @Override
    public void delete(final Integer id) {
        doctorRepository.delete(id);
    }

    @Override
    public boolean exists(final Integer id) {
        return doctorRepository.exists(id);
    }
}
