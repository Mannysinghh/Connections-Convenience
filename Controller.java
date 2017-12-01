import javax.swing.*;
import java.util.*;

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
            "Carlos Meserve",
            "Laurie Bean",
            "Cyrstal Marone",
            "Meagan Lafon",
            "Glynda Wenrich",
            "Brandi Delph",
            "Ashlie Peffer",
            "Brynn Conigliaro",
            "Wynona Dames",
            "Tressa Deblasio",
            "Denese Douthit",
            "Adeline Parkes",
            "Arlette Richarson",
            "Irving Mcdill",
            "Dawn Rolston",
            "Darwin Braunstein",
            "Edris Bay",
            "Apolonia Demps",
            "Erik Smale",
            "Senaida Brunelle",
            "Katharina Arms",
            "Shaunta Baltz",
            "Jacqui Herbert",
            "Talitha Warnke",
            "Marcelina Mecham",
            "Cindy Rogue",
            "Lennie Hinkley",
            "Hope Bellin",
            "Deonna Weist",
            "Macy Pablo",
            "Herman Tobia",
            "Marian Ketterer",
            "Celia Hutson",
            "Marina Schipper",
            "Lenore Kendricks",
            "Mario Stjohn",
            "Madelyn Pendelton",
            "Anglea Cobian",
            "Dovie Mcgarity",
            "Samantha Bryd",
            "Ciera Pellegren",
            "Lavonna Wingo",
            "Shaunte Kavanaugh",
            "Corina Leong",
            "Hermelinda Karzak",
            "Lionel Baltes",
            "Lucy Bohr",
            "Magnolia Ringgold",
            "Colette Julio",
            "Jarrett Stadler",
    };

    private String[] degreeList = {"CS",  "NETW", "NETW","CMPE", "CMPE",
            "CMPE",  "MIS", "SE", "SE", "SE", "SE", "MIS",  "MIS", "MIS", "CS",
            "MIS", "CS", "CS", "CS", "CMPE","CMPE","CMPE","CS", "SE","CS", "MIS",
            "CS", "NETW", "NETW", "CMPE", "NETW", "SE", "MIS",
            "MIS", "CMPE", "CMPE", "NETW", "NETW", "NETW", "CS",
            "SE", "CMPE", "MIS", "SE", "MIS", "SE", "CMPE", "NETW", "NETW", "NETW"};

    private int[] salaryList = {3000, 4000, 5000, 6000, 7000, 5000, 6000, 7000,
            4000, 3000, 3000, 4000, 3000, 4000, 5000, 6000, 7000, 5000, 6000, 7000,
            4000, 3000, 5000, 6000, 7000, 3000, 4000, 5000, 6000, 7000, 5000, 6000,
            7000, 4000, 3000, 5000, 6000, 3000, 4000, 5000, 6000, 7000, 5000, 6000,
            7000, 4000, 3000, 7000, 4000, 3000};

    private int[] qualityList = {1, 2, 2, 3, 5, 5, 3, 4, 1, 1, 1, 2, 3, 4, 4, 5,
            4, 4, 5, 4, 3, 2, 5, 3, 1, 5, 3, 4, 4, 5, 3, 3, 2, 2, 1, 5, 5, 1, 4, 4,
            3, 2, 5, 4, 5, 4, 3, 4, 5, 5};

    private int[] teamworkList = {5, 2, 2, 3, 5, 5, 3, 4, 1, 1, 1, 2, 3, 4, 4,
            5, 4, 4, 5, 4, 3, 2, 5, 3, 3, 2, 3, 4, 4, 5, 3, 3, 2, 2, 1, 5, 5, 5, 5,
            3, 3, 1, 5, 3, 5, 4, 2, 5, 3, 2};


    //    private String[] degreeListSorted;
    private int[] salaryListSorted;
    private int[] qualityListSorted;
    private int[] teamworkListSorted;

    private Hashtable<String, List<String>> mapDegreeKey = new Hashtable<>();
    private Hashtable<Integer, List<String>> mapSalaryKey = new Hashtable<>();
    private Hashtable<Integer, List<String>> mapQualityKey = new Hashtable<>();
    private Hashtable<Integer, List<String>> mapTeamworkKey = new Hashtable<>();

    private Hashtable<String, String> mapEmployeeTraits = new Hashtable<>();

    private List<String> qualityMapList = null;
    private List<String> salaryMapList = null;
    private List<String> teamWorkMapList = null;
    private List<String> degreeMapList = null;

    public List<String> getQualityMapList() {
        return qualityMapList;
    }

    public void setQualityMapList(List<String> qualityMapList) {
        this.qualityMapList = qualityMapList;
    }

    public List<String> getSalaryMapList() {
        return salaryMapList;
    }

    public void setSalaryMapList(List<String> salaryMapList) {
        this.salaryMapList = salaryMapList;
    }

    public List<String> getTeamWorkMapList() {
        return teamWorkMapList;
    }

    public void setTeamWorkMapList(List<String> teamWorkMapList) {
        this.teamWorkMapList = teamWorkMapList;
    }

    public List<String> getDegreeMapList() {
        return degreeMapList;
    }

    public void setDegreeMapList(List<String> degreeMapList) {
        this.degreeMapList = degreeMapList;
    }

    private void initiateMaps(){
        for(int i = 0; i < employeeList.length; i++){

            String traits = degreeList[i] + ":" + qualityList[i] + ":" + salaryList[i] + ":" + teamworkList[i];

            mapEmployeeTraits.put(traits, employeeList[i]);


            if (mapQualityKey.containsKey(qualityList[i])) {
                qualityMapList = mapQualityKey.get(qualityList[i]);
                qualityMapList.add(employeeList[i]);
            } else {
                qualityMapList = new ArrayList<>();
                qualityMapList.add(employeeList[i]);
                mapQualityKey.put(qualityList[i], qualityMapList);
            }

            if (mapSalaryKey.containsKey(salaryList[i])) {
                salaryMapList = mapSalaryKey.get(salaryList[i]);
                salaryMapList.add(employeeList[i]);
            } else {
                salaryMapList = new ArrayList<>();
                salaryMapList.add(employeeList[i]);
                mapSalaryKey.put(salaryList[i], salaryMapList);
            }

            if (mapTeamworkKey.containsKey(qualityList[i])) {
                teamWorkMapList = mapTeamworkKey.get(teamworkList[i]);
                teamWorkMapList.add(employeeList[i]);
            } else {
                teamWorkMapList = new ArrayList<>();
                teamWorkMapList.add(employeeList[i]);
                mapTeamworkKey.put(teamworkList[i], teamWorkMapList);
            }

            if (mapDegreeKey.containsKey(degreeList[i])) {
                degreeMapList = mapDegreeKey.get(degreeList[i]);
                degreeMapList.add(employeeList[i]);
            } else {
                degreeMapList = new ArrayList<>();
                degreeMapList.add(employeeList[i]);
                mapDegreeKey.put(degreeList[i], degreeMapList);
            }
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

    public String findMatch(String degree, int quality, int salary, int teamwork){
        String match = "No Specific Match Found";

        String traitMatch = degree + ":" + quality + ":" + salary + ":" + teamwork;

        if (mapEmployeeTraits.get(traitMatch) != null) {
            match = mapEmployeeTraits.get(traitMatch);
        }

        return match;
    }

    private static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0;
        for (int k = 0; k < c.length; k++) {
            if      (i >= a.length) c[k] = b[j++];
            else if (j >= b.length) c[k] = a[i++];
            else if (a[i] <= b[j])  c[k] = a[i++];
            else                    c[k] = b[j++];
        }
        return c;
    }

    public static void mergeSortString(String[] names) {
        if (names.length >= 2) {
            String[] left = new String[names.length / 2];
            String[] right = new String[names.length - names.length / 2];

            for (int i = 0; i < left.length; i++) {
                left[i] = names[i];
            }

            for (int i = 0; i < right.length; i++) {
                right[i] = names[i + names.length / 2];
            }

            mergeSortString(left);
            mergeSortString(right);
            mergeSTR(names, left, right);
        }
    }

    public static void mergeSTR(String[] names, String[] left, String[] right) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < names.length; i++) {
            if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
                names[i] = left[a];
                a++;
            } else {
                names[i] = right[b];
                b++;
            }
        }
    }

    public static int[] mergesort(int[] input) {
        int N = input.length;
        if (N <= 1) return input;
        int[] a = new int[N/2];
        int[] b = new int[N - N/2];
        for (int i = 0; i < a.length; i++) {
            a[i] = input[i];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = input[i + N / 2];
        }
        return merge(mergesort(a), mergesort(b));
    }

    private static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i-1]) return false;
        return true;
    }

    public void arraySort(){
        salaryListSorted = mergesort(salaryList);
        teamworkListSorted = mergesort(teamworkList);
        qualityListSorted = mergesort(qualityList);
    }

    public String find(int type, Object search){
        switch(type){
            case 1:
                if (null != search && mapDegreeKey.containsKey(search)) {
                    String degreeVal = "\n";
                    for (String emp : mapDegreeKey.get(search)) {
                        degreeVal += emp + "\n";
                    }
                    System.out.println(degreeVal);
                    return degreeVal;
                }
                break;
            case 2:
                if (null != search && mapQualityKey.containsKey(search)) {
                    String qualityVal = "\n";
                    for (String emp : mapQualityKey.get(search)) {
                        qualityVal += emp + "\n";
                    }
                    System.out.println(qualityVal);
                    return qualityVal;
                }
                break;
            case 3:
                if (null != search && mapSalaryKey.containsKey(search)) {
                    String salaryVal = "\n";
                    for (String emp : mapSalaryKey.get(search)) {
                        salaryVal += emp + "\n";
                    }
                    System.out.println(salaryVal);
                    return salaryVal;
                }
                break;
            case 4:
                if (null != search && mapTeamworkKey.containsKey(search)) {
                    String teamworkVal = "\n";
                    for (String emp : mapTeamworkKey.get(search)) {
                        teamworkVal += emp + "\n";
                    }
                    System.out.println(teamworkVal);
                    return teamworkVal;
                }
                break;
        }
        return null;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getTeamwork() {
        return teamwork;
    }

    public void setTeamwork(int teamwork) {
        this.teamwork = teamwork;
    }

}