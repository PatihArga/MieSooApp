// MieSooApp/app/src/main/java/com/example/miesooapp/MainActivity.kt
package com.example.miesooapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() { // Ganti ke DashboardActivity jika itu nama kelasnya
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.dashboard) // Pastikan ini menunjuk ke file layout yang benar

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Tambahkan logika untuk interaksi UI di sini
        // Misalnya, mencari tombol dan mengatur OnClickListener:
        // val viewFullMenuButton: Button = findViewById(R.id.button_view_full_menu)
        // viewFullMenuButton.setOnClickListener {
        //     // Logika ketika tombol diklik
        //     Toast.makeText(this, "Lihat Menu Lengkap diklik!", Toast.LENGTH_SHORT).show()
        // }
    }
}