package menu;

public class Menu {
	// メニューの表示
	public static void showMenu() {
		System.out.println("=====================");
		System.out.println("    商品管理システム");
		System.out.println("=====================");
		System.out.println("---------------------");
		System.out.println("1. 登録");
		System.out.println("2. 一覧表示");
		System.out.println("3. 更新");
		System.out.println("4. 削除");
		System.out.println("5. 検索");
		System.out.println("0. 終了");
		System.out.println("---------------------");
		System.out.println();
	}

	public static void showUpdateSelect() {
		System.out.println("---------------------");
		System.out.println("1. 商品名");
		System.out.println("2. 値段");
		System.out.println("3. 在庫数");
		System.out.println("4. 変更終了");
		System.out.println("---------------------");
	}

	public static void showIsDelete() {
		System.out.println("この商品を削除しますか？");
		System.out.println("---------------------");
		System.out.println("1. はい");
		System.out.println("2. いいえ");
		System.out.println("---------------------");
	}
}
