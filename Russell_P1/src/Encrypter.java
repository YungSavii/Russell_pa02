public class Encrypter {
	public static String encrypt(String number) {
		int arr[] = new int[4];
		for (int a = 0; a < 4; a++) {
			char en = number.charAt(a);
			arr[a] = Character.getNumericValue(en);
		}
		for (int a = 0; a < 4; a++) {
			int temp = arr[a];
			temp += 7;
			temp = temp % 10;
			arr[a] = temp;
		}
		int temp = arr[0];
		arr[0] = arr[2];
		arr[2] = temp;
		arr[1] = arr[3];
		arr[3] = temp;
		int newNumber = 0;
		for (int a = 0; a < 4; a++) {
			newNumber = newNumber * 10 + arr[a];
		}
		String output = Integer.toString(newNumber);
		if (arr[0] == 0) {
			output = "0" + output;
		}
		return output;
	}
}
