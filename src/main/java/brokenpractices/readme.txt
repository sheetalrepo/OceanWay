#ToDo:

#####  CLEAN CODING #####
ep training 


## NAMING ##
1. Interface shd not start with 'I', it decreases readability e.g. 
	incorrect:  IClean    
	correct: GarageCleaningService
2. Method params shd not be like myMethod(pColor, pCar) | use simple short name  myMethod(color, car)
3. Class name shd be correct as per implementation of interface
	wrong: 		public class GarageControllerImpl implements GarageService {}            
	correct: 	public class GarageServiceImpl implements GarageService {}

4. Method name shd be Verb or Verb Phrase
5. Method with little usage or near by method should have long meaningfull name
   Method with more usage i.e. used in diff classes shd have small meaningfull name

6. 	Variable names:
	boolean isClassicCar; 												 //incorrect   
	boolean classicCar;   & getter shd be  isClassicCar(){}              //correct
	
	String sModel;   	 //incorrect
	String model;        //correct 

	int iYear;   	 //incorrect
	int year;        //correct 

	Map<Integer, Car> garagesList = new HashMap<>();            //incorrect
    Map<Integer, Car> garagesWithCar = new HashMap<>();			//correct

	//incorrect
	for (int garageNumberToCheckIfItsFree : garages) {            
		if (free(garageNumberToCheckIfItsFree)) return garageNumberToCheckIfItsFree;            
    
	//correct
	for (int garage : garages) {            
        if (isGarageFree(garage)) return garage;


		
	#incorrect	
	static final int[] GARAGES1 = {1, 7}; // more secure garages            
    static final int[] GARAGES2 = {2, 3, 4, 5, 6};            
    
	#correct
	static final int[] SECURE_GARAGES = {1, 7};             
    static final int[] SIMPLE_GARAGES = {2, 3, 4, 5, 6};	

7.	Class level constants
	#incorrect: magical C and S
	return String.format("%s %s [%s] %s", manufacturer, model, year, classic ? "C" : "S"); 
	
	#correct: make class level constants and use them
	private static final String CLASSIC_CAR_ABBREVIATION = "C";
	return String.format("%s %s [%s] %s", manufacturer, model, year, classic ? CLASSIC_CAR_ABBREVIATION : SIMPLE_CAR_ABBREVIATION);
	
	
8. Method name accepting arrays etc
	Wrong: 		private Integer someoneHasFreeSpace(int[] garageNumbersToCheckAreTheyPotentiallyFree) {            
    Correct: 	private Integer findFreeGarageFrom(int[] garages) {	


9. Interface : Wrong vs Correct
	public interface Clean {            
		void cleaning(int g);            
    }
	
	
	public interface GarageCleaningService {            
	    void clean(int garage);            
    }
	
	
	
## FUNCTIONS ##	

0. Extract most of the small small code from a method
-- all numbers used in code should have a proper class level CONSTANT declaration 

1. Exception handling : If a method contains try catch the there shd not be any code, just a method call inside try catch
	public void testMe(){
		try{
			someRamdomCode();
		}catch(Exception e){}	
	}
	
	
2. Conditions:
A:
	#Confusing Code:		
	if(!list.isEmpty()){
		//code
	}	
		
	#Corrected:	
	if(isNotEmpty(list)){
		//code
	}	
	
	isNotEmpty(List list){return !list.isEmpty()}
	
	
B: 	In case if(cond), conditions are more that one, then make new methods for conditions	
	if(!list.isEmpty() && list.contains("")){
		//code
	}
	
	
	
3. Params
	0-2 params is best case
	3 and more is unreadable and shd be split method into two
	if a boolean is passed then method shd do two things |  best not to send boolean rather call two separate methods
	if two boolean sent, method shd do four things which is bad
	dont pass or return nulls
	
4. To make smaller methods out of big methods
	IDE > Select code > refactor > extract method	
	
5. Dont write comments
	Only genuine comments required like in case of some copywrite, regex related, TODO comments
	
	
6. DRY principles : Donot Repeat yourself
7. Error Handling
	error must be handled where they occur
	to handle error details desc required 
	use exception rather codes
	
	code can break at any time in 'try' and resume in 'catch'. Hence code in catch is imp and it shd make system in consistent state
	

	(???) Try to use unchecked exception as checked violates Open/Closed principal and Dependency Inversion Principle

	Try to use constant in switch rather numbers or string;
		#Bad Code	
		switch (){
		   case 1: 
		   case 2:
		}   
		 
		#Good Code 
		switch (){
			case VACANCY_OPEN:
			case VACANCY_CLOSE:
		}	
		 
	
8. Code Quality Matrics:
	1. Cyclomatic Complexity   CC < 5 is Good,    CC : 5 to 10 is OK,    CC: Above 10 is bad 
	2. Coupling Cohesion : Plugins: MetricReloaded(IntelliJ), Metrics(Eclipse)
	3. Code Coverage: SonarQube
	4. Duplicate Code Percentage: SonarQube
	5. Technical Debt - Startegic(genuine and are tracked), Non startegic (becasue of process gaps, bad code quality)
	6. Comment Percentage  : SonarQube . Shd be low
	7. Static Rule Compliance : SonarQube	. Number shd be 100 ideally
	
