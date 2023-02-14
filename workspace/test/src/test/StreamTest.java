package test;

import java.util.stream.IntStream;

public class StreamTest {
	public static void main(String[] args) {
//		IntStream.range(0, 10).map(i -> i * 3).filter(v -> v % 2 == 0).forEach(System.out::println);
		IntStream.range(0, 10).map(i -> i * 3).forEach(System.out::println);
//		.filter(v -> v % 2 == 0).forEach(v -> System.out.println(v));
//		IntStream.rangeClosed(0, 10)
	}
}
