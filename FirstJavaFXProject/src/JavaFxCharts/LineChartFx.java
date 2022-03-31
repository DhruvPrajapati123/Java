package JavaFxCharts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LineChartFx extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		// Defining Axis
		NumberAxis xaxis = new NumberAxis(2008,2018,1);
		NumberAxis yaxis = new NumberAxis(10,80,5);

		// Defining Label for Axis
		xaxis.setLabel("Year");
		yaxis.setLabel("Price");

		// creating the series
		XYChart.Series series = new XYChart.Series();

		// setting name and the date to the series
		series.setName("Stock Analysis");
		series.getData().add(new XYChart.Data(2009, 25));
		series.getData().add(new XYChart.Data(2010, 15));
		series.getData().add(new XYChart.Data(2011, 68));
		series.getData().add(new XYChart.Data(2012, 60));
		series.getData().add(new XYChart.Data(2013, 35));
		series.getData().add(new XYChart.Data(2014, 55));
		series.getData().add(new XYChart.Data(2015, 45));
		series.getData().add(new XYChart.Data(2016, 67));
		series.getData().add(new XYChart.Data(2017, 78));

		
		LineChart linechart = new LineChart(xaxis, yaxis);

		//adding series to the linechart   
        linechart.getData().add(series);
		StackPane root = new StackPane();
		// Adding line-chart to the layout
		root.getChildren().add(linechart);
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Line chart example");
		primaryStage.show();
	}

}
