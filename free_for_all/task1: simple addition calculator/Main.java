import java.util.Scanner; public class Main {public static void additionFunc(String strValue) {String[] strArray = strValue.split(" "); int int1 = Integer.parseInt(strArray[0]); int int2 = Integer.parseInt(strArray[1]); System.out.println(int1 * int2);} public static void main(String[] args) {Scanner scanner = new Scanner(System.in); String line = scanner.nextLine(); additionFunc(line);}}