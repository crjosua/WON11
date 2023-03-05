public class firstExercise {
    public static void main(String[] args) { 
      int[] n = {1, 2, 3, 4, 5};
      int s = sumaNumere(n);
      System.out.println(s);
    }
    public static int sumaNumere (int[] numere) {
        int suma = 0;
        for (int i = 0; i < numere.length; i++) {
            suma = suma + numere[i];
        }
        return suma;
    }
}