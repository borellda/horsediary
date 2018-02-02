package main.java.horsediary.converter;


import org.springframework.core.convert.converter.Converter;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;


public class DateConverter implements Converter<Date, LocalDate> {



    @Override
    public LocalDate convert(Date value) {
        Instant instant = value.toInstant();
        return LocalDate.from(instant);
    }
}
