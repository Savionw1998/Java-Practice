public class ProjectTest {
    public static void main(String[] args) {
        Project Project1 = new Project();
        Project Project2 = new Project("Project2");
        Project Project3 = new Project("Project3", "I have a description");
        Project Project4 = new Project("Project4", "I have a description also", 1000.0);
        String a = Project1.name;
        String b = Project1.description;
        Double z = Project1.intialCost;
        String c = Project2.name;
        String d = Project2.description;
        Double y = Project2.intialCost;
        String e = Project3.name;
        String f = Project3.description;
        Double x = Project3.intialCost;
        String g = Project4.name;
        String h = Project4.description;
        Double w = Project4.intialCost;
        System.out.println("my name is " + a + " and " + b + " " + z);
        System.out.println("my name is " + c + " and " + d + " " + y);
        System.out.println("my name is " + e + " and " + f + " " + x);
        System.out.println("my name is " + g + " and " + h + " " + w);
    }
}