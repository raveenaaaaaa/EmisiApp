package com.staysafe.emisiapp

import java.util.*
import kotlin.collections.ArrayList

internal object ExpandableListData {
    val data: HashMap<String, List<String>>
        get() {
            val expandableListDetail =
                HashMap<String, List<String>>()
            val pengertian: MutableList<String> =
                ArrayList()
            pengertian.add("Emisi karbon adalah gas yang dikeluarkan dari hasil pembakaran senyawa yang mengandung karbon, seperti CO2, solar, LPJ, dan bahan bakar lainnya. Dalam arti sederhana, emisi karbon adalah pelepasan karbon ke atmosfer. \n" + "Emisi karbon menjadi kontributor perubahan iklim bersama dengan emisi gas rumah kaca. Emisi gas yang berlebihan dapat menyebabkan pemanasan global atau efek rumah kaca. Hal ini mengakibatkan peningkatan suhu di bumi secara signifikan.")

            val faktor: MutableList<String> = ArrayList()
            faktor.add("Emisi karbon disebabkan oleh aktivitas pembakaran senyawa-senyawa yang mengandung karbon. Untuk mengetahui besaran emisi, maka dilakukan pengukuran jejak karbon. \n" +
                    "\n" +
                    "Jejak karbon berasal dari jejak ekologis yang merupakan ukuran dampak terhadap lingkungan yang dinyatakan sebagai jumlah lahan yang dibutuhkan untuk mempertahankan sumber daya alam. \n" +
                    "\n" +
                    "Emisi karbon juga disebabkan karena pembakaran bahan bakar fosil di bidang manufaktur, pemanasan, dan transportasi, serta emisi yang diperlukan untuk menghasilkan listrik untuk keperluan barang dan jasa yang dikonsumsi.")

            val dampak: MutableList<String> = ArrayList()
            dampak.add("Emisi karbon berdampak terhadap perubahan iklim global. Beberapa studi penelitian emisi karbon telah menarik perhatian para peneliti karena iklim global yang berubah dengan cepat. Para peneliti berhasil mengungkap bahwa emisi antropogenik dari satu triliun ton karbon cenderung menyebabkan peningkatan suhu global sebesar dua derajat Celcius.")

            val cara: MutableList<String> = ArrayList()
            cara.add("1. Pada Bidang Transportasi \n"+"- Hindari perjalanan mobil yang menimbulkan polusi (setiap liter bahan bakar yang dibakar dalam mesin mobil mengeluarkan lebih dari 2,5 kg CO2) dan usahakan berjalan kaki, bersepeda, atau menggunakan transportasi umum, terutama kereta api.\n" + "- Jika Anda mengemudi, bagikan perjalanan dengan orang lain dan jangan mengebut karena menggunakan lebih banyak bensin dan karena itu, mengeluarkan lebih banyak CO2.")
            cara.add("2. Pada Bidang Penggunaan Energi \n" + "- Cabut alat elektronik Anda jika sudah tidak digunakan lagi karena tetap menguras listrik. \n" + "- Cabut charger handphone Anda karena masih menguras listrik walaupun tidak terhubung dengan handphone.\n" +"- Matikan lampu saat Anda tidak membutuhkannya dan gunakan lampu hemat energi seperti LED.")
            cara.add("3. Pada Bidang Pengelolaan Sampah \n" + "- Hindari membeli tas baru untuk mengangkut belanjaan kembali ke rumah dengan menggunakan kembali tas belanja.\n" + "- Pilih produk dengan sedikit/tanpa kemasan, ini pada akhirnya menghemat biaya produkis. ")

            expandableListDetail["Definisi Emisi Karbon"] = pengertian
            expandableListDetail["Faktor Emisi Karbon"] = faktor
            expandableListDetail["Dampak Emisi Karbon"] = dampak
            expandableListDetail["Cara Mengurangi Emisi Karbon"] = cara

            return expandableListDetail
        }
}