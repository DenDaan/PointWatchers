package be.vleugels.daan.ww;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.Period;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: Daan
 * Date: 6/03/12
 * Time: 22:26
 * To change this template use File | Settings | File Templates.
 */
@Entity
@NamedQueries(
        @NamedQuery(name = "Person.findAll", query = "select p from Person p")
)
public class Person implements Serializable {
    
    private static int MATURE_AGE = 18;

    @Id
    @GeneratedValue
    private long id;

    @Column(name="FIRST_NAME")
    private String firstName;
    @Column(name="LAST_NAME")
    private String lastName;
    @Column(name="BIRTHDAY")
//    @Temporal(TemporalType.TIMESTAMP)
//    private Date birthDay;
    @Embedded
    private Address address;
    
    public Person(String firstName, String lastName, Date birthDay, Address address){
        this.firstName = firstName;
        this.lastName = lastName;
       // this.birthDay = birthDay;
        this.address = address;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected Person() {
    }

/*    public boolean isMature(){
        if(birthDay!=null){
            DateTime now = new DateTime();
            Period difference = new Period(now, birthDay);
            if(difference.getYears() >= MATURE_AGE){
                return true;
            }
        } return false;
    }                     */

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
               // ", birthDay=" + birthDay +
                ", address=" + address +
                '}';
    }
}
