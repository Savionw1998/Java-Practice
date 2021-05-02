public class Project {
    public String name;
    public String description;
    public Double intialCost;
    public String elivatorPitch(){
        return name + "," + description;
    }
    public Project() {
        this.name = "I have no name";
        this.description = "I have no description";
        this.intialCost = 0.0;
    }
    public Project(String name) {
        this.name = name;
        this.description = "I have no description";
        this.intialCost = 0.0;
    }
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
        this.intialCost = 0.0;
    }
    public Project(String name, String description, Double intialCost) {
        this.name = name;
        this.description = description;
        this.intialCost = intialCost;
    }
}