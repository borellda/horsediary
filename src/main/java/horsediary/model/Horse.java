package horsediary.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * Created by danielb on 03.09.17.
 */
@Entity
@Table(name="horses")
public class Horse extends BaseEntity{

    private String Name;

    private String callName;

    private LocalDate dateOfBirth;

    private HorseState state;

    private String defaultFood;

    private String specialFood;


    public long getAge(){
        long yearsDelta = dateOfBirth.until(LocalDate.now(), ChronoUnit.YEARS);
        return yearsDelta;
    }


}
