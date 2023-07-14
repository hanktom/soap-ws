package com.soetek.soapws.repository;

import com.soetek.soapws.model.TblCountry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TblCountryRepository extends JpaRepository<TblCountry, Integer> {
    public TblCountry findByCountryName(String countryName);
}