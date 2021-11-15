package com.example.pdftest

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        val layoutPdfCreator = findViewById<View>(R.id.layoutGeneratePdf) as LinearLayout
        layoutPdfCreator.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    PdfCreatorExampleActivity::class.java
                )
            )
        }
    }
}