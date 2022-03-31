package JavaFxCharts;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
public class PieChartFx extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		//Instantiating the pie-chart class  
		PieChart piechart = new PieChart();
		
		//setting the data of the pie chart.
		piechart.setData(getCharData());
		piechart.setLegendSide(Side.RIGHT);  
	    piechart.setTitle("Computer Language Popularities");  
	    piechart.setClockwise(false);  
		
		StackPane root = new StackPane();
		
		 //Adding pie-chart to the layout   
	    root.getChildren().add(piechart);  
	    
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Pie chart example");
		primaryStage.show();
		
	}
	//creating getChartData method to set the chart data   
	private ObservableList<Data> getCharData(){
		 ObservableList<Data> list = FXCollections.observableArrayList();
//		 list.addAll(new PieChart.Data("Javatpoint", 90),  
//		            new PieChart.Data("Others", 10));  
//		    return list; 
		 list.addAll(new PieChart.Data("JavaScript", 30.8),  
		            new PieChart.Data("Ruby", 11.8),  
		            new PieChart.Data("Java", 10.8),  
		            new PieChart.Data("Python", 11.6),  
		            new PieChart.Data("PHP", 7.2),  
		            new PieChart.Data("Objective-C", 10.7),  
		            new PieChart.Data("C", 5.2),  
		                new PieChart.Data("C++", 4.3),  
		                    new PieChart.Data("Go",3.8),  
		                    new PieChart.Data("CSS", 3.8)  
		);  
		    return list;  
	}

}
