package com.example.bottomsheet

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnDialogShow:MaterialButton=findViewById(R.id.btnShowDialog)
        val btnDialogShow2:MaterialButton=findViewById(R.id.btnShowDialog2)
        val btnDialogShow3:MaterialButton=findViewById(R.id.btnShowDialog3)
        val btnDialogShow4:MaterialButton=findViewById(R.id.btnShowDialog4)
        btnDialogShow.setOnClickListener {
            //1 способ Neco code
        // android не видит эту библиотеку
//            val dialogSheet=DialogSheet(this)
//                .setTitle(R.string.app_name)
//                .setMessage(R.string.label_loren)
//                .setColoredNavigationBar(true)
//                .setTitleTextSize(20)
//                .setCanselable(false)
//                .setPositiveButton(android.R.string.ok){
//                    Toast.makeText((applicationContext, "Hello", Toast.LENGTH_SHORT).show()
//                }
//                .setNavigationButton(android.R.string.cancel){
//
//                }
//                .setNeutralButton("Neutral")
//                .setRoundedCorners(true)
//                .setBackgroundColor(Color.BLACK)
//                .setButtonsColorRes(R.color.purple)
//                .setNeutralButtonColor(Color.WHITE)
//            dialogSheet.show()
        }
        btnDialogShow2.setOnClickListener {
            val i= Intent(this@MainActivity, btnDialogShowActivity2::class.java)
            startActivity(i)
        }
        btnDialogShow3.setOnClickListener {
            val i= Intent(this@MainActivity, btnDialogShowActivity3::class.java)
            startActivity(i)
        }
        btnDialogShow4.setOnClickListener {
            val i= Intent(this@MainActivity, btnDialogShowActivity4::class.java)
            startActivity(i)
        }



    }
}