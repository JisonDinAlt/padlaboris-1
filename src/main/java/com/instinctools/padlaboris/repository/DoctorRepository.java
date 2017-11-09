package com.instinctools.padlaboris.repository;

import com.instinctools.padlaboris.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

    /**
     * Searches doctor by name.
     *
     * @param doctorLastName of a doctor
     * @return a list of doctor
     */
    @Query(value = "SELECT * FROM doctor WHERE doctor_lastName = :Lastname", nativeQuery = true)
    List<Doctor> findByDoctorLastName(@Param("lastName") String doctorLastName);


    /**
     * Searches doctor by department.
     *
     * @param department of a doctor
     * @return a list of doctor
     */
    @Query(value = "SELECT * FROM doctor WHERE department = :department", nativeQuery = true)
    List<Doctor> findByDoctorDepartment(@Param("department") String department);


}