package com.melrin.java8.defaultmethod;

import java.util.function.Supplier;

/**
 * 
 * @author Merlin
 *
 */
public interface DefaultFactory {
	// Interfaces now allow static methods
    static Defaultable create( Supplier<Defaultable> supplier ) {
        return supplier.get();
    }
}
