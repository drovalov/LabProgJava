package Lab4;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import java.awt.Graphics;
import java.awt.Color;

public class Graphik extends JFrame
{
    public static void main(String[] args)
    {
        Graphik graphik1 = new Graphik();
        graphik1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        graphik1.setVisible(true);
    }

    public Graphik()
    {
        JButton btn = new JButton("OTKPbITb");
        GraphPanel p = new GraphPanel();
        btn.addActionListener(p);
        getContentPane().add("North", btn);
        getContentPane().add("Center", p);
        setBounds(100, 100, 500, 500);
    }

}

class GraphPanel extends JPanel implements ActionListener
{
    private Vector vx = new Vector();
    private Vector vy = new Vector();

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        int xmax = Integer.MIN_VALUE;
        int xmin = Integer.MAX_VALUE;
        int ymax = Integer.MIN_VALUE;
        int ymin = Integer.MAX_VALUE;

        // Находим максимальные и минимальные значения
        for (int i = 0; i < vx.size(); i++) {
            int x = ( (Integer) vx.get(i)).intValue();
            int y = ( (Integer) vy.get(i)).intValue();
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
        JFileChooser f = new JFileChooser();
        f.showDialog(this, "Выберите файл");
        File fl = f.getSelectedFile();
        if (fl == null) {
            return;
        }
        try {
            vx.clear();
            vy.clear();
            BufferedReader br = new BufferedReader(new FileReader(fl));
            String S = null;
            while ( (S = br.readLine()) != null) {
                String[] d = S.split("\\s+");
                vx.add(new Integer(d[0]));
                vy.add(new Integer(d[1]));
            }
        }
        catch (IOException io_e) {

        }
        repaint();
    }
}