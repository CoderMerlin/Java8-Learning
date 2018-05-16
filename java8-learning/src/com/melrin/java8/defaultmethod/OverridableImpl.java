package com.melrin.java8.defaultmethod;

public class OverridableImpl implements Defaultable{

	@Override
	public String notRequired(){
		return "Overridden implementation";
	}
}
