package com.ilyasa.university.data

import android.view.View
import com.ilyasa.university.R
import com.ilyasa.university.University

/**
 * Created by Ilyasa Ridho
on 05,March,2021
 */
object UniversityData {
    private val universityNames = arrayOf(

        "Institut Teknologi Bandung",
        "Universitas Padjadjaran",
        "Universitas Telkom",
        "Universitas Pendidikan Indonesia",
        "Universitas Kristen Maranatha",
        "Universitas Katolik Parahyangan",
        "Universitas Widyatama",
        "Universitas Islam Negeri Sunan Gunung Djati Bandung",
        "Institut Teknologi Nasional",
        "Politeknik Negeri Bandung",
        "Universitas Pasundan",
        "Universitas Islam Bandung",
        "Universitas Islam Nusantara",
    )
    private val univesityAddress = arrayOf(
        "Jalan Ganesha No.10, Lb. Siliwangi, Coblong, Bandung",
        "Jalan Raya Bandung Sumedang Km. 21, Hegarmanah, Jatinangor, Bandung, Jawa Barat",
        "Jl. Telekomunikasi Terusan Buah Batu Indonesia 40257, Bandung",
        "Jl. Dr. Setiabudi No.229, Isola, Kec. Sukasari, Kota Bandung, Jawa Barat 40154",
        "Jalan Prof. Drg. Surya Sumantri No.65, Sukawarna, Bandung, Jawa Barat",
        "Jalan Ciumbuleuit No.94, Hegarmanah, Cidadap, Bandung, Jawa Barat",
        "Jalan Cikutra No.204A, Sukapada, Cibeunying Kidul, Bandung, Jawa Barat",
        "Jalan A.H. Nasution No. 105, Cipadung, Cibiru, Bandung, Jawa Barat",
        "Jalan PH.H. Mustofa No.23, Cikutra, Cibeunying Kidul, Neglasari, Cibeunying Kaler, Bandung, Jawa Barat",
        "Jl. Gegerkalong Hilir, Ciwaruga, Kec. Parongpong, Kabupaten Bandung Barat, Jawa Barat 40559",
        "Jl. Dr. Setiabudi No. 193 Bandung 40154",
        "Jl. Tamansari No.1, Tamansari, Kec. Bandung Wetan, Kota Bandung, Jawa Barat 40116",
        "Jl. Soekarno-Hatta No.530, Sekejati, Kec. Buahbatu, Kota Bandung, Jawa Barat 40286",
    )
    private val univesityDetail = arrayOf(
        "Institut Teknologi Bandung merupakan salah satu penghasil cendekiawan terbaik di Indonesia. Banyak tokoh-tokoh berpengaruh di bangsa ini yang lahir dari Institut Teknologi Bandung. Bahkan Ir. Soekarno dan BJ. Habibie juga tercatat sebagai alumni ITB.\n" +
                "\n" +
                "Tokoh lain yang tidak kalah penting adalah Sujiwo Tejo, Joko Anwar, Ridwan Kamil, Aburizal Bakrie, dan lainnya. ITB seringkali mengikuti ajang kompetisi tingkat internasional yang dihelat di luar negeri.\n" +
                "\n" +
                "Tidak jarang mahasiswa ITB turut menyabet penghargaan yang didapat dari kompetisi tersebut. Sebut saja juara debat internasional untuk kategori english for foreign language dalam kompetisi World University Debating Championship 2013-2014 di Chennai India.\n" +
                "\n" +
                "Pada tahun 2016, ITB juga sempat memenangkan juara pertama untuk kategori Geomatics Writing Science yang diadakan HSBC Business Case Competition.\n" +
                "\n" +
                "ITB lebih banyak menawarkan program studi yang berkaitan dengan bidang ilmu eksak.",
        "Jika Anda berminat untuk menempuh pendidikan di bidang ilmu sosial, Universitas Padjadjaran adalah pilihan terbaik di Bandung. Universitas ini menduduki peringkat ke-6 dalam situs Webometric Indonesia, dan 1492 untuk peringkat di dunia.\n" +
                "\n" +
                "Universitas Padjadjaran telah mengikuti ajang kompetisi dan non-kompetisi bertaraf nasional dan internasional. Torehan prestasinya mencangkup peraihan honorable delegates and best performance dalam ajang Indonesia – Vietnam Youth Friendship Program (IVYP) di tahun 2016, juara kedua dalam Psycompilation National Competition di tahun 2016, sampai menghasikan 155 HAKI (Hak Kekayaan Intelektual) pada tahun 2012.",
        "Universitas Telkom telah berhasil mencetak para pakar ICT dan Telekomunikasi terkemuka di Indonesia. Universitas milik perusahaan Telkom Indonesia ini dilengkapi oleh fasilitas untuk menunjang kebutuhan belajar para mahasiswa, seperti laboratorium, studio, perpustakaan, bengkel, career center, sport center, dan akses Wi-Fi.\n" +
                "\n" +
                "Cukup banyak prestasi yang telah ditorehkan Universitas Telkom Bandung. Beberapa diantaranya adalah juara satu ajang mandiri Young Enterprenuer tahun 2015, dan peringkat 1 di Asia dan 6 di dunia untuk ajang Cyberlimpic di Barcelona pada tahun 2014.",
        "Universitas di Bandung juga ada yang ditujukan bagi mereka yang bercita-cita menjadi tenaga pendidik. Universitas Pendidikan Indonesia adalah tempatnya. Universitas ini dahulu bernama IKIP Bandung. Seiring berjalannya waktu, namanya berubah menjadi Universitas Pendidikan Indonesia.\n" +
                "\n" +
                "Universitas Pendidikan Indonesia mampu meraih peringkat tinggi dalam Webometrics, yakni peringkat ke-19 di Indonesia dan ke-2745 se dunia. Adapun dalam hal prestasi, Universitas Pendidikan Indonesia pernah meraih juara dalam kompetisi Nation Wide English Olympic NEO pada tahun 2010.",
        "Selain menjadi cendekiawan yang berpengetahuan, lulusan Universitas Kristen Maranatha juga diharapkan mampu menjadi insan Kristen yang taat dan bijak dalam menggunakan pengetahuan mereka. Universitas ini sangat terkenal di kalangan mahasiswa Kristen yang ingin menuntut ilmu di Bandung.\n" +
                "\n" +
                "Universitas Kristen Maranatha pernah menjuarai sejumlah kompetisi nasional. Sebut saja Juara Harapan 1 di Indocement Award tahun 2016, dan juara III untuk kompetisi Desain Jembatan Indonesia pada tahun 2016.\n" +
                "\n" +
                "Untuk peringkatnya sendiri, Universitas Kristen Maranatha menduduki urutan ke-63 di Indonesia, dan 4677 di dunia. ",
        "Universitas di Bandung lainnya yang sering menjadi buruan mahasiswa beragama Kristen adalah Universitas Katolik Parahyangan, atau yang biasa disingkat dengan UNPAR. Universitas ini disebut-sebut sebagai universitas swasta tertua di Bandung, dan saat ini peringkatnya sudah menduduki urutan ke-30 di Indonesia.\n" +
                "\n" +
                "Sejumlah pesohor negeri yang tercatat pernah berkuliah di universitas ini adalah Olga Lydia, Tika Panggabean, Tulus, Chantal Della Concetta, dan lainnya. Beberapa prestasi yang pernah diraih mahasiswa UNPAR diantaranya adalah pemenang 1st Prize dalam ajang The 51st International Chorwettbewerb di Austria pada tahun 2014 dan pernghargaan dari The Chiuxid International Design tahun 2016.",
        "Universitas Widyatama adalah salah satu universitas swasta terbaik di Bandung. Saat ini Universitas Widyatama berada di peringkat 73 dari semua universitas di Indonesia, dan peringkat ke-5048 di dunia. Universitas Widyatama juga dikenal memiliki jaringan alumni yang kuat.\n" +
                "\n" +
                "Untuk fasilitas, Universitas Widyatama menyediakan perpustakaan, pusat IT, laboratorium, studio, poliklinik, bank, career center, tempat ibadah, business community development, food court dan lainnya.",
        "Salah satu Universitas Islam terbaik di Bandung adalah Universitas Islam Negeri Sunan Gunung Djati. Universitas ini menduduki peringkat ke-70 se-Indonesia, versi situs Webometric.\n" +
                "\n" +
                "Universitas Islam Negeri Sunan Gunung Djati berada langsung di bawah Kementerian Agama dalam hal operasionalnya. Universitas ini juga sempat mendapat penghargaan sebagai satu-satunya universitas di bawah Kemenag yang sukses menunjukkan keterbukaan Informasi Publik pada tahun 2015.",
        "Anda yang ingin melanjutkan studio di bidang teknik dan teknologi bisa menjadikan Institut Teknologi Nasional sebagai destinasi belajar. Saat ini, Institut Teknologi Nasional menduduki perungkat ke-82 di Indonesia, dan ke-5473 se-dunia.\n" +
                "\n" +
                "Ada tiga fakultas yang ditawarkan, yakni Fakultas Teknologi Industri, Fakultas Teknik Sipil dan Perencanaan, dan Fakultas Seni Rupa dan Desain.",
        "Jika ingin menjadi tenaga kerja terampil setelah lulus kuliah, menuntut ilmu di Politeknik Negeri Bandung bisa menjadi pilihannya. Politeknik ini menduduki urutan ke-95 di Indonesia. Lulusannya dikenal sebagai lulusan yang siap kerja.\n" +
                "\n" +
                "Politeknik Negeri Bandung pernah memenangkan beberapa kompetisi bertaraf internasional. Salah satunya adalah juara kontes robot di acara World Robot Olympic, Amerika Serikat pada tahun 2015.",
        "Universitas Pasundan Bandung (UNPAS) didirikan pada tahun 1960, dan merupakan universitas swasta terbaik di peringkat 3 se-Indonesia versi 4Icu. Akreditasinya A, dan saat ini telah menerima mahasiswa dari berbagai belahan dunia, seperti Thailand, Somalia, Singapura, Hungaria, Estonia, Polandia, Taiwan, Turki, Jepang, Tajikistan dan lainnya.",
        "Sesuai namanya, Universitas Islam Bandung adalah salah satu universitas di Bandung yang bernafaskan Islam. Universitas ini memiliki nilai-nilainya sendiri yang didapat dari tri dharma perguruan tinggi, yaitu Mujahid, Mujtahid dan Mujaddid. Jadi, selain diajarkan untuk memperoleh ilmu pengetahuan, peserta didik juga dibina untuk pengabdian masyarakat dan penelitian.",
        "Satu lagi universitas Islam di Bandung yang tidak boleh luput bagi And ayang ingin melanjutkan studi di kota kembang ini, yaitu Universitas Islam Nusantara. Uninus, begitu singkatan untuk Universitas Islam Nusantara, menargetkan lulusan mereka menjadi insan cendekia muslim yang berakhlak mulia dan berilmu tinggi.\n" +
                "\n" +
                "Universitas ini juga mengusung semangat Islami-neal-prenuer (Islamic Milenial Enterprenuer) untuk menjawab tantangan zaman."

    )
    private val universityAkreditasi = arrayOf(
        "A",
        "A",
        "A",
        "A",
        "A",
        "A",
        "A",
        "A",
        "A",
        "A",
        "A",
        "A",
        "B"


    )

    private val imgUniversity = intArrayOf(
        R.drawable.itb,
        R.drawable.unpad,
        R.drawable.telkom,
        R.drawable.upi,
        R.drawable.maranatha,
        R.drawable.unpar,
        R.drawable.widyatama,
        R.drawable.uin,
        R.drawable.itenas,
        R.drawable.polban,
        R.drawable.unpas,
        R.drawable.unisba,
        R.drawable.uninus

    )
    private val logoUniversity = intArrayOf(
        R.drawable.logoitb,
        R.drawable.logounpad,
        R.drawable.logotelkom,
        R.drawable.logoupi,
        R.drawable.logomaranatha,
        R.drawable.logounpar,
        R.drawable.logoutama,
        R.drawable.logouin,
        R.drawable.itenaslogo,
        R.drawable.polbanlogo,
        R.drawable.logounpas,
        R.drawable.logounisba,
        R.drawable.logouninus,


        )
    val listData: ArrayList<University>
        get() {
            val list = arrayListOf<University>()
            for (position in universityNames.indices) {
                val university = University()
                university.name = universityNames[position]
                university.address = univesityAddress[position]
                university.akreditasi = universityAkreditasi[position]


                university.logo = logoUniversity[position]
                university.photo = imgUniversity[position]
                university.detail = univesityDetail[position]

                list.add(university)
            }
            return list
        }

}