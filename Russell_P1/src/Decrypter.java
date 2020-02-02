public class Decrypter {
	public static String decrypt(String number) {
		int arr[] = new int[4];
		for (int a = 0; a < 4; a++) {
			char en = number.charAt(a);
			arr[a] = Character.getNumericValue(en);
		}
		int temp = arr[0];
		arr[0] = arr[2];
		arr[2] = temp;
		temp = arr[1];
		arr[1] = arr[3];
		arr[3] = temp;
		for (int a = 0; a < 4; a++) {
			int numeral = arr[a];
			switch(numeral) {
				case 0:
					arr[a] = 3;
					break;
				case 1:
					arr[a] = 4;
					break;
				case 2:
					arr[a] = 5;
					break;
				case 3:
					arr[a] = 6;
					break;
				case 4:
					arr[a] = 7;
					break;
				case 5:
					arr[a] = 8;
					break;
				case 6:
					arr[a] = 9;
					break;
				case 7:
					arr[a] = 0;
					break;
				case 8:
					arr[a] = 1;
					break;
				case 9:
					arr[a] = 2;
					break;
			}
		}
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
