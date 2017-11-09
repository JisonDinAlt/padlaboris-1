package com.instinctools.padlaboris.service;

import com.instinctools.padlaboris.model.Address;

import java.util.List;

public interface AddressService {

    /**
     * Fetch all addresses.
     *
     * @return a list of addresses
     */
    List<Address> findAll();

    /**
     * Inserts or updates a disease.
     *
     * @param address a address to save
     * @return a saved address
     */
    Address save(Address address);

    /**
     * Removes a address by id.
     *
     * @param id id of a address
     */
    void delete(Integer id);

    /**
     * Checks whether a address exists.
     *
     * @param id id of a address
     * @return true if exists, false otherwise
     */
    boolean exists(Integer id);
}
