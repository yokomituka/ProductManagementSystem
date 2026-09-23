package main;

import java.util.Scanner;

import menu.Menu;
import service.ProductService;
import util.InputUtil;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = 1;
		while (number != 0) {
			Menu.showMenu();
			number = InputUtil.inputMenu(scanner);
			menu(number, scanner);
		}

	}

	// メニューの選択
	public static void menu(int number, Scanner scanner) {
		switch (number) {
		case 1: {
			System.out.println("【登録】");
			ProductService.addProduct(scanner);
			break;
		}
		case 2: {
			System.out.println("【一覧表示】");
			ProductService.showProduct();
			break;
		}
		case 3: {
			System.out.println("【更新】");
			ProductService.updateProduct(scanner);
			break;
		}
		case 4: {
			System.out.println("【削除】");
			ProductService.deleteProduct(scanner);
			break;
		}
		case 5: {
			System.out.println("【検索】");
			ProductService.searchProduct(scanner);
			break;
		}
		case 0: {
			System.out.println("終了します");
			break;
		}
		default:
		}
	}
}
