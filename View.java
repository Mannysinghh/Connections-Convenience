import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;
import java.util.Date;
import javax.swing.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class View {
    static JPanel CalendarPanel;
    static JPanel midPanel;
    static JPanel midpanel2;
    private Model classModel;
    static JFrame frame;
    static JButton resetButton;
    static JPanel panel;
    static JPanel lastPanel;
    static JPanel bottomPanel;
    static Container pane;

    static JLabel topLabel;
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
    Date date = new Date();

    static JButton submitButton;
    Object degreeArray[] = {"Select", "CS", "CMPE", "SE", "MIS", "Networking"};
    Object qualityArray[] = {"Select", 1, 2, 3, 4, 5};
    Object salaryArray[] = {"Select", 3000, 4000, 5000, 6000, 7000};
    Object teamWorkArray[] = {"Select", 1, 2, 3, 4, 5};

    public View(final Model classModel){
        Timer timer = new Timer(1000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                dateJlabel.setText(new Date().toString());
            }
        });
        timer.start();
        dateJlabel =new JLabel(new Date().toString());

        this.classModel = classModel;
        frame = new JFrame("Connections Convenience");
        frame.setSize(500, 500);
        panel = new JPanel();
        midPanel = new JPanel();
        midpanel2 = new JPanel();
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
        topLabel = new JLabel("         Degree           Quality" +
                "              Salary        Teamwork               ");

        submitButton = new JButton("Submit");
        submitButton.setBackground(Color.GREEN);
        resetButton = new JButton("Reset");
        resetButton.setBackground(Color.YELLOW);
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
        for(int i = 0; i < degreeArray.length; i++){
            degreeBox.addItem(degreeArray[i]);
        }
        salaryBox = new JComboBox();
        for(int i = 0; i < salaryArray.length; i++){
            salaryBox.addItem(salaryArray[i]);
        }
        qualityBox = new JComboBox();
        for(int i = 0; i < qualityArray.length; i++){
            qualityBox.addItem(qualityArray[i]);
        }
        teamworkBox = new JComboBox();
        for(int i = 0; i < teamWorkArray.length; i++){
            teamworkBox.addItem(teamWorkArray[i]);
        }

        panel.setBounds(0, 0, 30, 30);
        midPanel.setBounds(0, 50, 30, 20);
        midPanel.setPreferredSize(new Dimension(400, 350));
        midpanel2.setBounds(0,40,30,10);
        midPanel.add(topLabel, BorderLayout.CENTER);
        midPanel.add(degreeBox, BorderLayout.CENTER);
        midPanel.add(qualityBox, BorderLayout.CENTER);
        midPanel.add(salaryBox, BorderLayout.CENTER);
        midPanel.add(teamworkBox, BorderLayout.CENTER);
        bottomPanel.setBounds(0,180,30,30);
        lastPanel.setBounds(0, 20, 30, 30);
        lastPanel.add(resetButton, BorderLayout.CENTER);
        lastPanel.add(submitButton, BorderLayout.CENTER);
        panel.add(dateLabel, BorderLayout.SOUTH);
        panel.add(dateJlabel, BorderLayout.CENTER);

        pane.add(panel);
//        pane.add(CalendarPanel);
        pane.add(midpanel2);
        pane.add(midPanel);
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


                if(salaryBox.getSelectedItem() == salaryArray[0] &&
                        qualityBox.getSelectedItem() == qualityArray[0] &&
                        teamworkBox.getSelectedItem() == teamWorkArray[0] &&
                        degreeBox.getSelectedItem() == degreeArray[0])
                {

                    bottomPanel.add(mainError, BorderLayout.SOUTH);
                    bottomPanel.updateUI();
                }
                else if(qualityBox.getSelectedItem() == qualityArray[0]){
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
                }
                else if(teamworkBox.getSelectedItem() == teamWorkArray[0]){
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
                }
                else if(degreeBox.getSelectedItem() == degreeArray[0]){
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
                }
                else if(salaryBox.getSelectedItem() == salaryArray[0]){
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
                }
                else{
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
//                    perform function

                    Controller cc = new Controller((String) degreeValue, (int) salaryValue, (int) qualityValue, (int) teamworkValue);
                    cc.arraySort();
                    cc.printMaps();

                    System.out.println();


                    String degreeVal = cc.find(null, 1, degreeValue);
                    String qualityVal = cc.find(null, 2, qualityValue);
                    String salaryVal = cc.find(null, 3, salaryValue);
                    String teamworkVal = cc.find(null, 4, teamworkValue);

//                    cc.find(degreeValue, 1, salaryValue);

                    JFrame newFrame;
                    JPanel leftPanel = new JPanel();
                    JLabel nameLabel = new JLabel();
                    JLabel frameTwoTopLabel;
                    //newFrame = new JFrame("Output");
                    //newFrame.setSize(600, 600);
                    //frameTwoTopLabel = new JLabel("         Degree: " + degreeVal + "           Quality: "  + qualityVal +
                    //        "              Salary: " + salaryVal + "        Teamwork: " + teamworkVal);
                    //-----------------------------------My ADDITION----------------------

                    JPanel middlePanel = new JPanel ();
                    JTextArea display = new JTextArea ( 16, 58 );
                    display.setEditable ( false ); // set textArea non-editable
                    JScrollPane scroll = new JScrollPane ( display );
                    scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );

                    //Add Textarea in to middle panel
                    middlePanel.add ( scroll );

                    // My code
                    JFrame frame = new JFrame("Output");
                    frame.add ( middlePanel );
                    frame.pack ();
                    frame.setLocationRelativeTo ( null );
                    frame.setVisible ( true );

                    String str1 = "";
                    String str2 = "";
                    str1 += degreeVal + qualityVal +salaryVal + teamworkVal;
                    display.setText(str1);


                    //-------------------------------MY ADDITION-----------------------------
                  //  nameLabel.setText(cc.find(salaryValue, 1, salaryValue));
                    //newFrame.add(frameTwoTopLabel, BorderLayout.CENTER);
                    //newFrame.add(leftPanel, BorderLayout.WEST);
                    //newFrame.add(nameLabel, BorderLayout.EAST);
                    //newFrame.setVisible(true);

                }
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

    public Model getModel() {
        return this.classModel;
    }

    public void setModel(Model classModel) {
        this.classModel = classModel;
    }
}