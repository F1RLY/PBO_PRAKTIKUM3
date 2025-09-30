import java.io.*;

public class DemoThrows {
    public static void bacaFile(String namaFile) throws IOException {
        FileReader fr = new FileReader(namaFile); // Bisa menimbulkan FileNotFoundException
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        br.close();
    }

    public static void main(String[] args) {
        try {
            bacaFile("data.txt");
        } catch (IOException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }
    }
}
