package id.ti2b.pnm.apppertambahan

import android.health.connect.datatypes.units.Length
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import id.ti2b.pnm.apppertambahan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main = ActivityMainBinding.inflate(layoutInflater)
        val view = main.root
        setContentView(view)

        val input1 = main.input1
        val input2 = main.input2
        val TAMBAH = main.TAMBAH
        val KURANG = main.KURANG
        val BAGI = main.BAGI
        val KALI = main.KALI
        val HASIL = main.HASIL

        TAMBAH.setOnClickListener {
            var nilai1 = input1.text.toString()
            var nilai2 = input2.text.toString()

            if (nilai1.isEmpty() || nilai2.isEmpty()) {
                Toast.makeText(this, "mohon lengkapi kedua data", Toast.LENGTH_SHORT).show()
            }
            else {
                var total = Integer.parseInt(nilai1) + Integer.parseInt(nilai2)
                HASIL.text = total.toString()
                input1.text.clear()
                input2.text.clear()
            }
        }
        KURANG.setOnClickListener {
            var nilai1 = input1.text.toString()
            var nilai2 = input2.text.toString()

            if (nilai1.isEmpty() || nilai2.isEmpty()) {
                Toast.makeText(this, "mohon lengkapi kedua data", Toast.LENGTH_SHORT).show()
            }
            else {
                var total = Integer.parseInt(nilai1) - Integer.parseInt(nilai2)
                HASIL.text = total.toString()
                input1.text.clear()
                input2.text.clear()
            }
        }
        BAGI.setOnClickListener {
            var nilai1 = input1.text.toString()
            var nilai2 = input2.text.toString()

            if (nilai1.isEmpty() || nilai2.isEmpty()) {
                Toast.makeText(this, "mohon lengkapi kedua data", Toast.LENGTH_SHORT).show()
            }
            else {
                var total = nilai1.toFloat() / nilai2.toFloat()
                HASIL.text = total.toString()
                input1.text.clear()
                input2.text.clear()
            }
        }
        KALI.setOnClickListener {
            var nilai1 = input1.text.toString()
            var nilai2 = input2.text.toString()

            if (nilai1.isEmpty() || nilai2.isEmpty()) {
                Toast.makeText(this, "mohon lengkapi kedua data", Toast.LENGTH_SHORT).show()
            }
            else {
                var total = Integer.parseInt(nilai1) * Integer.parseInt(nilai2)
                HASIL.text = total.toString()
                input1.text.clear()
                input2.text.clear()
            }
        }



    }
}