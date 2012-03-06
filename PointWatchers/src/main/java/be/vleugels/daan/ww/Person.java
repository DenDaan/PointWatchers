package be.vleugels.daan.ww;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.Period;

/**
 * Created by IntelliJ IDEA.
 * User: Daan
 * Date: 6/03/12
 * Time: 22:26
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    
    private static int MATURE_AGE = 18;
    
    private String firstName;
    private String lastName;
    private DateTime birthDay;
    private Address address;
    
    public Person(String firstName, String lastName, DateTime birthDay, Address address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.address = address;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public boolean isMature(){
        if(birthDay!=null){
            DateTime now = new DateTime();
            Period difference = new Period(now, birthDay);
            if(difference.getYears() >= MATURE_AGE){
                return true;
            }
        } return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay=" + birthDay +
                ", address=" + address +
                '}';
    }
}
