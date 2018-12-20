package JournalStudent.Graph.Ex3Graphik;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class GraphPanel extends JPanel implements ActionListener
{
    private Vector vx = (Vector) Graphik2.x_field.getValue();
    private Vector vy = (Vector) Graphik2.y_field.getValue();

    private JFormattedTextField.AbstractFormatter number = new NumberFormatter();


    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        int xmax = Integer.MIN_VALUE;
        int xmin = Integer.MAX_VALUE;
        int ymax = Integer.MIN_VALUE;
        int ymin = Integer.MAX_VALUE;

        // Находим максимальные и минимальные значения
        for (int i = 0; i < vx.size(); i++) {
            int x = Integer.parseInt(String.valueOf(vx));
            int y = Integer.parseInt(String.valueOf(vx));
            if (x > xmax) {
                xmax = x;
            }
            if (x < xmin) {
                xmin = x;
            }
            if (y > ymax) {
                ymax = y;
            }
            if (y < ymin) {
                ymin = y;
            }
        }

        // определяем коэффициенты масштабирования
        double Kx = (getWidth()-1)/(xmax-xmin);
        double Ky = (getHeight()-1)/(ymax-ymin);

        // рисуем
        for(int i=1; i<vx.size(); i++) {
            int x0 = ( (Integer) vx.get(i-1)).intValue();
            int y0 = ( (Integer) vy.get(i-1)).intValue();
            int x1 = ( (Integer) vx.get(i)).intValue();
            int y1 = ( (Integer) vy.get(i)).intValue();
            g.drawLine((int)Kx*(x0-xmin), (int)Ky*(y0-ymin), (int)Kx*(x1-xmin), (int)Ky*(y1-ymin));
        }
    }


    public void actionPerformed(ActionEvent e)
    {
        // Вот тут ты можешь заполнять вектора vx и vy расчетными данными а не считывать их из файла.
        JTextField x_field = new JFormattedTextField(number);
        JTextField y_field = new JFormattedTextField(number);
        int vx = Integer.parseInt(x_field.getText());
//        if (vx == null) {
//            return;
//        }
        int vy = Integer.parseInt(y_field.getText());
//        if (vy == null) {
//            return;
//        }


        repaint();
    }
}