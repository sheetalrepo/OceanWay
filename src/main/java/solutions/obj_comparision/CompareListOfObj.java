package solutions.obj_comparision;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * We are comparing two list of objects
 * 
 * Trying to find all expected list in big actual list
 * 
 */
public class CompareListOfObj {

	//expected is smaller
	public static List<Mango> getExpectedList(){
		List<Mango> ls = new ArrayList<Mango>();

		Mango mango1 = new Mango();
		mango1.setId(1);
		mango1.setName("alpha");
		mango1.setColor("golden");
		mango1.setTaste("salty");
		
		Mango mango2 = new Mango();
		mango2.setId(2);
		mango2.setName("beta");
		mango2.setColor("silver");
		mango2.setTaste("sweet");
		
		ls.add(mango1);
		ls.add(mango2);
		
		return ls;
	}
	
	//actual is bigger
	public static List<Mango> getActualList(){
		List<Mango> ls = new ArrayList<Mango>();

		Mango mango1 = new Mango();
		mango1.setId(1);
		mango1.setName("alpha");
		mango1.setColor("golden");
		mango1.setTaste("salty");
		
		Mango mango2 = new Mango();
		mango2.setId(2);
		mango2.setName("beta");
		mango2.setColor("silver");
		mango2.setTaste("sweet");
		
		Mango mango3 = new Mango();
		mango3.setId(3);
		mango3.setName("charli");
		mango3.setColor("iron");
		mango3.setTaste("sorrow");
		
		ls.add(mango1);
		ls.add(mango2);
		//ls.add(mango3);
		
		return ls;
	}
	
	/**
	 * this method is a bit lengthy just to print only failed cases from both list
	 */
	public static boolean compareListUsingLoop(){

		List<Mango> expectedList = getExpectedList();
		List<Mango> actualList = getActualList();
		
		
        System.out.println("E: "+expectedList.size());
        System.out.println("A: "+actualList.size());

        System.out.println("E>>: "+expectedList.toString());
        System.out.println("A>>: "+actualList.toString());


        if(actualList.containsAll(expectedList)){
            System.out.println("---------------  actual contains all expected data  -----------------------");
            return true;
        }


        //print failed expected cases:
        List<Mango> failedExpectedListOfObjects = new ArrayList<>();
        for(Mango expectedObj: expectedList) {
			if(!actualList.contains(expectedObj)) {
				failedExpectedListOfObjects.add(expectedObj);
			}
		}
		System.out.println("Failed Expected List:"+ failedExpectedListOfObjects);
		
		
		//print failed actual cases:
        for(Mango failedExpObj : failedExpectedListOfObjects){
            boolean flag = false;
            for(Mango actObj: actualList){
                if(failedExpObj.getId()==actObj.getId()){
                    flag=true;
                    System.out.println("Actual Object Value: "+actObj);
                }
            }

            if(!flag){
                System.out.println("Expected Mango obj is not present in Actual Object List: TestCaseID: "+failedExpObj.getId()+"   & Name:"+ failedExpObj.getName());
            }
        }

        return false;
    }

	
	
	
	
	public static boolean compareListUsingContainsAll(){
		List<Mango> expectedList = getExpectedList();
		List<Mango> actualList = getActualList();
		boolean flag = true;
		
		if(!actualList.containsAll(expectedList)) {
			flag = false;
			System.out.println(expectedList); // print all list passed and failed both
			System.out.println(actualList);
		}
		
		return flag;
	}
	
	
	
	//verifying expected list present inside actual or not
	public static boolean compareListUsingStreams() {
		List<Mango> expectedList = getExpectedList();
		List<Mango> actualList = getActualList();
		
		List<Mango> matchingList = actualList.stream()
                .filter(expectedList::contains)
                .collect(Collectors.toList());
		
		System.out.println(matchingList);


        return matchingList.size() == expectedList.size();

    }
	
	
	
	//https://dzone.com/articles/how-to-compare-list-objects-in-java-7-vs-java-8-1
	public static void isListMatchingUsingStreams() {
		List<Mango> expectedList = getExpectedList();
		List<Mango> actualList = getActualList();	
		
		
		System.out.println(
            "If 'ALL' obj from Expected List are present in Actual List:" +
            		expectedList.stream().allMatch(expObj -> actualList.contains(expObj)));
        
        
        System.out.println(
		            "If 'ANY' obj from Expected List are present in Actual List:" +
		            		expectedList.stream().anyMatch(expObj -> actualList.contains(expObj)));

        System.out.println(
                "If 'NONE' obj from Expected List are present in Actual List:" +
                		expectedList.stream().noneMatch(expObj -> actualList.contains(expObj)));
		
	}
	
	
	
	public static void main(String[] args) {
		boolean isExpectedListPresentInActualLoops = compareListUsingLoop();
		System.out.println("Using Loops:" + isExpectedListPresentInActualLoops);
//		System.out.println("-----------xxx-----------");
		
//		boolean isExpectedListPresentInActualContainsAll =compareListUsingContainsAll();
//		System.out.println("Using Contails All:" + isExpectedListPresentInActualContainsAll);
//		System.out.println("-----------xxx-----------");
//		
//		boolean isExpectedListPresentInActualJava8 =compareListUsingStreams();
//		System.out.println("Using Java8: "+isExpectedListPresentInActualJava8);
//		
//		
//		isListMatchingUsingStreams();
		
	}

}
