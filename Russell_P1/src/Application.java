import java.util.Scanner;
public class Application {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Encrypter encrypt = new Encrypter();
		Decrypter decrypt = new Decrypter();
		Scanner pr = new Scanner(System.in);
		System.out.print("Enter data to be encrypted:");
		String number = pr.nextLine();
		String encryptedNumber = Encrypter.encrypt(number);
		String decryptedNumber = Decrypter.decrypt(encryptedNumber);
		System.out.println("The encrypted data is:" + encryptedNumber);
		System.out.println("The decrypted data is:" + decryptedNumber);
		System.out.println("The original data is:" + number);
		pr.close();
	}
}
