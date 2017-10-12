package horsediary.converter;


import org.springframework.core.convert.converter.Converter;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;


public class LocalDateConverter implements Converter<LocalDate, Date> {

    @Override
    public Date convert(LocalDate date) {
        Instant instant = Instant.from(date);
        return Date.from(instant);
    }

}
