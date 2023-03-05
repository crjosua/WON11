public class secondExerciseCourse5 {
	public static void main(String[] args) {
		int[] n ={3, 4, 5, 6, 7, 8};
		int s = sumaNumere(n);
		System.out.println(s);

	}
	public static int sumaNumere(int[] numere) {
		int suma = 0;
		for(int i = 0; i < numere.length; i++) {
			if(numere[i] % 2 == 1){
				suma=suma+1;
			}
		}
		return suma;
	}
 }