import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class Controller {
    private String degree;
    private int salary;
    private int price;
    private int teamwork;
//    private String[] employeeList = {"SJSU", "SJCC", "UCSD", "UCLA", "UCD ", "SDSU", "EVC ", "SFSU", "UCSF"};
//    private String[] degreeList = {"CS  ", "CMPE", "SE  ", "MIS ", "NETW", "CS  ", "CMPE", "SE  ", "MIS "};
//    private double[] salaryList = {3500, 500, 4200, 5000, 3800, 3200, 700, 3000, 4400};
//    private double[] qualityList = {4.5, 2.0, 4.7, 5.0, 4.2, 4.0, 2.5, 4.0, 4.5};
//    private double[] teamworkList = {10, 15, 450, 400, 200, 460, 15, 65, 70};

    private String[] employeeList = {
            "Carlos Meserve   ",
            "Laurie Bean      ",
            "Cyrstal Marone   ",
            "Meagan Lafon     ",
            "Glynda Wenrich   ",
            "Brandi Delph     ",
            "Ashlie Peffer    ",
            "Brynn Conigliaro ",
            "Wynona Dames     ",
            "Tressa Deblasio  ",
            "Denese Douthit   ",
            "Adeline Parkes   ",
            "Arlette Richarson",
            "Irving Mcdill    ",
            "Dawn Rolston     ",
            "Darwin Braunstein",
            "Edris Bay        ",
            "Apolonia Demps   ",
            "Erik Smale       ",
            "Senaida Brunelle ",
            "Katharina Arms   ",
            "Shaunta Baltz    ",
            "Jacqui Herbert   ",
            "Talitha Warnke   ",
            "Marcelina Mecham ",
            "Cindy Rogue      ",
            "Lennie Hinkley   ",
            "Hope Bellin      ",
            "Deonna Weist     ",
            "Macy Pablo       ",
            "Herman Tobia     ",
            "Marian Ketterer  ",
            "Celia Hutson     ",
            "Marina Schipper  ",
            "Lenore Kendricks ",
            "Mario Stjohn     ",
            "Madelyn Pendelton",
            "Anglea Cobian    ",
            "Dovie Mcgarity   ",
            "Samantha Bryd    ",
            "Ciera Pellegren  ",
            "Lavonna Wingo    ",
            "Shaunte Kavanaugh",
            "Corina Leong     ",
            "Hermelinda Karzak",
            "Lionel Baltes    ",
            "Lucy Bohr        ",
            "Magnolia Ringgold",
            "Colette Julio    ",
            "Jarrett Stadler  ",
    };

    private String[] degreeList = {"CS  ",  "NETW", "NETW","CMPE", "CMPE",
            "CMPE",  "MIS ", "SE  ", "SE  ", "SE  ", "SE  ", "MIS ",  "MIS ", "MIS ", "CS  ",
            "MIS ", "CS  ", "CS  ", "CS  ", "CMPE","CMPE","CMPE","CS  ", "SE  ","CS  ", "MIS ",
            "CS  ", "NETW", "NETW", "CMPE", "NETW", "SE  ", "MIS ",
            "MIS ", "CMPE", "CMPE", "NETW", "NETW", "NETW", "CS  ",
            "SE  ", "CMPE", "MIS ", "SE  ", "MIS ", "SE  ", "CMPE", "NETW", "NETW", "NETW"};

    private double[] salaryList = {3000, 4000, 5000, 6000, 7000, 5000, 6000, 7000,
            4000, 3000, 3000, 4000, 3000, 4000, 5000, 6000, 7000, 5000, 6000, 7000,
            4000, 3000, 5000, 6000, 7000, 3000, 4000, 5000, 6000, 7000, 5000, 6000,
            7000, 4000, 3000, 5000, 6000, 3000, 4000, 5000, 6000, 7000, 5000, 6000,
            7000, 4000, 3000, 7000, 4000, 3000};

    private double[] qualityList = {1, 2, 2, 3, 5, 5, 3, 4, 1, 1, 1, 2, 3, 4, 4, 5,
            4, 4, 5, 4, 3, 2, 5, 3, 1, 5, 3, 4, 4, 5, 3, 3, 2, 2, 1, 5, 5, 1, 4, 4,
            3, 2, 5, 4, 5, 4, 3, 4, 5, 5};

    private double[] teamworkList = {5, 2, 2, 3, 5, 5, 3, 4, 1, 1, 1, 2, 3, 4, 4,
            5, 4, 4, 5, 4, 3, 2, 5, 3, 3, 2, 3, 4, 4, 5, 3, 3, 2, 2, 1, 5, 5, 5, 5,
            3, 3, 1, 5, 3, 5, 4, 2, 5, 3, 2};


//    private String[] degreeListSorted;
    private double[] salaryListSorted;
    private double[] qualityListSorted;
    private double[] teamworkListSorted;


    Hashtable<String, String> mapDegree = new Hashtable<>();
    Hashtable<String, Double> mapPrice = new Hashtable<>();
    Hashtable<String, Double> mapQuality = new Hashtable<>();
    Hashtable<String, Double> mapTeamwork = new Hashtable<>();


    Hashtable<String, String> mapDegreeKey = new Hashtable<>();
    Hashtable<Double, String> mapPriceKey = new Hashtable<>();
    Hashtable<Double, String> mapQualityKey = new Hashtable<>();
    Hashtable<Double, String> mapTeamworkKey = new Hashtable<>();


    private void initiateMaps(){
        mapPrice = new Hashtable<>();
        mapQuality = new Hashtable<>();
        mapTeamwork = new Hashtable<>();
        mapDegree = new Hashtable<>();
        for(int i = 0; i < employeeList.length; i++){
            mapQuality.put(employeeList[i], qualityList[i]);
            mapPrice.put(employeeList[i], salaryList[i]);
            mapTeamwork.put(employeeList[i], teamworkList[i]);
            mapDegree.put(employeeList[i], degreeList[i]);


            mapQualityKey.put(qualityList[i], employeeList[i]);
            mapPriceKey.put(salaryList[i], employeeList[i]);
            mapTeamworkKey.put(teamworkList[i], employeeList[i]);
            mapDegreeKey.put(degreeList[i], employeeList[i]);
        }
    }

    public Controller() {
        initiateMaps();
        arraySort();
    }

    public Controller(String degree, int salary, int price, int teamwork) {
        this.degree = degree;
        this.salary = salary;
        this.price = price;
        this.teamwork = teamwork;

        initiateMaps();
        arraySort();
    }

    public void printMaps() {
        for (int i = 0; i < employeeList.length; i++) {
            System.out.println("Name: " + employeeList[i] +
                    " | Degree: " + degreeList[i] +
                    " | Salary: " + salaryList[i] +
                    " | Quality: " + qualityList[i] +
                    " | Teamwork: " + teamworkList[i]);
        }
    }

    public void printSortedList(){
        for (int i = 0; i < employeeList.length; i++) {
            System.out.println(" | Salary: " + salaryListSorted[i] +
                    " | Quality: " + qualityListSorted[i] +
                    " | Teamwork: " + teamworkListSorted[i]);
        }
    }

    public void printSortedHash(String s){
        List<String> nameList = Arrays.asList(employeeList);
        List<String> degList = Arrays.asList(degreeList);
        List<double[]> salList = Arrays.asList(salaryList);
        List<double[]> qualList = Arrays.asList(qualityList);
        List<double[]> teamList = Arrays.asList(teamworkList);

    }

    private static double[] merge(double[] a, double[] b) {
        double[] c = new double[a.length + b.length];
        int i = 0, j = 0;
        for (int k = 0; k < c.length; k++) {
            if      (i >= a.length) c[k] = b[j++];
            else if (j >= b.length) c[k] = a[i++];
            else if (a[i] <= b[j])  c[k] = a[i++];
            else                    c[k] = b[j++];
        }
        return c;
    }

    public static double[] mergesort(double[] input) {
        int N = input.length;
        if (N <= 1) return input;
        double[] a = new double[N/2];
        double[] b = new double[N - N/2];
        for (int i = 0; i < a.length; i++) {
            a[i] = input[i];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = input[i + N / 2];
        }
        return merge(mergesort(a), mergesort(b));
    }

    private static boolean isSorted(double[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i-1]) return false;
        return true;
    }

    public void arraySort(){
        salaryListSorted = mergesort(salaryList);
        teamworkListSorted = mergesort(teamworkList);
        qualityListSorted = mergesort(qualityList);
    }

    public String find(Object array, int type, Object search){
        String value ="";

        List<String> nameList = Arrays.asList(employeeList);
        List<String> degList = Arrays.asList(degreeList);
        List<double[]> salList = Arrays.asList(salaryList);
        List<double[]> qualList = Arrays.asList(qualityList);
        List<double[]> teamList = Arrays.asList(teamworkList);
        switch(type){
            case 1:
                if(salList.contains(array)) {
//                    View view = new View(model);
//                    view.newFrame();
                    for (int j = 0; j <= employeeList.length; j++) {
                        value += employeeList[j];
                    }
                    System.out.println(value);
                    return value;
                }
            case 2:
                if(qualList.contains(array)){

                }
            case 3:
                if(teamList.contains(array)){

                }

        }
        return null;
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


}
