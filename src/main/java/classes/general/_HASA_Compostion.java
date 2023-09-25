package classes.general;

/*
 * Composition is sub part of Aggregation
 * It is more restricted i.e. Car HAS A Engine, Car cannot exists w/o Engine
 * If two entity has dependency on each other then Composition is used e.g. Car depend on Engine
 */

class Engine {

	Engine() {
		System.out.println("I am engine");
	}
}

// This Car class HAS A Engine; Car depend on Engine class and as there is no
// inheritance hence its a Composition
public class _HASA_Compostion {
	Engine engine;

	public _HASA_Compostion() {
		System.out.println("I am Car class using Engine class");
		new Engine();
	}

	public static void main(String[] args) {
		_HASA_Compostion car = new _HASA_Compostion();
	}
}
