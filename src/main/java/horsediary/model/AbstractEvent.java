package horsediary.model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class AbstractEvent extends BaseEntity {

 private String title;
 private String url;
 @Enumerated(EnumType.STRING)
 private EventClass clazz;
 private long start;
 private long end;

}
