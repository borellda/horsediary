package main.java.horsediary.model;


import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.Table;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * Created by danielb on 03.09.17.
 */
@Table
public class Horse extends BaseEntity{

    @Column
    private String Name;
    @Column
    private String callName;
    @Column
    private LocalDate dateOfBirth;
    @Column
    private HorseState state;
    @Column
    private String defaultFood;
    @Column
    private String specialFood;


    public long getAge(){
        long yearsDelta = dateOfBirth.until(LocalDate.now(), ChronoUnit.YEARS);
        return yearsDelta;
    }


}
