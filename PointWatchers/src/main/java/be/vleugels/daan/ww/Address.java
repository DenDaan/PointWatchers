package be.vleugels.daan.ww;

import javax.persistence.Embeddable;

/**
 * Created by IntelliJ IDEA.
 * User: Daan
 * Date: 6/03/12
 * Time: 22:29
 * To change this template use File | Settings | File Templates.
 */
@Embeddable
public class Address {
    private String street;
    private int number;
    private int zipCode;
    private String city;
    private String country;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
