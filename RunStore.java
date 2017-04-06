
public class RunStore {

	public static void main(String[] args) {
	Grocer g = new Grocer(5);
		
		g.add(new Book ("Lincoln", 2, 25));
		g.add(new Fruit ("Lime",.5));
		g.add(new Book ( "Potato",2.5,100));
		System.out.println(g + "\n");
		System.out.println(g.totalPages() + " total pages\n");
		
		g.increasePrices(0.1);
		System.out.println(g + "\n");
		
		g.remove(new Book( "Lincoln", 399, 1));
		System.out.println(g + "\n");
		
		g.add(new Fruit( "Lime", 0.5));
		g.add(new Fruit( "Lime", 0.5));
		
		g.remove(new Fruit("Lime", 0.5));
		System.out.println(g);

	}

}
