public class sixthExerciseCourse5 {
	public static void main(String[] args) {
		String a = new String("Vine iarna peste Winterfell");
		for(int i = 0; i < a.length(); i++){
			char aux=a.charAt(i);
			if(aux != ' ') {
				System.out.print(aux);
			}
			else System.out.println();
		}
	}
}