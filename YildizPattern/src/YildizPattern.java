public class YildizPattern {

    public static void main(String[] args) {
        int n = 5; // Çıktının satır sayısı

        System.out.print("*"); //ilk satirdaki yildiz
        System.out.println();
        System.out.println();

        for (int i = 1; i <= n; i++) { //satirlar icin

            for (int j = 1; j <= 2 * i ; j++) { // her satirdaki yildizların ikiser artirilmasi icin
                System.out.print("*");
            }

            System.out.println(); // Her yildizi bastiktan sonra bir sonraki satira geçmek icin
            System.out.println(); // Challange uzerinde belirtilen ciktida ki boş satir
        }
    }

}
