package com.soetek.soapws.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_country", schema = "demo")
public class TblCountry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_country", nullable = false)
    private Integer id;

    @Column(name = "`Country Name`", length = 32)
    private String countryName;

    @Column(name = "ISO2", length = 2)
    private String iso2;

    @Column(name = "ISO3", length = 3)
    private String iso3;

    @Column(name = "`Top Level Domain`", length = 2)
    private String topLevelDomain;

    @Column(name = "FIPS", length = 2)
    private String fips;

    @Column(name = "`ISO Numeric`")
    private Integer iSONumeric;

    @Column(name = "GeoNameID", length = 7)
    private String geoNameID;

    @Column(name = "E164")
    private Integer e164;

    @Column(name = "`Phone Code`", length = 19)
    private String phoneCode;

    @Column(name = "Continent", length = 13)
    private String continent;

    @Column(name = "Capital", length = 20)
    private String capital;

    @Column(name = "`Time Zone in Capital`", length = 30)
    private String timeZoneInCapital;

    @Column(name = "Currency", length = 13)
    private String currency;

    @Column(name = "`Language Codes`", length = 89)
    private String languageCodes;

    @Column(name = "Languages", length = 489)
    private String languages;

    @Column(name = "`Area KM2`")
    private Integer areaKM2;

    @Column(name = "`Internet Hosts`", length = 9)
    private String internetHosts;

    @Column(name = "`Internet Users`", length = 9)
    private String internetUsers;

    @Column(name = "`Phones (Mobile)`", length = 10)
    private String phonesMobile;

    @Column(name = "`Phones (Landline)`", length = 9)
    private String phonesLandline;

    @Column(name = "GDP", length = 14)
    private String gdp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getIso2() {
        return iso2;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3;
    }

    public String getTopLevelDomain() {
        return topLevelDomain;
    }

    public void setTopLevelDomain(String topLevelDomain) {
        this.topLevelDomain = topLevelDomain;
    }

    public String getFips() {
        return fips;
    }

    public void setFips(String fips) {
        this.fips = fips;
    }

    public Integer getISONumeric() {
        return iSONumeric;
    }

    public void setISONumeric(Integer iSONumeric) {
        this.iSONumeric = iSONumeric;
    }

    public String getGeoNameID() {
        return geoNameID;
    }

    public void setGeoNameID(String geoNameID) {
        this.geoNameID = geoNameID;
    }

    public Integer getE164() {
        return e164;
    }

    public void setE164(Integer e164) {
        this.e164 = e164;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getTimeZoneInCapital() {
        return timeZoneInCapital;
    }

    public void setTimeZoneInCapital(String timeZoneInCapital) {
        this.timeZoneInCapital = timeZoneInCapital;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLanguageCodes() {
        return languageCodes;
    }

    public void setLanguageCodes(String languageCodes) {
        this.languageCodes = languageCodes;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public Integer getAreaKM2() {
        return areaKM2;
    }

    public void setAreaKM2(Integer areaKM2) {
        this.areaKM2 = areaKM2;
    }

    public String getInternetHosts() {
        return internetHosts;
    }

    public void setInternetHosts(String internetHosts) {
        this.internetHosts = internetHosts;
    }

    public String getInternetUsers() {
        return internetUsers;
    }

    public void setInternetUsers(String internetUsers) {
        this.internetUsers = internetUsers;
    }

    public String getPhonesMobile() {
        return phonesMobile;
    }

    public void setPhonesMobile(String phonesMobile) {
        this.phonesMobile = phonesMobile;
    }

    public String getPhonesLandline() {
        return phonesLandline;
    }

    public void setPhonesLandline(String phonesLandline) {
        this.phonesLandline = phonesLandline;
    }

    public String getGdp() {
        return gdp;
    }

    public void setGdp(String gdp) {
        this.gdp = gdp;
    }

}