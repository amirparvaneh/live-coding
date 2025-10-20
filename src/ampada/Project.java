package ampada;



import java.util.Date;



public class Project {
    private String name;
    private Date startDate;

    public Project(String name, Date startDate) {
        this.name = name;
        this.startDate = startDate;
    }

    public Project() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }
}


