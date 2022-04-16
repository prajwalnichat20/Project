package Logical;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
	public static void main(String[] args) {

		List<Integer> li = new ArrayList<>();
		li.add(12);
		li.add(23);
		li.add(12);
		li.add(34);
		li.add(22);
		li.add(22);
		li.add(1);

		List<Integer> asc = li.stream().sorted((i1, i2) -> i1.compareTo(i2)).collect(Collectors.toList());

		System.out.println(asc);

		List<Integer> dec = li.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());

		System.out.println(dec);

		Integer mini = li.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(mini);

		Integer maxi = li.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(maxi);

		List<Integer> remdup = li.stream().distinct().collect(Collectors.toList());
		System.out.println(remdup);
	}
}
