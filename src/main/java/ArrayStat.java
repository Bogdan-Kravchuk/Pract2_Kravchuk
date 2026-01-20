public class ArrayStat {
private static int min = 0;
private static int max = 0;
    private static int average = 0;

    public static void findMin(int[] array) {
        if (array.length <= 0) {
            System.out.println("Помилка. Довжина масиву не може бути <=0");
            return;
        }
        min = array[0];
for (int i=0; i<array.length; i++) {
    if (array[i]< min) {
        min = array[i];
    }

}
        System.out.println("Мінімальний елемент: " + min);
    }
    public static void   findMax(int[] array) {
        if (array.length <= 0) {
            System.out.println("Помилка. Довжина масиву не може бути <=0");
            return;
        }
        max = array[0];
        for (int i=0; i<array.length; i++) {
            if (array[i]> max) {
                max = array[i];
            }

        }
        System.out.println("Максимальний елемент: " + max);
    }

    public static void  calculateAvg(int[] array){
        if (array.length <= 0) {
            System.out.println("Помилка. Довжина масиву не може бути <=0");
            return;
        }
        for(int i=0; i<array.length; i++){
            average += array[i];
        }
        average /= array.length;

        System.out.println("Середнє аримнетичне: " + average);
    }



}
