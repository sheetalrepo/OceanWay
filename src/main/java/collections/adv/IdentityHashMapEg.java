package collections.adv;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/**
 * IHM : 
 * 1. uses == rather equals for comparison in keys
 * 2. it uses identityHashCode() rather hashCode() to get bucket id
 * 3. The only Map which doesn't obey equals and hashcode contract
 * 4. Keys should not be immutable
 *
 * refer: weak hashmap/ enummap also
 */

public class IdentityHashMapEg {
	public static void main(String[] args) {

		// Created HashMap and IdentityHashMap objects
		Map<String, String> hashmapObject = new HashMap<>();
		Map<String, String> identityObject = new IdentityHashMap<>();

		// Putting keys and values in HashMap and IdentityHashMap Object
		hashmapObject.put(new String("key"), "Google");
		hashmapObject.put(new String("key"), "Facebook");

		identityObject.put(new String("identityKey"), "Google");
		identityObject.put(new String("identityKey"), "Facebook");

		// Print HashMap and IdentityHashMap Size : After adding keys
		System.out.println("HashMap after adding key :" + hashmapObject);   // {key=Facebook}
		System.out.println("IdentityHashMap after adding key :" + identityObject);  //{identityKey=Google, identityKey=Facebook}
	}
}
