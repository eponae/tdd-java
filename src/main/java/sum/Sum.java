package sum;

class Sum {

	long parseStringToInt(String stringNum) {
		long result;
		try {
			result =  Long.parseLong(stringNum);
		}
		catch(NumberFormatException numException) {
			return 0;
		}
		if(result < 0) {
			return 0;
		}
		return result;
	}


	long processSum(String stringNum1, String stringNum2) {
		long num1 = parseStringToInt(stringNum1);
		long num2 = parseStringToInt(stringNum2);
		return num1 + num2;
	}
}
