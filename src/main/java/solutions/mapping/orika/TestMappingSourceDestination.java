package solutions.mapping.orika;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 * Orika mapping used to map to two different class with same or diff member name
 * 
 * for details: https://www.baeldung.com/orika-mapping
 * @author Sheetal_Singh
 */
public class TestMappingSourceDestination {

	static MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

	@Test
	public void mappingSimpleClasses() {
		mapperFactory.classMap(Source.class, Destination.class);
		MapperFacade mapper = mapperFactory.getMapperFacade();
		Source source = new Source("Baeldung", 10);
		Destination destination = mapper.map(source, Destination.class);

		assertEquals(destination.getAge(), source.getAge());
		assertEquals(destination.getName(), source.getName());
	}


	@Test
	public void mappingReverseSimpleClasses() {
		mapperFactory.classMap(Source.class, Destination.class).byDefault();
	    MapperFacade mapper = mapperFactory.getMapperFacade();
	    Destination src = new Destination("Baeldung", 10);
	    Source dest = mapper.map(src, Source.class);
	 
	    assertEquals(dest.getAge(), src.getAge());
	    assertEquals(dest.getName(), src.getName());
	}
	

}
