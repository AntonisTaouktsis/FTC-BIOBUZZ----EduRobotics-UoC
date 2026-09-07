import javax.swing.*;
import java.awt.*;

class Calculator{

    //Αγνοήστε αυτή τη γραμμή-----------------------------------------
    public static final int ERROR = Integer.MIN_VALUE; //           --
    //----------------------------------------------------------------
    public static double add(double a, double b){
        // Δημιουργήστε μία μεταβλητή (τύπου double) με όνομα sum.
        // Σε αυτήν, βάλτε το άθροισμα του a και του b


        return sum;
    }

    public static double sub(double a, double b){
        // Δημιουργήστε μία μεταβλητή (τύπου double) με όνομα sum.
        // Σε αυτήν, βάλτε το αποτέλεσμα της αφαίρεσης του a και του b


        return sum;
    }

    public static double mul(double a, double b){
        // Δημιουργήστε μία μεταβλητή (τύπου double) με όνομα product
        // Σε αυτήν, βάλτε το αποτέλεσμα της αφαίρεσης του a και του b



        return product;
    }

    public static double div(double a, double b){
        // Δημιουργήστε μία μεταβλητή (τύπου double) με όνομα quo
        // Σε αυτήν, βάλτε το αποτέλεσμα της αφαίρεσης του a και του b.
        // ΠΡΟΣOXH στο ποια διαιρεση γίνεται και ποια όχι. Να θυμάστε ότι πάντα
        // πρέπει να έχει μία τιμή το quo. Για αυτόν τον λόγο το αρχικοποιούμε με ERROR.
        // Αν η διαίρεση δεν γίνεται (αρα αν ο παρονομαστής ισούται με το 0), η τιμή του quo
        // δεν θα αλλάξει και θα είναι ERROR
        double quo = ERROR;  //Διατηρήστε αυτήν την τιμή μόνο ΚΑΙ ΜΟΝΟ αν η διαίρεση δεν γίνεται
        //ΓΡΑΨΤΕ ΕΔΩ

        return quo;
    }

    public static void main(String[] args){
        // Εδώ είναι η κύρια συνάρτηση από το κομπιουτεράκι
        // Παίρνουμε εμείς το input για εσάς. Εσείς πρέπει να κάνετε
        // τις αντίστοιχες πράξεις, χρησιμοποιώντας τις παραπάνω συναρτήσεις.
        // Χρησιμοποιούμε μία συνάρτηση γράφοντας τη λέξη που βρίσκεται ακριβώς
        // δίπλα από το double. ΠΧ για μία πρόσθεση του αριθμού 1 και του αριθμού 2 γράφουμε add(1,2);
        //
        // ΑΓΝΟΕΙΣΤΕ ΤΙΣ ΔΙΚΕΣ ΜΑΣ ΣΥΝΑΡΤΗΣΕΙΣ.
        // Για να ξέρετε ποια πράξη να κάνετε χρησιμοποιείστε τη μεταβλή mode. Αυτό παίρνει τις τιμές
        // Mode.ADD, Mode.SUB, Mode.DIV, Mode.MUL (πρόσθεση, αφαίρεση, διαίρεση και πολλαπλασιασμό αντίστοιχα)

        // ΑΓΝΟΕΙΣΤΕ ΑΥΤΟ ΤΟ ΚΟΜΜΑΤΙ---------------------
        while(true){                                    // |
            Calculator calculator = new Calculator();   // |
                                                        // |
            CalculatorGUI gui = new CalculatorGUI();    // |
                                                        // |
            double a = gui.getA();                      // |
            double b = gui.getB();                      // |
            Mode mode = gui.getMode();                  // |
                                                        // |
            double result = 0;                          // |
//-------------------------------------------------------

            //ΓΡΑΨΤΕ ΕΔΩ. Οι μεταβλητές σας λέγονται a και b.
            // Ακόμα, η πράξη την οποία πρέπει να κάνετε λέγεται mode και παίρνει τις τιμές
            // Mode.ADD, Mode.SUB, Mode.MUL, Mode.DIV
            // Για ευκολία δίνουομε την πρώτη συνθήκη

            if(mode == Mode.ADD){
                result = // Συμπληρώστε εδώ add(a,b);
            }

            else if(/**Συμπληρώστε τη συνθήκη **/){
                /** Τι τιμή πρέπει να έχει το result?*/
            }

            /**Συμληρώστε τις υπόλοιπες συνθήκες*/

            // ΑΓΝΟΗΣΤΕ ΟΤΙΔΗΠΟΤΕ ΒΡΙΣΚΕΤΑΙ ΠΑΡΑ ΚΑΤΩ
            gui.showResult(result);
        }
    }
}


// ============================================================================
//
//                  ΑΓΝΟΗΣΤΕ ΤΟΝ ΚΩΔΙΚΑ ΑΠΟ ΕΔΩ ΚΑΙ ΚΑΤΩ
//
// ============================================================================


enum Mode{
    ADD,
    SUB,
    DIV,
    MUL
}



class CalculatorGUI{

    private double a;
    private double b;
    private Mode mode;

    private JDialog window;

    private JTextField firstNumber;
    private JTextField secondNumber;

    private JComboBox<Mode> operationBox;

    private JLabel errorLabel;


    public CalculatorGUI(){

        createWindow();

        window.setVisible(true);
    }



    private void createWindow(){

        window = new JDialog();

        window.setTitle("EduRobotics Calculator");

        window.setModal(true);

        window.setDefaultCloseOperation(
                JDialog.DISPOSE_ON_CLOSE
        );

        window.setSize(
                450,
                350
        );

        window.setLocationRelativeTo(null);



        JLabel title = new JLabel(
                "CALCULATOR",
                SwingConstants.CENTER
        );

        title.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        28
                )
        );



        firstNumber = new JTextField();

        firstNumber.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        20
                )
        );



        secondNumber = new JTextField();

        secondNumber.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        20
                )
        );



        operationBox = new JComboBox<>(
                Mode.values()
        );

        operationBox.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        18
                )
        );



        JButton calculateButton =
                new JButton("Υπολογισμός");


        calculateButton.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        18
                )
        );



        errorLabel = new JLabel(
                " ",
                SwingConstants.CENTER
        );

        errorLabel.setFont(
                new Font(
                        "Arial",
                        Font.PLAIN,
                        15
                )
        );



        JPanel inputPanel =
                new JPanel(
                        new GridLayout(
                                3,
                                2,
                                10,
                                10
                        )
                );


        inputPanel.add(
                new JLabel(
                        "Πρώτος αριθμός:"
                )
        );

        inputPanel.add(
                firstNumber
        );


        inputPanel.add(
                new JLabel(
                        "Δεύτερος αριθμός:"
                )
        );

        inputPanel.add(
                secondNumber
        );


        inputPanel.add(
                new JLabel(
                        "Πράξη:"
                )
        );

        inputPanel.add(
                operationBox
        );



        JPanel mainPanel =
                new JPanel();


        mainPanel.setLayout(
                new BoxLayout(
                        mainPanel,
                        BoxLayout.Y_AXIS
                )
        );


        mainPanel.setBorder(
                BorderFactory.createEmptyBorder(
                        20,
                        20,
                        20,
                        20
                )
        );



        title.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );


        calculateButton.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );


        errorLabel.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );



        mainPanel.add(
                title
        );


        mainPanel.add(
                Box.createVerticalStrut(25)
        );


        mainPanel.add(
                inputPanel
        );


        mainPanel.add(
                Box.createVerticalStrut(25)
        );


        mainPanel.add(
                calculateButton
        );


        mainPanel.add(
                Box.createVerticalStrut(15)
        );


        mainPanel.add(
                errorLabel
        );



        calculateButton.addActionListener(
                e -> readInput()
        );


        window.add(
                mainPanel
        );
    }



    private void readInput(){

        try{

            a = Double.parseDouble(
                    firstNumber.getText()
            );


            b = Double.parseDouble(
                    secondNumber.getText()
            );


            mode =
                    (Mode)
                            operationBox.getSelectedItem();


            window.dispose();

        }

        catch(NumberFormatException error){

            errorLabel.setText(
                    "Παρακαλώ βάλτε δύο αριθμούς!"
            );
        }
    }



    public double getA(){

        return a;
    }



    public double getB(){

        return b;
    }



    public Mode getMode(){

        return mode;
    }



    public void showResult(double result){
        if(result != Integer.MIN_VALUE)
        JOptionPane.showMessageDialog(
                null,
                "Αποτέλεσμα: " + result,
                "Calculator",
                JOptionPane.INFORMATION_MESSAGE
        );
        else
            JOptionPane.showMessageDialog(
                    null,
                    "Άπειρο. Δεν γίνεται διαίρεση με το 0",
                    "Calculator",
                    JOptionPane.INFORMATION_MESSAGE
            );
    }
}
