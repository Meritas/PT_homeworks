package manytoone;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManyToOneRelationship<String, Integer> mto = new ManyToOneRelationship<String, Integer>();
		mto.connect("Anika", 14);
		mto.connect("Tommie", 14);
		mto.connect("Haro", 14);
		mto.connect("Kori", 14);
		System.out.println("Source 'Tommie' contained?");
		if( mto.containsSource("Tommie")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println("Target '14' contained?");
		if( mto.containsTarget(14)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		mto.disconnectSource( "Haro" );
		System.out.print("Haro's target after removal: ");
		System.out.println(mto.getTarget("Haro"));
		
		mto.disconnect(14);
		System.out.println("Does the relation contain this target anymore?");
		if( mto.containsTarget(14)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}

}
