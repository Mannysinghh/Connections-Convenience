import javax.swing.*;

public class cmpe130projectjava {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    Model app = new Model();
                    new View(app);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}

