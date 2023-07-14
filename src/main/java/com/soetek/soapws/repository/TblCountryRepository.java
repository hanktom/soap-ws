package com.soetek.soapws.repository;

import com.soetek.soapws.model.TblCountry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TblCountryRepository extends JpaRepository<TblCountry, Integer> {
    TblCountry findByCountryNameIgnoreCase(String countryName);
    public TblCountry findByCountryName(String countryName);

    List<TblCountry> findByLanguageCodesContainsIgnoreCase(String languageCodes);

    @Query("select c from TblCountry c where c.languageCodes LIKE %?1%")
    List<TblCountry> findAllByLanguage(String langCode);
}