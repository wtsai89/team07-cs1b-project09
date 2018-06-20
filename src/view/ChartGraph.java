package view;

import cellularData.DataModel;
import cellularData.GraphView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * Instantiates an JavaFX application which creates a model of the data.
 * Uses the model to instantiate an object of type  javafx.scene.chart.LineChart
 * via the GraphView class. Then sets up the scene with basic modification to
 * the stage.
 *
 * @author Foothill College, [YOUR NAME HERE]
 */
public class ChartGraph extends Application
{	
	/**
	 * Called by launch method of Application
	 * @param stage: Stage
	 */
	@Override
	public void start(Stage stage) 
	{
		// Provides access to CSV data.
		// TODO: Define the data model by parsing the CSV input file(s).
		//       Provide accessor methods to your the parsed data.
		DataModel model = new DataModel();
		
		// Displays graph* of subscription rate by country.
		// TODO: Define the view such that it takes the model as input.
		//       Construct the x and y axis using a NumberAxis, label the axis.
		GraphView graphView = new GraphView(model);
		
		// TODO: Define update of the model such that:
		//       - Gets all the data** from the model
		//       - Creates a random list of elements from the data.
		//       - Traverses each element and creates a series (i.e. line) 
		//       - Adds the series** to it's Observablelist.
		
		//   * Here, displays graph of subscription rate by country.
		//
		//  ** Here, our data is composed of Country objects.
		// 
		// *** Gets an instance of javafx.collections.ObservableList via a call 
		//     to getData() method.
		// https://docs.oracle.com/javafx/2/api/javafx/scene/chart/XYChart.html#getData()
		graphView.update();
		
		// Creates a scene and adds the graph to the scene.
		Scene scene = new Scene(graphView);
		
		// Places the scene in the stage
		stage.setScene(scene);
		
		// Set the stage title
		stage.setTitle("GraphView Test");

		// Display the stage
		stage.show();
	}

	/**
	 * Launches a standalone JavaFx App
	 */
	public static void main(String[] args) 
	{
		launch();
	}
}