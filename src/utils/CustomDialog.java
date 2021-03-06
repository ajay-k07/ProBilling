/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.*;
import java.awt.event.*;
import java.beans.*;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class CustomDialog extends JDialog
        implements ActionListener,
        PropertyChangeListener {

    
    private JOptionPane optionPane;
    private String btnString1 = "Enter";
    private String btnString2 = "Cancel";

    /**
     * Returns null if the typed string was invalid; otherwise, returns the
     * string as the user entered it.
     */
    public String getValidatedText() {
        return typedText;
    }

    /**
     * Creates the reusable dialog.
     */
    public CustomDialog(Frame aFrame, JLabel lab_total) {
        super(aFrame, true);

       JTextField totalJ = new JTextField(lab_total.getText());
        JTextField paid = new JTextField();
        JTextField balance = new JTextField();
        JTextField txt_customerNo = new JTextField();
        totalJ.setEditable(false);
        balance.setEditable(false);
        paid.addKeyListener(
                new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                balance.setText(String.valueOf(Double.valueOf(totalJ.getText()) - Double.valueOf(paid.getText())));
            }
        }
        );
        Object[] message = {
            "Customer Mobile No:",txt_customerNo,
            "Total Price:", totalJ,
            "Amount Paid:", paid,
            "Balance:", balance,};

        //Create an array specifying the number of dialog buttons
        //and their text.
        Object[] options = {btnString1, btnString2};

        //Create the JOptionPane.
        optionPane = new JOptionPane(message,
                JOptionPane.QUESTION_MESSAGE,
                JOptionPane.YES_NO_OPTION,
                null,
                options,
                options[0]);

        //Make this dialog display it.
        setContentPane(optionPane);

        //Handle window closing correctly.
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        //Ensure the text field always gets the first focus.
        

        //Register an event handler that puts the text into the option pane.
       

        //Register an event handler that reacts to option pane state changes.
        optionPane.addPropertyChangeListener(this);
        pack();
    }

    /**
     * This method handles events for the text field.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        optionPane.setValue(btnString1);
    }

    /**
     * This method reacts to state changes in the option pane.
     */
    @Override
    public void propertyChange(PropertyChangeEvent e) {
        String prop = e.getPropertyName();

        if (isVisible()
                && (e.getSource() == optionPane)
                && (JOptionPane.VALUE_PROPERTY.equals(prop)
                || JOptionPane.INPUT_VALUE_PROPERTY.equals(prop))) {
            Object value = optionPane.getValue();

            if (value == JOptionPane.UNINITIALIZED_VALUE) {
                //ignore reset
                return;
            }

            //Reset the JOptionPane's value.
            //If you don't do this, then if the user
            //presses the same button next time, no
            //property change event will be fired.
            optionPane.setValue(
                    JOptionPane.UNINITIALIZED_VALUE);

            if (btnString1.equals(value)) {
                typedText = textField.getText();
                String ucText = typedText.toUpperCase();
                if (magicWord.equals(ucText)) {
                    JOptionPane.showMessageDialog(this, "Correct answer given");
                    exit();
                } else {
                    //text was invalid
                    textField.selectAll();
                    JOptionPane.showMessageDialog(this,
                            "Sorry, \"" + typedText + "\" "
                            + "isn't a valid response.\n"
                            + "Please enter "
                            + magicWord + ".",
                            "Try again",
                            JOptionPane.ERROR_MESSAGE);
                    typedText = null;
                    textField.requestFocusInWindow();
                }
            } else { //user closed dialog or clicked cancel
                JOptionPane.showMessageDialog(this, "It's OK.  "
                        + "We won't force you to type "
                        + magicWord + ".");
                typedText = null;
                exit();
            }
        }
    }

    /**
     * This method clears the dialog and hides it.
     */
    public void exit() {
        dispose();
    }

    public static void main(String... args) {
        //create JDialog and components on EDT
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CustomDialog(null, new JLabel("300")).setVisible(true);
            }
        });
    }
}