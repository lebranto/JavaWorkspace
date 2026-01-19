package com.kh.practice.lnterfaceLambda;


@FunctionalInterface
public interface MyFunction2 <K, A> {
	
	void accept(K k, A a);

}
