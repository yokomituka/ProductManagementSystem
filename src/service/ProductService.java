package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Product;
import util.InputUtil;

public class ProductService {
	private final static List<Product> products = new ArrayList<>();

	// 商品の登録（同じ商品名の商品は登録できない）
	public static void addProduct(Scanner scanner) {
		Product newProduct = new Product(InputUtil.inputProductName(scanner), InputUtil.inputPrice(scanner),
				InputUtil.inputStock(scanner));

		boolean isadd = true;
		for (Product product : products) {
			if (product.getName().equals(newProduct.getName())) {
				isadd = false;
			}
		}

		if (isadd) {
			products.add(newProduct);
			System.out.println("商品を登録しました");
		} else {
			System.out.println("同じ商品名の商品は登録できません");
		}
		System.out.println();
	}

	// 商品の一覧表示
	public static void showProduct() {
		System.out.println("--------------------------------------");
		for (Product product : products) {
			System.out.println(product.toString());
		}
		System.out.println("--------------------------------------");
		System.out.println();
	}

	// 商品の更新
	public static void updateProduct(Scanner scanner) {
		System.out.print("更新したい商品の名前を入力してください:");
		String updateProductName = InputUtil.inputString(scanner);

		for (Product product : products) {
			if (product.getName().equals(updateProductName)) {
				while (true) {
					System.out.println("【変更商品】");
					System.out.println("--------------------------------------");
					System.out.println(product.toString());
					System.out.println("--------------------------------------");
					switch (InputUtil.inputUpdateSelect(scanner)) {
					case 1: {
						System.out.print("変更する商品名を入力してください:");
						product.setName(InputUtil.inputString(scanner));
						break;
					}
					case 2: {
						System.out.print("変更する値段を入力してください:");
						product.setPrice(InputUtil.inputInt(scanner));
						break;
					}
					case 3: {
						System.out.print("変更する在庫数を入力してください:");
						product.setStock(InputUtil.inputInt(scanner));
						break;
					}
					case 4: {
						System.out.println("変更終了");
						System.out.println();
						return;
					}
					default:
					}
				}
			}
		}
		System.out.println("商品が見つかりませんでした");
		System.out.println();
	}

	// 商品の削除
	public static void deleteProduct(Scanner scanner) {
		System.out.print("削除したい商品の名前を入力してください:");
		String deleteProductName = InputUtil.inputString(scanner);
		Product deleteProduct = null;

		for (Product product : products) {
			if (product.getName().equals(deleteProductName)) {
				System.out.println("--------------------------------------");
				System.out.println(product.toString());
				System.out.println("--------------------------------------");
				if (InputUtil.inputIsDelete(scanner)) {
					deleteProduct = product;
				}
				break;
			}
		}

		if (deleteProduct != null) {
			System.out.println("商品を削除しました");
			products.remove(deleteProduct);
		} else {
			System.out.println("削除をキャンセルしました");
		}

		System.out.println();
	}

	// 商品の検索
	public static void searchProduct(Scanner scanner) {
		System.out.print("検索するキーワードを入力してください:");
		String searchProduct = InputUtil.inputString(scanner);

		System.out.println("--------------------------------------");
		for (Product product : products) {
			if (product.getName().contains(searchProduct)) {
				System.out.println(product.toString());
			}
		}
		System.out.println("--------------------------------------");
		System.out.println();

	}
}
