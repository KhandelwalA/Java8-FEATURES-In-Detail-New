package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamClass {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		/*Objective: Multiply each element of collection by 2 & then sum them */
		/* Use of streams in detail:*/
		Function<Integer, Integer> function = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer i) {
				return (i * 2);
			}
		};

		BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer i, Integer j) {
				return i + j;
			}
		};

		Stream<Integer> mapStream1 = list.stream();
		Stream<Integer> reduceStream1 = mapStream1.map(function);
		Optional<Integer> result1 = reduceStream1.reduce(binaryOperator);

		System.out.println(result1);

		/* Use of streams with lambda (using lambda in above example) */
		Optional<Integer> result2 = list.stream()
				                        .map(i -> i * 2)
				                        .reduce((i, j) -> i + j);
		System.out.println(result2);
		
		
		/* Few more stream methods like filter, findFirst and orElse*/
		/*Objective:from a collection filter out the methods which are not divisible by 3 and then multiply the rest of the numeber by 5 and find the first number */
		
		System.out.println(list.stream()
				               .filter(i->(i%3==0))
				               .map(i->i*2)
				               .findFirst()
				               .orElse(0)); 
	}

}
