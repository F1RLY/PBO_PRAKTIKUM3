public class DemoException {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // Akan menimbulkan ArithmeticException
            System.out.println("Hasil: " + a);
        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak bisa membagi dengan nol!");
        } finally {
            System.out.println("Blok finally selalu dijalankan, meskipun ada error.");
        }
    }
}
