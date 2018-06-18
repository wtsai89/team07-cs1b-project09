package cellularData;

import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import view.CountrySelector;

public class GraphView extends LineChart{ //This is just a skeleton and the start of the program so that we have an idea of what this program is supposed to do.
    NumberAxis xAxis;
    NumberAxis yAxis;
    DataModel model;
    Country currentCountry;
    Series someSeries;
    /**
     * This is the constructor for this class
     * @param model The parameter for the chart that is passed into this program.
     */
    public GraphView(DataModel model){ //TODO:Need to work on this Method and set up the instance variables using super.
        super(new NumberAxis(), new NumberAxis());
        this.model = model;
        //requestChartLayout(); //I need to use the parameter but cannot quite figure out the method from the LineChart import yet.
    }

    /**
     * A method that takes in a country object as parameter and returns a series object. Its supposed to read from the series given and plot the points
     * @param currentCountry This is the parameter for the country object.
     * @return
     */
    public Series<Number, Number> seriesFromCountry(Country currentCountry){//TODO: We need to figure out how to pass in the parameter series into the number
        Series<Number, Number> someSeries = new Series<>();
        this.currentCountry = currentCountry;
        return someSeries;

    }

    /**
     * Updates the chart with the points plotted from the series given.
     */
    public void update() {
        //getData();
        this.seriesFromCountry(currentCountry);
        this.getData().add(someSeries);
    }


}
