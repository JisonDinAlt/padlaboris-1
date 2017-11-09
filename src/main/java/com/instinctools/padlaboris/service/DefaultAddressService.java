package com.instinctools.padlaboris.service;

import com.instinctools.padlaboris.model.Address;
import com.instinctools.padlaboris.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * class that implements the Addresses work and databases.
 */

@Service
    @RequiredArgsConstructor(onConstructor = @__(@Autowired))
    public class DefaultAddressService implements AddressService {

    private final AddressRepository addressRepository;


    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    @Override
    public Address save(final Address address) {
        return addressRepository.save(address);
    }

    @Override
    public void delete(final Integer id) {
        addressRepository.delete(id);
    }

    @Override
    public boolean exists(final Integer id) {
        return addressRepository.exists(id);
    }
}
