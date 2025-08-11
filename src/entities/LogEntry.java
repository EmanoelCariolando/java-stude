package entities;

import java.util.Date;
import java.util.Objects;

public class LogEntry {
    private String name;
    private Date moment;

    public LogEntry(String name,Date moment ) {
        this.moment = moment;
        this.name = name;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(name, logEntry.name) && Objects.equals(moment, logEntry.moment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, moment);
    }
}
