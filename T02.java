// 12S24058-Airene Situmorang
// 12S24035-Josua Sianturi

import java.util.*;
import java.lang.Math;

public class TO2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn;
        String judul;
        String penulis;
        int tahun;
        String penerbit;
        String formatbuku;
        double harga;
        double margin;
        int stok;
        double rating;
        String kategori;

        isbn = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahun = Integer.parseInt(input.nextLine());
        penerbit = input.nextLine();
        formatbuku = input.nextLine();
        harga = Double.parseDouble(input.nextLine());
        margin = Double.parseDouble(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        if (rating <= 5) {
            if (rating >= 4.7) {
                kategori = "best pick";
            } else {
                if (rating >= 4.5) {
                    kategori = "must read";
                } else {
                    if (rating >= 4.0) {
                        kategori = "reccomended";
                    } else {
                        if (rating >= 3.0) {
                            kategori = "averege";
                        } else {
                            kategori = "low";
                        }
                    }
                }
            }
        } else {
            kategori = "tak terdefenisi";
        }
        System.out.println(isbn + "|" + judul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + formatbuku + "|" + harga + "|" + margin + "|" + stok + "|" + rating + "|" + kategori);
    }
}
