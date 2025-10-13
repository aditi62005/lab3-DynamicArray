public class DynamicArray {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.add(new Item("Wood"));
        inv.add(new Item("Stone"));
        inv.add(new Item("Herb"));
        inv.add(new Item("Herb"));

        System.out.print("Start:    "); inv.show();

        boolean r1 = inv.combine("Wood", "Stone", "Axe");
        System.out.println("Combined Wood+Stone -> " + r1);
        System.out.print("After 1:  "); inv.show();

        boolean r2 = inv.combine("Herb", "Herb", "Potion");
        System.out.println("Combined Herb+Herb -> " + r2);
        System.out.print("After 2:  "); inv.show();

        boolean r3 = inv.combine("Gem", "Stick", "Wand");
        System.out.println("Combined Gem+Stick -> " + r3);
        System.out.print("Final:    "); inv.show();
    }
}
