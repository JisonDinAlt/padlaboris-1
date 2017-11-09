package com.instinctools.padlaboris.service;

import com.instinctools.padlaboris.model.Doctor;

import java.util.List;

public interface DoctorService {
    /**
     * Fetches all doctors.
     *
     * @return a list of doctors
     */
    List<Doctor> findAll();

    /**
     * Searches doctors by lastName.
     *
     * @param doctorLastName name of a disease
     * @return a list of diseases
     */
    List<Doctor> findByDoctorLastName(String doctorLastName);

    /**
     * Searches doctor by department.
     *
     * @param doctorDepartment code of a disease
     * @return a list of diseases
     */
    List<Doctor> findByDoctorDepartment(String doctorDepartment);


    /**
     * Searches a doctor by id.
     *
     * @param id id of a doctor
     * @return a doctor
     */
    Doctor findById(Integer id);

    /**
     * Inserts or updates a doctor.
     *
     * @param doctor a doctor to save
     * @return a saved doctor
     */
    Doctor save(Doctor doctor);

    /**
     * Removes an existing doctor.
     *
     * @param doctor a doctor to remove
     */
    void delete(Doctor doctor);

    /**
     * Removes a doctor by id.
     *
     * @param id id of a doctor
     */
    void delete(Integer id);

    /**
     * Checks whether a doctor exists.
     *
     * @param id id of a doctor
     * @return true if exists, false otherwise
     */
    boolean exists(Integer id);
}
