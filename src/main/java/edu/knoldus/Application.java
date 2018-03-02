package edu.knoldus;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Application {
	public static void listMultiply(List<Integer> list1, List<Integer> list2) {
		List<Integer> result = new ArrayList<>();
		IntStream.range(0, list1.size()).forEach(index -> result.add(list1.get(index) * list2.get(index)));
		System.out.println(result);
	}

	public static void main(String[] args) {

		listMultiply(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));

		String stringData = "My name is randhir My name is randhir";
		List<String> stringList = Arrays.asList(stringData.split("\\s+"));
		Map<String, Integer> wordCountMap = stringList.stream().collect(Collectors.toMap(word -> word, word -> 1, Integer::sum));
		System.out.println(wordCountMap);
	}
}
