package JournalStudent.Graph.Ex3Graphik;

import javax.swing.*;
import javax.swing.text.NumberFormatter;

public class Graphik2 extends JFrame
{
    public static JFormattedTextField x_field;
    public static JFormattedTextField y_field;
    private JFormattedTextField.AbstractFormatter number = new NumberFormatter();


    public static void main(String[] args)
    {
        Graphik2 graphik1 = new Graphik2();
        graphik1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        graphik1.setVisible(true);
    }

    public Graphik2()
    {
       JButton btn = new JButton("OTKPbITb");
        GraphPanel p = new GraphPanel();
        btn.addActionListener(p);
        JTextField x_field = new JFormattedTextField(number);
        JTextField y_field = new JFormattedTextField(number);
        y_field.addActionListener(p);
        x_field.addActionListener(p);
        getContentPane().add("North", x_field);
        getContentPane().add(y_field);
        getContentPane().add("Center", p);
        setBounds(100, 100, 500, 500);
    }

}

