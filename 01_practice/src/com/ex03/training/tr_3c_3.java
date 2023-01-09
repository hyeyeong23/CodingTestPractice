package com.ex03.training;

public class tr_3c_3 {

	static class GenericClass<T> {
		private T xyz;
		GenericClass(T t) {
			this.xyz = t;
		}
		
		T getXyz() {
			return xyz;
		}
	}
	
	public static void main(String[] args) {
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> n = new GenericClass<Integer>(15);
		
		System.out.println(s.getXyz());
		System.out.println(n.getXyz());
		
	}

}