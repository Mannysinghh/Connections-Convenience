import javax.swing.*;

public class cmpe130projectjava {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    createAndShowGUI();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public static void createAndShowGUI() throws Exception {
        Model app = new Model();
        new View(app);
    }
}

