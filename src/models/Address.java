package models;

import java.util.Map;

public class Address {
    // Attributes
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Map<String, String> geo;

    // Constructor
    public Address() {

    }

    // Methods
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipCode) {
        this.zipcode = zipCode;
    }

    public Map<String, String> getGeo() {
        return geo;
    }

    public void setGeo(Map<String, String> geo) {
        this.geo = geo;
    }

}
