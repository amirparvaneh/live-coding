package amp2;

import java.util.Date;

public class Task {
    long id;
    Date startDate;


    public Task() {
    }


    public Task(long id, Date startDate) {
        this.id = id;
        this.startDate = startDate;
    }


    public long getId() {
        return id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}