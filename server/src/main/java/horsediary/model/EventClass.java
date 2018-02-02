package main.java.horsediary.model;

public enum EventClass {

    WARNING("event-warning"),
    SUCCESS("event-info"),
    INFO("event-success"),
    INVERSE("event-inverse"),
    SPECIAL("event-special"),
    IMPORTANT("event-important");

    private String clazz;

    private EventClass( String clazz){
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return this.clazz;
    }
}
