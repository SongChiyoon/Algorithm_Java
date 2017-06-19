package simulatedAnnealing2;

import java.util.ArrayList;
import java.util.List;

public class SingleTour {
	private List<City> tours = new ArrayList<>();
	private double distance = 0;
	SingleTour(){
		for(int i=0;i<Repository.numberOfCities();i++)
			tours.add(null);
	}
	SingleTour(List<City> tours){
		
		List<City> currentTour = new ArrayList<>();
		
		for(int i=0;i<tours.size();i++){
			currentTour.add(null);
		}
		for(int i=0;i<tours.size();i++){
			currentTour.set(i, tours.get(i));
		}
		this.tours = currentTour;
	}
	public List<City> getTour(){
		return tours;
	}
	public void generate(){

	}
}
