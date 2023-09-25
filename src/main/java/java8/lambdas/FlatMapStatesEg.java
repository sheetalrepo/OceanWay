package java8.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//POJO : where we can add and get cities
class State {
	private List<String> cities = new ArrayList<>();

	public void addCity(String city) {
		cities.add(city);
	}

	public List<String> getCities() {
		return this.cities;
	}
}




public class FlatMapStatesEg {
	
	public static void main(String[] args) {
	
		State karnataka = new State();
		karnataka.addCity("Bangalore");
		karnataka.addCity("Mysore");

		State punjab = new State();
		punjab.addCity("Chandigarh");
		punjab.addCity("Ludhiana");

		List<State> allStates = Arrays.asList(karnataka, punjab);

		
		//legacy way
		List<String> allCities = new ArrayList<String>();
		for(State state : allStates) {
			for(String city : state.getCities())
				allCities.add(city);
		}
		System.out.println(allCities);
		
		
		
		//Java Stream flatMap way
		List<String> allCitiesUsingFlatMap = allStates.stream()
												.flatMap(e -> e.getCities().stream())
												.collect(Collectors.toList());
		
		System.out.println(allCitiesUsingFlatMap);
	}

}


