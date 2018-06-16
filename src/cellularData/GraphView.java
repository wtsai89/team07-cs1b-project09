package cellularData;

import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;

import javax.sound.sampled.Line;

public class GraphView extends LineChart{ //This is just a skeleton and the start of the program so that we have an idea of what this program is supposed to do.
    NumberAxis xAxis;
    NumberAxis yAxis;
    DataModel model;
    public GraphView(NumberAxis xAxis, NumberAxis yAxis) {
        super(xAxis, yAxis);
    }
    public Series seriesFromCountry(Country series){
        return Series<xAxis,yAxis>;
    }

    public void update() {
        this.seriesFromCountry(currentCountry);
        this.getData().add(someSeries);
    }


}
