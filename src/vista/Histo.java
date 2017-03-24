package vista;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Shape;
import java.awt.Stroke;
import javax.jws.soap.SOAPBinding.Use;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.ui.RectangleAnchor;
import org.jfree.ui.RefineryUtilities;
import org.jfree.ui.StrokeSample;

public class Histo extends JDialog {

    private static double[] numeros;
    private static int intervalos;

    public Histo(JFrame parent, boolean modal, double[] numerosAleatorios, int inte) {
        super(parent, modal);
        numeros = numerosAleatorios;
        intervalos = inte;
        JPanel chartPanel = crearPanel();
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 475));
        this.getContentPane().add(chartPanel);
        this.pack();
        RefineryUtilities.centerFrameOnScreen(this);
    }

    private static IntervalXYDataset crearDataset() {
        HistogramDataset dataset = new HistogramDataset();

        dataset.addSeries("Frecuencia", numeros, intervalos);
        return dataset;
    }

    private static JFreeChart crearChart(IntervalXYDataset dataset) {
        JFreeChart chart = ChartFactory.createHistogram(
                "DISTRIBUCION",
                "Numeros generados",
                "Ocurrencias",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
        XYPlot plot = (XYPlot) chart.getPlot();
        XYBarRenderer renderer = (XYBarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);

        return chart;
    }

    public static JPanel crearPanel() {
        JFreeChart chart = crearChart(crearDataset());
        int frecuenciaEsperada=numeros.length/intervalos;       
        
        ValueMarker marker = new ValueMarker(frecuenciaEsperada); 
        marker.setPaint(Color.black);
        
        marker.setStroke(new BasicStroke(5));
        
        XYPlot plot = (XYPlot) chart.getPlot();
        plot.addDomainMarker(marker);
        plot.addRangeMarker(marker);
   
        return new ChartPanel(chart);
    }

}
