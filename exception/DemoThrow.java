public class DemoThrow {
    public static void main(String[] args) {
        int umur = 15;
        if (umur < 18) {
            throw new ArithmeticException("Umur harus di atas 18 tahun!");
        } else {
            System.out.println("Akses diperbolehkan.");
        }
    }
}