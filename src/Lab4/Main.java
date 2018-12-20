package Lab4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Arrays;

import static java.lang.Math.pow;

public class Main {

    public static void main(String[] args) {
        int[] x = new int[10];
        double[] y = new double[10];
        double h = 1;
        for (int i = 0; i < 5; i++) {
            x[i] = i+1;
            y[i] =  (x[i]+2)*Math.tan(pow(x[i],2)-3);                         //  1.0 / 2.0 * Math.sin(x[i]) + 5;
            System.out.print("x = " + x[i]);
            System.out.printf("%s %.3f %s"," y = ",+y[i],"\n");
        }
        System.out.println(Arrays.toString(y));
        new Draw(x,y);
    }
}

class Draw extends javax.swing.JFrame {

    private int[] x;
    private double[] y;
    private int[] yTrue;
    private Dimension size = new Dimension(600,400); //рабочая область
    private Dimension startPointXoY = new Dimension(40,350); //начало координат
    private int scale = 30; //масштаб

    public Draw(int[] x,double[] y) {
        this.x = x;
        this.y = y;
        yTrue = new int[x.length];
        reBuildArreys();
        initInterface();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0,0,size.width,size.height);

        g.setColor(Color.WHITE);

        for (int i = 1; i <= x.length; i++) {
            g.drawString(String.valueOf(i),startPointXoY.width + (startPointXoY.width - 10) * i,startPointXoY.height + (startPointXoY.width - 25));
            g.drawString(String.valueOf(i),25,startPointXoY.height - (startPointXoY.width - 10) * i);
        }

        g.drawLine(startPointXoY.width,startPointXoY.width,startPointXoY.width,startPointXoY.height);
        g.drawLine(startPointXoY.width,startPointXoY.height,400,startPointXoY.height);

        g.drawPolyline(x,yTrue,x.length);
    }

    private void initInterface() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(size);
        setResizable(false);
        setTitle("График функции");
        setVisible(true);
    }

    private void reBuildArreys() {
        for (int i = 0; i < x.length; i++) {
            x[i] *= scale;
            x[i] += startPointXoY.width;
            y[i] *= scale;
            yTrue[i] = startPointXoY.height - ((int) y[i]);
        }
    }
}
