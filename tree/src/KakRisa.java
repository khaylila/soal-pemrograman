// Apakah Anda mencari informasi tentang penggunaan struktur data graph dalam bahasa pemrograman Java? Jika demikian, berikut ini adalah contoh proyek sederhana yang menggunakan struktur data graph di Java.

// java
import java.util.*;

class KakRisa {
    private int V; // Jumlah simpul/vertice dalam graf
    private LinkedList<Integer>[] adjacencyList; // Array untuk daftar tetangga setiap simpul

    // Konstruktor untuk inisialisasi graf
    KakRisa(int v) {
        V = v;
        adjacencyList = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adjacencyList[i] = new LinkedList<Integer>();
    }

    // Menambahkan tepian ke graf
    void addEdge(int v, int w) {
        adjacencyList[v].add(w);
    }

    // Metode utilitas yang digunakan untuk melakukan DFS pada graf
    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        // Iterasi melalui semua simpul tetangga dan melakukan DFS jika belum dikunjungi
        Iterator<Integer> i = adjacencyList[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    // Metode yang mengimplementasikan DFS. Memulai DFS dari semua simpul tak
    // dikunjungi
    void DFS() {
        boolean visited[] = new boolean[V];

        for (int i = 0; i < V; ++i)
            if (visited[i] == false)
                DFSUtil(i, visited);
    }

    public static void main(String args[]) {
        KakRisa graph = new KakRisa(4);

        // Menambahkan tepian antara simpul-simpul
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("Hasil penelusuran DFS pada graf: ");
        graph.DFS();
    }
}

// Pada contoh di atas, kita membuat kelas `Graph` yang merepresentasikan graf
// menggunakan struktur data adjacency list. `Graph` memiliki metode untuk
// menambahkan tepian antara simpul-simpul (`addEdge`), metode utilitas untuk
// melakukan penelusuran DFS (`DFSUtil`), dan metode utama (`DFS`) untuk memulai
// penelusuran DFS dari semua simpul tak dikunjungi.

// Dalam metode `main`, kita membuat objek graf dengan 4 simpul. Kemudian kita
// menambahkan beberapa tepian menggunakan metode `addEdge`. Terakhir, kita
// memanggil metode `DFS` untuk melakukan penelusuran DFS pada graf dan mencetak
// hasilnya.

// Output yang dihasilkan dari contoh di atas adalah:

// Hasil penelusuran DFS pada graf:
// 0 1 2 3

// Ini adalah hasil penelusuran DFS yang dilakukan pada graf dengan 4 simpul.

// Anda dapat mengubah contoh ini sesuai kebutuhan Anda untuk menggunakan
// struktur data graph dalam proyek Java Anda.

// import java.util.*;

// /**
// *
// * @author fauziah
// */
// class KakRisa {
// private int V;
// // jumlah simpul/vertice dalam graf private

// LinkedList<Integer>[] adjacencyList;
// private int v;

// // array untuk daftar tetangga setiap simpul
// // konstruktor untuk inisalisasi graf
// KakRisa(int V, LinkedList[] adjacencayList) {
// V = v;
// adjacencyList = new LinkedList[v];
// for (int i = 0; i < v; ++i)
// adjacencayList[i] = new LinkedList();
// }

// private KakRisa(int i) {
// throw new UnsupportedOperationException("Not supported yet."); // To change
// body of generated methods, choose
// // Tools | Templates.
// }

// // menambahkan tepian ke graf
// void addEdge(int v, int w) {
// adjacencyList[v].add(w);
// }

// // metode utilitas yang digunakan untuk melakukan DFS pada graf
// void DFSUtil(int v, boolean visited[]) {
// visited[v] = true;
// System.out.println(v + " ");

// // Iterasi melalui semua simpul tetangga dan melakukan DFS jik belum
// dikunjungi

// Iterator<Integer> i = adjacencyList[v].listIterator();
// while (i.hasNext()) {
// int n = i.next();
// if (!visited[n])
// DFSUtil(n, visited);
// }
// }

// public static void main(String args[]) {
// KakRisa graph = new KakRisa(4);

// // menambahkan tepian antara simpul
// graph.addEdge(0, 1);
// graph.addEdge(0, 2);
// graph.addEdge(1, 2);
// graph.addEdge(2, 0);
// graph.addEdge(2, 3);
// graph.addEdge(3, 3);

// System.out.println("Hasil penelusuran DFS pada graf: ");
// graph.DFS();

// }
// }