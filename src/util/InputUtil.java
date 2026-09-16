package util;

import java.util.InputMismatchException;
import java.util.Scanner;

import menu.Menu;

public class InputUtil {
	// メニュー選択の入力
	public static int inputMenu(Scanner scanner) {
		System.out.print("メニューから実行したい項目を入力してください:");
		int number = inputInt(scanner);

		while (number < 0 || number > 5) {
			System.out.print("”0〜5”の数字を入力してください:");
			number = inputInt(scanner);
		}
		return number;
	}

	// 商品名の入力
	public static String inputProductName(Scanner scanner) {
		System.out.print("商品名を入力してください:");
		return inputString(scanner);
	}

	// 商品の値段の入力
	public static int inputPrice(Scanner scanner) {
		System.out.print("商品の税抜きの値段を入力してください:");
		return inputInt(scanner);
	}

	// 商品の在庫数の入力
	public static int inputStock(Scanner scanner) {
		System.out.print("商品の在庫数を入力してください:");
		return inputInt(scanner);
	}

	// String（文字列型）の入力
	public static String inputString(Scanner scanner) {
		return scanner.next();
	}

	// int（整数型）の入力
	public static int inputInt(Scanner scanner) {
		while (true) {
			try {
				return scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("エラー:整数の数字を入力してください");
				scanner.next();
			}
		}
	}

	// 商品の更新項目の選択
	public static int inputUpdateSelect(Scanner scanner) {
		Menu.showUpdateSelect();
		System.out.print("更新したい項目を数字で入力してください:");
		int number = inputInt(scanner);
		while (number < 1 || number > 4) {
			System.out.print("”1〜4”の数字を入力してください:");
			number = inputInt(scanner);
		}
		return number;
	}

	// 商品を削除するかの確認
	public static boolean inputIsDelete(Scanner scanner) {
		Menu.showIsDelete();
		int number = inputInt(scanner);
		while (!(number == 1 || number == 2)) {
			System.out.print("”1”または”2”を入力してください:");
			number = inputInt(scanner);
		}
		return number == 1;
	}
}
