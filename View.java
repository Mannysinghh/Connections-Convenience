import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class View {
    static JPanel CalendarPanel;
    static JPanel midPanel;
    static JPanel midpanel2;
    static JPanel midPanel3;
    static JPanel midPanel4;
    private Model classModel;
    static JFrame frame;
    static JButton resetButton;
    static JPanel panel;
    static JPanel lastPanel;
    static JPanel bottomPanel;
    static Container pane;

    static JButton exitButton;
    static JLabel degreeLabel;
    static JLabel qualityLabel;
    static JLabel salaryLabel;
    static JLabel teamWorkLabel;
    static JLabel dateLabel;
    static JLabel dateLabel2;
    static JLabel degreeErrorMessage;
    static JLabel qualityErrorMessage;
    static JLabel salaryErrorMessage;
    static JLabel teamworkErrorMessage;
    static JLabel mainError;
    private static JLabel dateJlabel;

    static JComboBox degreeBox;
    static JComboBox qualityBox;
    static JComboBox salaryBox;
    static JComboBox teamworkBox;
    ImageIcon imageIcon = new ImageIcon(new ImageIcon("/Users/Singh/Documents/Workspace/cmpe130projectjava/src/logo.png").getImage().getScaledInstance(400, 300, Image.SCALE_DEFAULT));

    static JLabel imgLabel;
    Date date = new Date();

    static JButton submitButton;
    Object degreeArray[] = {"Select", "CS", "CMPE", "SE", "MIS", "NETW"};
    Object qualityArray[] = {"Select", 1, 2, 3, 4, 5};
    Object salaryArray[] = {"Select", 3000, 4000, 5000, 6000, 7000};
    Object teamWorkArray[] = {"Select", 1, 2, 3, 4, 5};

    public View(final Model classModel) {
        Timer timer = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                dateJlabel.setText(new Date().toString());
            }
        });
        timer.start();

//        BufferedImage img = null;
//        try {
//            img = ImageIO.read(new File("/Users/Singh/Documents/Workspace/cmpe130projectjava/src/Picture1.png"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        Image dimg = img.getScaledInstance(label.getWidth(), label.getHeight(),
//                Image.SCALE_SMOOTH);

        imgLabel = new JLabel();
        imgLabel.setIcon(imageIcon);

        dateJlabel = new JLabel(new Date().toString());

        this.classModel = classModel;
        frame = new JFrame("Connections Convenience");
        frame.setSize(500, 500);
        panel = new JPanel();
        midPanel = new JPanel(new GridLayout(1,5));
        midpanel2 = new JPanel();
        midPanel3 = new JPanel(new GridLayout(1,5));
        midPanel4 = new JPanel();
        bottomPanel = new JPanel();
        lastPanel = new JPanel();
        CalendarPanel = new JPanel();
        pane = frame.getContentPane();
        CalendarPanel.setBorder(BorderFactory.createTitledBorder("Calendar"));
        TitledBorder border = new TitledBorder("Select your options: ");
        border.setTitleJustification(TitledBorder.CENTER);
        border.setTitlePosition(TitledBorder.TOP);

        midPanel.setBorder(border);
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        dateLabel2 = new JLabel(date.toString());

        degreeLabel = new JLabel("Degree");
        qualityLabel = new JLabel("Quality");
        salaryLabel = new JLabel("Salary");
        teamWorkLabel = new JLabel("Teamwork");

        degreeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        qualityLabel.setHorizontalAlignment(SwingConstants.CENTER);
        salaryLabel.setHorizontalAlignment(SwingConstants.CENTER);
        teamWorkLabel.setHorizontalAlignment(SwingConstants.CENTER);

        submitButton = new JButton("Submit");
        submitButton.setBackground(Color.GREEN);
        resetButton = new JButton("Reset");
        resetButton.setBackground(Color.YELLOW);
        exitButton = new JButton("Exit");
        exitButton.setBackground(Color.CYAN);

        dateLabel = new JLabel("Today's Date: ");

        degreeErrorMessage = new JLabel("Invalid Degree Option Selected");
        degreeErrorMessage.setForeground(Color.RED);
        salaryErrorMessage = new JLabel("Invalid Salary Option Selected");
        salaryErrorMessage.setForeground(Color.RED);
        qualityErrorMessage = new JLabel("Invalid Quality Option Selected");
        qualityErrorMessage.setForeground(Color.RED);
        teamworkErrorMessage = new JLabel("Invalid Teamwork Option Selected");
        teamworkErrorMessage.setForeground(Color.RED);
        mainError = new JLabel("All the selected option are invalid. Please, Try Again!");
        mainError.setForeground(Color.RED);

        degreeBox = new JComboBox();
        for (int i = 0; i < degreeArray.length; i++) {
            degreeBox.addItem(degreeArray[i]);
        }
        salaryBox = new JComboBox();
        for (int i = 0; i < salaryArray.length; i++) {
            salaryBox.addItem(salaryArray[i]);
        }
        qualityBox = new JComboBox();
        for (int i = 0; i < qualityArray.length; i++) {
            qualityBox.addItem(qualityArray[i]);
        }
        teamworkBox = new JComboBox();
        for (int i = 0; i < teamWorkArray.length; i++) {
            teamworkBox.addItem(teamWorkArray[i]);
        }

        panel.setBounds(0, 0, 30, 30);
        midPanel.setBounds(0, 50, 30, 20);
        midPanel.setPreferredSize(new Dimension(400, 350));
        midpanel2.setBounds(0, 40, 30, 10);
        midPanel.add(degreeLabel, BorderLayout.CENTER);
        midPanel.add(qualityLabel, BorderLayout.CENTER);
        midPanel.add(salaryLabel, BorderLayout.CENTER);
        midPanel.add(teamWorkLabel, BorderLayout.CENTER);


//        midPanel.add(topLabel, BorderLayout.CENTER);
        midPanel3.add(degreeBox, BorderLayout.CENTER);
        midPanel3.add(qualityBox, BorderLayout.CENTER);
        midPanel3.add(salaryBox, BorderLayout.CENTER);
        midPanel3.add(teamworkBox, BorderLayout.CENTER);
//        bottomPanel.setBounds(0, 180, 30, 30);
//        lastPanel.setBounds(0, 20, 30, 30);

        midPanel4.add(imgLabel, BorderLayout.CENTER);
        lastPanel.add(exitButton, BorderLayout.CENTER);
        lastPanel.add(resetButton, BorderLayout.CENTER);
        lastPanel.add(submitButton, BorderLayout.CENTER);
        panel.add(dateLabel, BorderLayout.SOUTH);
        panel.add(dateJlabel, BorderLayout.CENTER);

        pane.add(panel);
        pane.add(midpanel2);
        pane.add(midPanel);
        pane.add(midPanel3);
        pane.add(midPanel4);
        pane.add(bottomPanel);
        pane.add(lastPanel);

        frame.setVisible(true);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bottomPanel.remove(salaryErrorMessage);
                bottomPanel.remove(qualityErrorMessage);
                bottomPanel.remove(degreeErrorMessage);
                bottomPanel.remove(teamworkErrorMessage);
                bottomPanel.remove(mainError);
                Object degreeValue, salaryValue, qualityValue, teamworkValue;

                if (salaryBox.getSelectedItem() == salaryArray[0] &&
                        qualityBox.getSelectedItem() == qualityArray[0] &&
                        teamworkBox.getSelectedItem() == teamWorkArray[0] &&
                        degreeBox.getSelectedItem() == degreeArray[0]) {

                    bottomPanel.add(mainError, BorderLayout.SOUTH);
                    bottomPanel.updateUI();
                } else if (qualityBox.getSelectedItem() == qualityArray[0]) {
                    bottomPanel.add(qualityErrorMessage, BorderLayout.SOUTH);
                    bottomPanel.updateUI();
                    degreeValue = degreeBox.getSelectedItem();
                    salaryValue = salaryBox.getSelectedItem();
                    qualityValue = qualityBox.getSelectedItem();
                    teamworkValue = teamworkBox.getSelectedItem();
                    System.out.println("Degree: " + degreeValue);
                    System.out.println("Salary: " + salaryValue);
                    System.out.println("Quality: " + qualityValue);
                    System.out.println("Teamwork: " + teamworkValue);
                } else if (teamworkBox.getSelectedItem() == teamWorkArray[0]) {
                    bottomPanel.add(teamworkErrorMessage, BorderLayout.SOUTH);
                    bottomPanel.updateUI();
                    degreeValue = degreeBox.getSelectedItem();
                    salaryValue = salaryBox.getSelectedItem();
                    qualityValue = qualityBox.getSelectedItem();
                    teamworkValue = teamworkBox.getSelectedItem();
                    System.out.println("Degree: " + degreeValue);
                    System.out.println("Salary: " + salaryValue);
                    System.out.println("Quality: " + qualityValue);
                    System.out.println("Teamwork: " + teamworkValue);
                } else if (degreeBox.getSelectedItem() == degreeArray[0]) {
                    bottomPanel.add(degreeErrorMessage, BorderLayout.SOUTH);
                    bottomPanel.updateUI();
                    degreeValue = degreeBox.getSelectedItem();
                    salaryValue = salaryBox.getSelectedItem();
                    qualityValue = qualityBox.getSelectedItem();
                    teamworkValue = teamworkBox.getSelectedItem();
                    System.out.println("Degree: " + degreeValue);
                    System.out.println("Salary: " + salaryValue);
                    System.out.println("Quality: " + qualityValue);
                    System.out.println("Teamwork: " + teamworkValue);
                } else if (salaryBox.getSelectedItem() == salaryArray[0]) {
                    bottomPanel.add(salaryErrorMessage, BorderLayout.SOUTH);
                    bottomPanel.updateUI();
                    degreeValue = degreeBox.getSelectedItem();
                    salaryValue = salaryBox.getSelectedItem();
                    qualityValue = qualityBox.getSelectedItem();
                    teamworkValue = teamworkBox.getSelectedItem();
                    System.out.println("Degree: " + degreeValue);
                    System.out.println("Salary: " + salaryValue);
                    System.out.println("Quality: " + qualityValue);
                    System.out.println("Teamwork: " + teamworkValue);
                } else {
                    bottomPanel.remove(salaryErrorMessage);
                    bottomPanel.remove(qualityErrorMessage);
                    bottomPanel.remove(degreeErrorMessage);
                    bottomPanel.remove(teamworkErrorMessage);
                    bottomPanel.updateUI();
                    degreeValue = degreeBox.getSelectedItem();
                    salaryValue = salaryBox.getSelectedItem();
                    qualityValue = qualityBox.getSelectedItem();
                    teamworkValue = teamworkBox.getSelectedItem();
                    System.out.println("Degree: " + degreeValue);
                    System.out.println("Salary: " + salaryValue);
                    System.out.println("Quality: " + qualityValue);
                    System.out.println("Teamwork: " + teamworkValue);
                    System.out.println();

                    JLabel topD = new JLabel("Degree Matches");
                    JLabel topQ = new JLabel("Quality Matches");
                    JLabel topS = new JLabel("Salary Matches");
                    JLabel topT = new JLabel("Teamwork Matches");
                    JLabel topC = new JLabel("Combination Match");

                    topD.setHorizontalAlignment(SwingConstants.CENTER);
                    topQ.setHorizontalAlignment(SwingConstants.CENTER);
                    topS.setHorizontalAlignment(SwingConstants.CENTER);
                    topT.setHorizontalAlignment(SwingConstants.CENTER);
                    topC.setHorizontalAlignment(SwingConstants.CENTER);

//                    perform function
                    Controller cc = new Controller((String) degreeValue, (int) salaryValue, (int) qualityValue, (int) teamworkValue);
                    cc.arraySort();
                    cc.printMaps();
                    System.out.println();

                    long startSearchTime = System.nanoTime();
                    String degreeVal = cc.find(1, degreeValue);
                    String qualityVal = cc.find(2, qualityValue);
                    String salaryVal = cc.find(3, salaryValue);
                    String teamworkVal = cc.find(4, teamworkValue);

                    String exactMatch = cc.findMatch((String) degreeValue, (int) qualityValue, (int) salaryValue, (int) teamworkValue);

                    long endSearchTime   = System.nanoTime();
                    long totalSearchTime = endSearchTime - startSearchTime;

                    JPanel topP = new JPanel(new GridLayout(1,5));
                    JPanel middlePanel = new JPanel();
                    JPanel southPanel = new JPanel(new GridLayout(1,2));
                    JTextArea display = new JTextArea(16, 15);
                    JTextArea display2 = new JTextArea(16, 15);
                    JTextArea display3 = new JTextArea(16, 15);
                    JTextArea display4 = new JTextArea(16, 15);
                    JTextArea display5 = new JTextArea(16, 15);
                    display.setEditable(false); // set textArea non-editable
                    display2.setEditable(false); // set textArea non-editable
                    display3.setEditable(false); // set textArea non-editable
                    display4.setEditable(false); // set textArea non-editable
                    display5.setEditable(false);
                    JScrollPane scroll = new JScrollPane(display);
                    JScrollPane scroll2 = new JScrollPane(display2);
                    JScrollPane scroll3 = new JScrollPane(display3);
                    JScrollPane scroll4 = new JScrollPane(display4);
                    JScrollPane scroll5 = new JScrollPane(display5);
                    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);


                    String str1 = "";
                    String str2 = "";
                    String str3 = "";
                    String str4 = "";
                    str1 += degreeVal;
                    str2 += qualityVal;
                    str3 += salaryVal;
                    str4 += teamworkVal;

                    String[] str1sorted = str1.split("\n");
                    String[] str2sorted = str2.split("\n");
                    String[] str3sorted = str3.split("\n");
                    String[] str4sorted = str4.split("\n");

                    long startSortingTime = System.nanoTime();
                    cc.mergeSortString(str1sorted);
                    cc.mergeSortString(str2sorted);
                    cc.mergeSortString(str3sorted);
                    cc.mergeSortString(str4sorted);
                    long endSortingTime   = System.nanoTime();
                    long totalSortingTime = endSortingTime - startSortingTime;

//                    double totalSortingTimeSeconds = TimeUnit.SECONDS.convert(totalSortingTime, TimeUnit.NANOSECONDS);
//                    double totalSearchTimeSeconds = TimeUnit.SECONDS.convert(totalSearchTime, TimeUnit.NANOSECONDS);

                    JLabel totalSearchTimeLabel = new JLabel("Search Time: " + Double.toString(totalSearchTime) + " ns");
                    JLabel totalSortingTimeLabel = new JLabel("Sorting Time: " + Double.toString(totalSortingTime)  + " ns");

                    totalSearchTimeLabel.setHorizontalAlignment(SwingConstants.LEFT);
                    totalSortingTimeLabel.setHorizontalAlignment(SwingConstants.RIGHT);


                    String text1 = getText(str1sorted);
                    String text2 = getText(str2sorted);
                    String text3 = getText(str3sorted);
                    String text4 = getText(str4sorted);

                    if(exactMatch.equals("No Specific Match Found")){
                        display5.setForeground(Color.RED);
                    }
                    else{
                        display5.setForeground(Color.GREEN);
                    }
                    display.setText(text1);
                    display2.setText(text2);
                    display3.setText(text3);
                    display4.setText(text4);
                    display5.setText("\n" + exactMatch);

                    topP.add(topD);
                    topP.add(topQ);
                    topP.add(topS);
                    topP.add(topT);
                    topP.add(topC);
                    middlePanel.add(scroll);
                    middlePanel.add(scroll2);
                    middlePanel.add(scroll3);
                    middlePanel.add(scroll4);
                    middlePanel.add(scroll5);
                    southPanel.add(totalSearchTimeLabel);
                    southPanel.add(totalSortingTimeLabel);

                    southPanel.setBounds(0,0,100,100);
                    middlePanel.setBounds(0,100,100,100);
                    southPanel.setBounds(0,400,100,100);

                    JFrame newFrame = new JFrame("Output");
                    newFrame.add(topP, BorderLayout.NORTH);
                    newFrame.add (middlePanel, BorderLayout.CENTER);
                    newFrame.add(southPanel, BorderLayout.SOUTH);
                    newFrame.pack();
                    newFrame.setLocationRelativeTo(null);
                    newFrame.setVisible(true);
                    newFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                    newFrame.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosing(WindowEvent e) {
                            super.windowClosing(e);
                            resetButton.doClick();
                        }
                    });
                }
            }

        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                degreeBox.setSelectedItem(degreeArray[0]);
                teamworkBox.setSelectedItem(teamWorkArray[0]);
                salaryBox.setSelectedItem(salaryArray[0]);
                qualityBox.setSelectedItem(teamWorkArray[0]);
                bottomPanel.remove(salaryErrorMessage);
                bottomPanel.remove(qualityErrorMessage);
                bottomPanel.remove(degreeErrorMessage);
                bottomPanel.remove(teamworkErrorMessage);
                bottomPanel.updateUI();
            }
        });
        lastPanel.setVisible(true);
        midPanel.setVisible(true);
        midpanel2.setVisible(true);
        panel.setVisible(true);
    }

    private String getText(String[] strings) {
        String ss = "";
        for (int i = 0; i < strings.length; i++) {
            ss += strings[i] + " \n";
        }
        return ss;
    }

    public Model getModel() {
        return this.classModel;
    }

    public void setModel(Model classModel) {
        this.classModel = classModel;
    }
}