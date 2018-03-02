package edu.knoldus;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

public class WorldCount {
	public static void wordCount() throws IOException {
		String filePath = "/home/knoldus/Desktop/java.txt";

		try (final Stream<String> lines = Files.lines(Paths.get(filePath))) {

			Map<String, Integer> map = lines.map(line -> line.split("[\\s]+"))
					.flatMap(Arrays::stream).collect(groupingBy(Function.identity(), summingInt(e -> 1)));
			System.out.println(map);
		}
	}

	public static void main(String[] args) throws IOException {
		wordCount();
	}
}
