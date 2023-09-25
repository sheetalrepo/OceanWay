package aaaTest;

import java.math.BigInteger;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.poi.util.StringUtil;

public class One {

	public static void abc() {
//		List<Header> headersList = bigHeaderList.stream()
//                .filter(x -> x.getName().equals("Set-Cookie"))
//                .collect(Collectors.toList());
//        List<String> headerValues = Lists.transform(headersList, x -> x.getValue());
//        log.info("Filtered Header List: {}", headersList);
		System.out.println("abc");
	}

	public static void a1() {
		LocalDateTime expiredTime = LocalDateTime.now().minusDays(2);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formatDateTime = expiredTime.format(formatter);
		//System.out.println("Fprmated Date: " + formatDateTime);
		
		LocalDateTime time = LocalDateTime.parse(formatDateTime, formatter);
		System.out.println("Formated Date: " + time);
	}

    private static final String VALUES = "values";
    private static final String QUERY_PARAMS = "queryParams";
    private static final String REQUEST = "request" ;
    
//	 public List<?> getParamValues(String param)
//	    {
//	        Map<?, ?> requests = ((Map<?, ?>)(context.getJson().extract().body().jsonPath()
//	                .getList("requests")
//	                .get(0)));
//	        Map<?, ?> request = (Map<?, ?>)requests.get(REQUEST);
//	        Map<?, ?> queryParams = (Map<?, ?>)request.get(QUERY_PARAMS);
//	        Map<?, ?> params = (Map<?, ?>)queryParams.get(param);
//	        return ((List<?>)((Map<?, ?>) params).get(VALUES));
//	    }
//
//	    public void thereIsNoFieldInTheResponseContainingMatchingValue(String field, String value) {
//	        boolean result= getParamValues(field).stream().noneMatch(i -> i.equals(value));
//	        //assertTrue("Unexpected query parameter '" + field + "' with value '"+ value +"' found ", result);
//	    }
	    
	public static void a2() {

	}


	public static void main(String[] args) {

		// style 1
		int[] arr = { 10, 20, 5, 15, 40, 50 };
		Arrays.sort(arr); // sort in ascending order
		int[] top5 = Arrays.copyOfRange(arr, arr.length - 5, arr.length); // (arr,
		// 1,
		// 6)
		System.out.println(Arrays.toString(top5));

		// style 2
		int[] arr2 = { 10, 20, 5, 15, 40, 50 };
		Arrays.sort(arr2);
		for (int i = arr2.length - 5; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}	

	}

}
