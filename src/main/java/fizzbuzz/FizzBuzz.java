package fizzbuzz;

import java.util.ArrayList;


class FizzBuzz {

	String processValue(int value) {
		ArrayList<String> result = new ArrayList<>();
		if (value % 3 == 0) {
			result.add("Fizz");
		}
		if (value % 5 == 0) {
			result.add("Buzz");
		}
		if (result.isEmpty()) {
			result.add(String.valueOf(value));
		}
		return String.join("", result);
	}

	String print1ToLimit(int limit) {
		int index;
		ArrayList<String> results = new ArrayList<>();

		for(index = 1; index <= limit; index++) {
			results.add(processValue(index));
		}
		return String.join(" ", results);
	}
}
