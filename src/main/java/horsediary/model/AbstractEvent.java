package horsediary.model;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "Event")
public class AbstractEvent extends BaseEntity {

 private String title;
 private String url;
 private EventClass clazz;
 private long start;
 private long end;
    @DynamoDBAttribute
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @DynamoDBAttribute
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public EventClass getClazz() {
        return clazz;
    }

    public void setClazz(EventClass clazz) {
        this.clazz = clazz;
    }
    @DynamoDBAttribute
    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }
    @DynamoDBAttribute
    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }
}
