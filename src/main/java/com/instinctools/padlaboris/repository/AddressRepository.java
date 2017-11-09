package com.instinctools.padlaboris.repository;

import com.instinctools.padlaboris.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
/**
 * Repository for {@link Address}.
 */

public interface AddressRepository extends JpaRepository <Address,Integer>{

    /**
     * Searches address by id.
     */
    @Query(value = "SELECT * FROM address WHERE address_id = ?1", nativeQuery = true)
    List<Address> findByAddressiD(@Param("id") String id);

}
