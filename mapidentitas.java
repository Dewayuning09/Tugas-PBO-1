import java.util.Map;
import java.util.TreeMap;

public class mapidentitas {
    public static void main(String[] args) {
        // deklarasi collection Map menggunakan implementasi class menggunakan TreeMap
        Map<String,String> identitas = new TreeMap<>();
        identitas.put("2105551055", "Yuning"); // method put() untuk menambahkan objek ke Map
        identitas.put("2105551056", "Yuda");
        identitas.put("2105551054", "Wayan");
        identitas.put("2105551053", "Adnyana");
        identitas.put("2105551052", "Cahyadi");

        System.out.println(identitas);

    }

}
