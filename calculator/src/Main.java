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
        // δεν θα αλλάξει και θα είναι 0

        double quo = ERROR;  //Διατηρήστε αυτήν την τιμή μόνο ΚΑΙ ΜΟΝΟ αν η διαίρεση δεν γίνεται
        
        return quo;
    }


    // ============================================================
    //                         CHALLENGE 1
    // ============================================================

    public static double powerTo(double a, double b){

        // Υπολογίστε τον αριθμό a υψωμένο στη δύναμη b.
        //
        // ΠΡΟΣΟΧΗ: Για αυτό το challenge θεωρούμε ότι το b
        // μπορεί να είναι μόνο 0, 1, 2 ή 3.
        //
        // Παραδείγματα:
        //
        // powerTo(5, 0) -> 1
        // powerTo(5, 1) -> 5
        // powerTo(5, 2) -> 25
        // powerTo(5, 3) -> 125
        //
        // Χρησιμοποιήστε ΜΟΝΟ if και πράξεις.
        //
        // Αν το b δεν είναι 0, 1, 2 ή 3 επιστρέψτε ERROR.

        double result = ERROR;



        return result;
    }



    // ============================================================
    //                         CHALLENGE 2
    // ============================================================

    public static boolean safeMotor(double a, double b){

        // Τα a και b είναι οι ισχείς δύο κινητήρων.
        //
        // Ένας κινητήρας μπορεί να πάρει τιμές ΜΟΝΟ
        // από -1 μέχρι 1.
        //
        // Ελέγξτε ΚΑΙ το a ΚΑΙ το b.
        //
        // Η συνάρτηση πρέπει να επιστρέφει true
        // μόνο όταν ΚΑΙ ΟΙ ΔΥΟ τιμές είναι ασφαλείς, αλλιώς
        // επιστρέφει false
        //
        // Παραδείγματα:
        //
        // safeMotor(0.5, 0.8)  -> true
        // safeMotor(-1, 1)     -> true
        // safeMotor(1.5, 0.5)  -> false
        // safeMotor(0.5, -2)   -> false
        //
        // Χρησιμοποιήστε if.



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
        while(true){
            Calculator calculator = new Calculator();   // |
                                                        // |
            CalculatorGUI gui = new CalculatorGUI();    // |
                                                        // |
            double a = gui.getA();                      // |
            double b = gui.getB();                      // |
            Mode mode = gui.getMode();                  // |
                                                        // |
            double result = 0;                          // |
            boolean safe = false;                       // |
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


        // ============================================================
        //                         CHALLENGES
        // ============================================================
        //
        // Υπάρχουν ακόμα δύο πιθανές τιμές του mode:
        //
        // Mode.POWER_TO
        // Mode.SAFE_MOTOR
        //
        // Στο POWER_TO πρέπει να χρησιμοποιήσετε τη συνάρτηση powerTo(a,b).
        //
        // Στο SAFE_MOTOR πρέπει να χρησιμοποιήσετε τη συνάρτηση safeMotor(a,b)
        // και να αποθηκεύσετε το αποτέλεσμα στη μεταβλητή safe.





            // ΑΓΝΟΗΣΤΕ ΟΤΙΔΗΠΟΤΕ ΒΡΙΣΚΕΤΑΙ ΠΑΡΑ ΚΑΤΩ

                if(mode == Mode.SAFE_MOTOR){
                    gui.showMotorResult(safe);
                }
                else{
                    gui.showResult(result);
            }    
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
    MUL,
    POWER_TO,
    SAFE_MOTOR
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
                390
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
                        "Πρώτος αριθμός (a):"
                )
        );

        inputPanel.add(
                firstNumber
        );


        inputPanel.add(
                new JLabel(
                        "Δεύτερος αριθμός (b):"
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

        if(result != Calculator.ERROR){

            JOptionPane.showMessageDialog(
                    null,
                    "Αποτέλεσμα: " + result,
                    "Calculator",
                    JOptionPane.INFORMATION_MESSAGE
            );

        }
        else{

            JOptionPane.showMessageDialog(
                    null,
                    "ERROR",
                    "Calculator",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }



    public void showMotorResult(boolean safe){

        if(safe){

            JOptionPane.showMessageDialog(
                    null,
                    "SAFE: Και οι δύο τιμές μπορούν να δοθούν στους κινητήρες.",
                    "Motor Safety Check",
                    JOptionPane.INFORMATION_MESSAGE
            );

        }
        else{

            JOptionPane.showMessageDialog(
                    null,
                    "ERROR: Τουλάχιστον μία τιμή δεν είναι μεταξύ -1 και 1.",
                    "Motor Safety Check",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
