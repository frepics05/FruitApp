package com.example.mengenalbuah;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    public static final String KEY_MOVIE = "KEY";
    String idBuah ;
    ImageView gambar;
    TextView txtPenjelas, txtJudul;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txtJudul = findViewById(R.id.txtJudulDetail);
        txtPenjelas = findViewById(R.id.txtPenjelasDetail);
        gambar = findViewById(R.id.Gambar);

        idBuah = getIntent().getStringExtra(KEY_MOVIE);

        if (idBuah.equals("1")){
            txtJudul.setText("Jeruk");
            txtPenjelas.setText("Jeruk atau limau adalah semua tumbuhan berbunga anggota marga Citrus dari suku Rutaceae (suku jeruk-jerukan). Anggotanya berbentuk pohon dengan buah yang berdaging dengan rasa masam yang segar, meskipun banyak di antara anggotanya yang memiliki rasa manis. Rasa masam berasal dari kandungan asam sitrat yang memang menjadi terkandung pada semua anggotanya.\n" +
                    "\n" +
                    "Sebutan \"jeruk\" kadang-kadang juga disematkan pada beberapa anggota marga lain yang masih berkerabat dalam suku yang sama, seperti kingkit. Dalam bahasa sehari-hari, penyebutan \"jeruk\" atau \"limau\" (di Sumatra dan Malaysia) seringkali berarti \"jeruk keprok\" atau \"jeruk manis\". Di Jawa, \"limau\" (atau \"limo\") berarti \"jeruk nipis\".\n" +
                    "\n" +
                    "Jeruk sangatlah beragam dan beberapa spesies dapat saling bersilangan dan menghasilkan hibrida antarspesies ('interspecific hybrid) yang memiliki karakter yang khas, yang berbeda dari spesies tetuanya. Keanekaragaman ini seringkali menyulitkan klasifikasi, penamaan dan pengenalan terhadap anggota-anggotanya, karena orang baru dapat melihat perbedaan setelah bunga atau buahnya muncul. Akibatnya tidak diketahui dengan jelas berapa banyak jenisnya. Penelitian-penelitian terakhir menunjukkan adalah keterkaitan kuat Citrus dengan genus Fortunella (kumkuat), Poncirus, serta Microcitrus dan Eremocitrus, sehingga ada kemungkinan dilakukan penggabungan. Citrus sendiri memiliki dua anakmarga (subgenus), yaitu Citrus dan Papeda.\n" +
                    "\n" +
                    "Asal jeruk adalah dari Asia Timur dan Asia Tenggara, membentuk sebuah busur yang membentang dari Jepang terus ke selatan hingga kemudian membelok ke barat ke arah India bagian timur. Jeruk manis dan sitrun (lemon) berasal dari Asia Timur, sedangkan jeruk bali, jeruk nipis dan jeruk purut berasal dari Asia Tenggara.\n" +
                    "\n" +
                    "Banyak anggota jeruk yang dimanfaatkan oleh manusia sebagai bahan pangan, wewangian, maupun industri. Buah jeruk adalah sumber vitamin C dan wewangian/parfum penting. Daunnya juga digunakan sebagai rempah-rempah.");
            gambar.setImageResource(R.drawable.jeruk);

        }else if (idBuah.equals("2")){
            txtJudul.setText("Nanas");
            txtPenjelas.setText("Nanas, nenas, atau ananas (Ananas comosus (L.) Merr.) adalah sejenis tumbuhan tropis yang berasal dari Brasil, Bolivia, dan Paraguay Tumbuhan ini termasuk dalam familia nanas-nanasan (Famili Bromeliaceae). Perawakan (habitus) tumbuhannya rendah, herba (menahun) dengan 30 atau lebih daun yang panjang, berujung tajam, tersusun dalam bentuk roset mengelilingi batang yang tebal. Buahnya dalam bahasa Inggris disebut sebagai pineapple karena bentuknya yang seperti pohon pinus. Nama 'nanas' berasal dari sebutan orang Tupi untuk buah ini: anana, yang bermakna \"buah yang sangat baik\". Burung penghisap madu (hummingbird) merupakan penyerbuk alamiah dari buah ini, meskipun berbagai serangga juga memiliki peran yang sama.\n" +
                    "\n" +
                    "Buah nanas sebagaimana yang dijual orang bukanlah buah sejati, melainkan gabungan buah-buah sejati (bekasnya terlihat dari setiap 'sisik' pada kulit buahnya) yang dalam perkembangannya tergabung—bersama-sama dengan tongkol (spadix) bunga majemuk—menjadi satu 'buah' besar. Nanas yang dibudidayakan orang sudah kehilangan kemampuan memperbanyak secara seksual, tetapi ia mengembangkan tanaman muda (bagian 'mahkota' buah) yang merupakan sarana perbanyakan secara vegetatif. nanas meningkatkan pencernaan dan mengurangi jerawat. Di Indonesia, provinsi Lampung merupakan daerah penanaman nanas utama, dengan beberapa pabrik pengolahan nanas juga terdapat di sana.");
            gambar.setImageResource(R.drawable.nanas);

        }else if (idBuah.equals("3")){
            txtJudul.setText("Pear");
            txtPenjelas.setText("Pir adalah pohon yang berasal dari daerah beriklim tropis di Eropa Barat, Asia dan Afrika Utara. Pohon berketinggian sedang, bisa mencapai 10-17 meter tapi sebagian spesies merupakan pohon yang pendek yang memiliki daun yang rimbun.\n" +
                    "\n" +
                    "Daun berselang-seling, berbentuk lonjong yang lebar tapi bisa juga berbentuk membujur panjang (lanceolate) yang langsing. Panjang antara 2 sampai 12 cm. Pada sebagian spesies, daun berwarna hijau mengkilat atau sedikit berbulu berwarna keperakan. Sebagian besar pohon merontokkan daunnya di musim dingin (deciduous) dengan perkecualian dua spesies Pir di Asia Tenggara selalu berdaun hijau sepanjang tahun (evergreen).\n" +
                    "\n" +
                    "Pohon sangat tahan cuaca membeku di musim dingin hingga −25 °C and −40 °C kecuali spesies yang selalu berdaun hijau hanya tahan dingin sampai −15 °C.\n" +
                    "\n" +
                    "Bunga mekar di sekitar bulan April, berwarna putih dengan sedikit aksen warna kuning atau merah jambu. Bunga terdiri dari 5 daun mahkota. Diameter bunga antara 2 sampai 4 cm. Buah bertipe buah pome dengan diameter 1-4 cm pada spesies liar, sedangkan pohon hasil budidaya menghasilkan buah pir berukuran besar dengan ukuran sampai 18 × 8 cm. Bentuk buah beraneka ragam, sebagian besar spesies menghasilkan buah berbentuk bulat. Sebagian spesies seperti Pir Eropa menghasilkan buah yang bentuknya membesar di bagian bawah dan langsing di bagian pangkal buah. Buah siap panen di awal musim gugur.");
            gambar.setImageResource(R.drawable.pear);
        }else if (idBuah.equals("4")){
            txtJudul.setText("Anggur");
            txtPenjelas.setText("Anggur merupakan tanaman buah berupa perdu merambat yang termasuk ke dalam keluarga Vitaceae. Buah ini biasanya digunakan untuk membuat jus anggur, jelly, minuman anggur, minyak biji anggur dan kismis, atau dimakan langsung.[1] Buah ini juga dikenal karena mengandung banyak senyawa polifenol dan resveratol yang berperan aktif dalam berbagai metabolisme tubuh, serta mampu mencegah terbentuknya sel kanker dan berbagai penyakit lainnya. Aktivitas ini juga terkait dengan adanya senyawa metabolit sekunder di dalam buah anggur yang berperan sebagai senyawa antioksidan yang mampu menangkal radikal bebas.[3][4]\n" +
                    "\n" +
                    "Tanaman ini sudah dibudidayakan sejak tahun 4000 SM di Timur Tengah. Akan tetapi, proses pengolahan buah anggur menjadi minuman anggur baru ditemukan pada tahun 2500 SM oleh bangsa Mesir.[1] Hanya beberapa waktu berselang, proses pengolahan ini segera tersebar luas ke berbagai penjuru dunia, mulai dari daerah di Laut Hitam, Spanyol, Jerman, Prancis, dan Austria.[1] Penyebaran buah ini berkembang samakin pesat dengan adanya perjalanan Colombus yang membawa buah ini mengitari dunia.");
            gambar.setImageResource(R.drawable.anggur);
        }else if (idBuah.equals("5")){
            txtJudul.setText("Semangka");
            txtPenjelas.setText("Semangka atau tembikai (Citrullus lanatus, suku ketimun-ketimunan atau Cucurbitaceae) adalah tanaman merambat yang berasal dari daerah setengah gurun di Afrika bagian selatan. Tanaman ini masih sekerabat dengan labu-labuan (Cucurbitaceae), melon (Cucumis melo) dan ketimun (Cucumis sativus). Semangka biasa dipanen buahnya untuk dimakan segar atau dibuat jus. Biji semangka yang dikeringkan dan disangrai juga dapat dimakan isinya (kotiledon) sebagai kuaci.\n" +
                    "\n" +
                    "Sebagaimana anggota suku ketimun-ketimunan lainnya, habitus tanaman ini merambat namun ia tidak dapat membentuk akar adventif dan tidak dapat memanjat. Jangkauan rambatan dapat mencapai belasan meter.\n" +
                    "\n" +
                    "Daunnya berlekuk-lekuk di tepinya. Bunganya sempurna, berwarna kuning, kecil (diameter 3cm). Semangka adalah andromonoecious monoklin, yaitu memiliki dua jenis bunga pada satu tumbuhan: bunga jantan, yang hanya memiliki benang sari (stamen), dan bunga banci/hermafrodit, yang memiliki benang sari dan putik (pistillum). Bunga banci dapat dikenali dari adanya bakal buah (ovarium) di bagian pangkal bunga berupa pembesaran berbentuk oval.\n" +
                    "\n" +
                    "Buah semangka memiliki kulit yang keras, berwarna hijau pekat atau hijau muda dengan larik-larik hijau tua. Tergantung kultivarnya, daging buahnya yang berair berwarna merah atau kuning.\n" +
                    "\n" +
                    "Tanaman ini cukup tahan akan kekeringan terutama apabila telah memasuki masa pembentukan buah.");
            gambar.setImageResource(R.drawable.semangka);
        }else if (idBuah.equals("6")){
            txtJudul.setText("Strawberry");
            txtPenjelas.setText("Stroberi atau tepatnya stroberi kebun (juga dikenal dengan nama arbei, dari bahasa Belanda aardbei) adalah sebuah varietas stroberi yang paling banyak dikenal di dunia. Seperti spesies lain dalam genus Fragaria (stroberi), buah ini berada dalam keluarga Rosaceae. Secara umum buah ini bukanlah buah, melainkan buah palsu, artinya daging buahnya tidak berasal dari ovari tanaman (achenium) tetapi dari bagian bawah hypanthium yang berbentuk mangkok tempat ovari tanaman itu berada.\n" +
                    "\n" +
                    "\n" +
                    "Buah stroberi yang sudah masak\n" +
                    "Buah stroberi berwarna hijau keputihan ketika sedang berkembang, dan pada kebanyakan spesies berubah menjadi merah ketika masak. Namanya berasal dari bahasa Inggris kuno streawberige yang merupakan gabungan dari streaw atau \"straw\" dan berige atau \"berry\". Alasan pemberian nama ini masih tidak jelas. Beberapa spesies Lepidoptera mengambil sumber makanannya dari tumbuhan stroberi, menjadikan spesies ini hama utama tanaman stroberi.");
            gambar.setImageResource(R.drawable.strawberry);
        }else if (idBuah.equals("7")){
            txtJudul.setText("Apel");
            txtPenjelas.setText("Apel adalah jenis buah-buahan, atau buah yang dihasilkan dari pohon buah apel. Buah apel biasanya berwarna merah kulitnya jika masak dan (siap dimakan), namun bisa juga kulitnya berwarna hijau atau kuning. Kulit buahnya agak lembek, daging buahnya keras. Buah ini memiliki beberapa biji di dalamnya.\n" +
                    "\n" +
                    "Orang mulai pertama kali menanam apel di Asia Tengah. Kini apel berkembang di banyak daerah di dunia yang suhu udaranya lebih dingin. Nama ilmiah pohon apel dalam bahasa Latin ialah Malus domestica. Apel budidaya adalah keturunan dari Malus sieversii asal Asia Tengah, dengan sebagian genom dari Malus sylvestris (apel hutan/apel liar).\n" +
                    "\n" +
                    "Kebanyakan apel bagus dimakan mentah-mentah (tak dimasak), dan juga digunakan banyak jenis makanan pesta. Apel dimasak sampai lembek untuk dibuat saus apel. Apel juga dibuat untuk menjadi minuman sari buah apel.");
            gambar.setImageResource(R.drawable.apel);
        }else if (idBuah.equals("8")){
            txtJudul.setText("Kiwi");
            txtPenjelas.setText(
                    "Kiwi adalah sejenis buah beri yang dapat dimakan dari tanaman merambat berkayu dalam genus Actinidia. Actinidia asli berasal dari Shaanxi, Tiongkok.\n" +
                    "\n" +
                    "Buah kiwi yang normal berbentuk oval, kira-kira sebesar telur ayam (5–8 cm / 2–3 in dan diameter 4.5–5.5 cm / 1¾–2 ). Buah ini kaya serat, kulit berwarna hijau-kecokelatan dan daging buah berwarna hijau terang atau keemasan dengan biji kecil, hitam, dan bisa dimakan. Tekstur buah ini sangat halus dan rasanya yang unik, saat ini buah kiwi sudah ditanam di berbagai negara.\n" +
                    "\n" +
                    "Buah ini awalnya bernama Gosberi Cina, buah ini dinamai kembali dengan alasan ekspor marketing pada tahun 1950-an, menjadi melonette, kemudian kiwi. Nama buah ini berasal dari kiwi — burung yang tak bisa terbang dari Selandia Baru.");
            gambar.setImageResource(R.drawable.kiwi);
        }else if (idBuah.equals("9")){
            txtJudul.setText("Ceri");
            txtPenjelas.setText("Ceri adalah kelompok tumbuhan maupun buahnya anggota marga Prunus. Ceri tidak mencakup satu jenis saja, tetapi ada beberapa, seperti P. cerasus, P. avium, dan P. emarginata.\n" +
                    "\n" +
                    "Ceri adalah pohon yang sangat disukai di Jepang dan bunganya disebut sakura. Pada awal musim semi, di saat bunga ceri bermekaran, orang-orang berpiknik di taman-taman yang ditumbuhi pohon ini (Hanami). Di Australia ceri biasanya matang sekitar waktu Natal, sedangkan di Amerika dan Eropa selatan pada bulan Juni. Produksi di seluruh dunia saat ini tiga juta ton per tahun. Selain itu bunga dan buah ceri juga dijadikan hiasan hidangan makanan atau minuman. Buah ceri mengandung antosianin, yaitu pigmen warna merah yang baik untuk kesehatan karena merupakan antioksidan. Selain itu, rutin mengkonsumsi buah ceri setiap hari dapat menurunkan jumlah kadar asam urat dalam tubuh, bahkan dapat menyembuhkan pirai.");
            gambar.setImageResource(R.drawable.ceri);
        }else if (idBuah.equals("10")){
            txtJudul.setText("Alpukat");
            txtPenjelas.setText("Avokad (Persea americana) ialah tumbuhan penghasil buah meja dengan nama sama. Tumbuhan ini berasal dari Meksiko dan Amerika Tengah dan kini banyak dibudidayakan di Amerika Selatan dan Amerika Tengah sebagai tanaman perkebunan monokultur dan sebagai tanaman pekarangan di daerah-daerah tropika lainnya di dunia.\n" +
                    "\n" +
                    "Pohon, dengan batang mencapai tinggi 20 m dengan daun sepanjang 12 hingga 25 cm. Bunganya tersembunyi dengan warna hijau kekuningan dan ukuran 5 hingga 10 milimeter. Ukurannya bervariasi dari 7 hingga 20 sentimeter, dengan massa 100 hingga 1000 gram; biji yang besar, 5 hingga 6,4 sentimeter.\n" +
                    "\n" +
                    "Buahnya bertipe buni, memiliki kulit lembut tak rata berwarna hijau tua hingga ungu kecoklatan, tergantung pada varietasnya. Daging buah apokat berwarna hijau muda dekat kulit dan kuning muda dekat biji, dengan tekstur lembut.");
            gambar.setImageResource(R.drawable.alpukat);
        }
    }
}
