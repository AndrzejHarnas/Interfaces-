
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double x=15.14;
		double y=7.15;
		double x1=100;
		double y1=100;
		
		int tab[] = new int[5];
		int tab2[][] ={{1,2,3},{1,2,3}};
		
		
		Point punkt = new Point(x,y);
		
		
		punkt.move(x1, y1);
		punkt.getPosition();

		tab[0]=6;
		

		
		for(int i=0;i<tab2.length;i++){
			for(int j=0;j<tab2[i].length;j++){
				
			System.out.println(tab2[i][j]);	
				
			}
		}
		
	}

}
