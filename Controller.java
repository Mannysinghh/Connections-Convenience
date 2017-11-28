import java.util.Hashtable;

public class Controller {
    private String degree;
    private int salary;
    private int price;
    private int teamwork;
    private String[] collegeList = {"sjsu", "sjcc", "ucsd", "ucla",
            "ucd", "sdsu", "evc", "sfsu", "ucsf"};

    private String[] degreeList = {"CS", "CMPE", "SE", "MIS", "Networking"};
    private double[] salaryList = {3500, 500, 4200, 5000, 3800, 3200, 700, 3000, 4400};
    private double[] qualityList = {4.5, 2.0, 4.7, 5.0, 4.2, 4.0, 2.5, 4.0, 4.5};
    private double[] teamworkList = {10, 15, 450, 400, 200, 460, 15, 65, 70};

    Hashtable<String, String> mapDegree = new Hashtable<>();
    Hashtable<String, Double> mapPrice = new Hashtable<>();
    Hashtable<String, Double> mapQuality = new Hashtable<>();
    Hashtable<String, Double> mapTeamwork = new Hashtable<>();



    private void initiateMaps(){
        mapPrice = new Hashtable<>();
        mapQuality = new Hashtable<>();
        mapTeamwork = new Hashtable<>();
        mapDegree = new Hashtable<>();
        for(int i = 0; i < collegeList.length; i++){
            mapQuality.put(collegeList[i], qualityList[i]);
            mapPrice.put(collegeList[i], salaryList[i]);
            mapTeamwork.put(collegeList[i], teamworkList[i]);
            mapDegree.put(collegeList[i], degreeList[i]);
        }
    }
    public Controller(String degree, int distance, int price, int time) {
        this.degree = degree;
        this.salary = distance;
        this.price = price;
        this.teamwork = time;

        initiateMaps();

    }

    public void printMaps() {
        for (int i = 0; i < collegeList.length; i++) {
            //
        }
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTeamwork() {
        return teamwork;
    }

    public void setTeamwork(int teamwork) {
        this.teamwork = teamwork;
    }

//    public void calculatePath(int degree, int salary, int price, int teamwork){
//
//    }


}
