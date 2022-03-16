import java.util.LinkedHashSet;
import java.util.Set;

public class settlpn {
    public static void main(String[] args) {
        // deklarasi collection Set menggunakan implementasi class menggunakan LinkedHashSet
        Set<String> tlpn = new LinkedHashSet<>();
        tlpn.add("0876552"); // method add() untuk menambahkan objek ke Set
        tlpn.add("0872636");
        tlpn.add("0828727");
        tlpn.add("0972222");
        tlpn.add("0286363");

        System.out.println(tlpn);

    }
}
