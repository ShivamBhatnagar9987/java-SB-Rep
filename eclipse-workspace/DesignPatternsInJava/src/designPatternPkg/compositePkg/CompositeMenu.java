package designPatternPkg.compositePkg;

public class CompositeMenu {
	public static void main(String[] args) {
		Menu mainMenu = new Menu("Main", "/main");
		MenuItem safetyMenuItem = new MenuItem("safety", "/safety");
		mainMenu.add(safetyMenuItem);
		Menu claimsSubMenu = new Menu("claims", "/claims");
		mainMenu.add(claimsSubMenu);
		MenuItem personalClaimsMenu = new MenuItem("Personal Claims", "/personalClaims");
		claimsSubMenu.add(personalClaimsMenu);
		System.out.println(mainMenu.toString());
	}
}
