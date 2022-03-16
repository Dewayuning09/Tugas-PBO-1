import java.util.ArrayList;
import java.util.List;


public class listlagu {
    public static void main(String[] args) {
        // deklarasi collection List menggunakan implementasi class menggunakan ArrayList
        List<String> lagu = new ArrayList<>();
        lagu.add("hati-hati dijalan"); // method add() untuk menambahkan objek ke List
        lagu.add("pacar rahasia");
        lagu.add("seandainya");
        lagu.add("takut tambah dewasa");
        lagu.add("pacar rahasia");

        System.out.println(lagu);

    }
}
