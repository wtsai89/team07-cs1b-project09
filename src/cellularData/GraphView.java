package cellularData;

import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

import javax.sound.sampled.Line;

public class GraphView extends LineChart{ //This is just a skeleton and the start of the program so that we have an idea of what this program is supposed to do.
    NumberAxis xAxis;
    NumberAxis yAxis;
    DataModel model;
    public GraphView(DataModel model){ //Need to work on this Method and set up the instance variables using super.

    }
    public GraphView(NumberAxis xAxis, NumberAxis yAxis) { //Just what I came up with when I was initially trying to figure out the constructor.
        super(xAxis, yAxis);
    }
    public Series seriesFromCountry(Country series){ //This needs to be set up correctly
        //return Series<xAxis,yAxis>;
    }

    public void update() { //My current attempts at the update method. It needs the other methods before we can define this method.
        //this.seriesFromCountry(currentCountry);
        //this.getData().add(someSeries);
    }


}
