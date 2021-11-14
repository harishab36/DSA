/**
 * 
 */
package com.dsa.streams;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Harish
 *
 */
public class StreamsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=10000;i++) {
			list.add(i);
		}
		
		Predicate<Integer> evenPredicate = i -> i%2 == 0;
		StreamsDemo demo = new StreamsDemo();
		System.out.println("SEQUENTIAL STREAM "+demo.sequentialStream(list, evenPredicate));
		System.out.println("PARALLEL STREAM "+demo.parallelStream(list, evenPredicate));
	}
	
	public long sequentialStream(List<Integer> list, Predicate<Integer> p) {
		Instant start = Instant.now();
		List<Integer> evenList = list.stream().filter(p).collect(Collectors.toList());
		Instant end = Instant.now();
		Duration totalTime = Duration.between(start, end);
		return totalTime.toMillis();
	}
	
	public long parallelStream(List<Integer> list, Predicate<Integer> p) {
		Instant start = Instant.now();
		List<Integer> evenList = list.parallelStream().filter(p).collect(Collectors.toList());
		Instant end = Instant.now();
		Duration totalTime = Duration.between(start, end);
		return totalTime.toMillis();
	}
	

}
