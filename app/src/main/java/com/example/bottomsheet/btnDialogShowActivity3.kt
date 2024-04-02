package com.example.bottomsheet

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomsheet.BottomSheetDialog

class btnDialogShowActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_btn_dialog_show3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //2 и 3 видеоролики описывают один и тот же способ, но в нем не получается сделать закругления,
        // точнее они есть, но при запуске их не видно
        val btn:AppCompatButton=findViewById(R.id.button)
        btn.setOnClickListener {
            val bottomSheetDialog= BottomSheetDialog(this@btnDialogShowActivity3, R.style.BottomSheetDialogTheme)//создали наш BottomSheetDialog,
            //указав контекст и ссылку на тему
            val bottomSheetView = LayoutInflater.from(applicationContext).inflate(
                R.layout.layout_bottom_sheet3,
                findViewById<LinearLayout>(R.id.bottomSheet))//создали неизменную переменную bottomSheetView,
            // которая хранит разметку нашего BottomSheet
            bottomSheetView.findViewById<View>(R.id.btn_share).setOnClickListener {
                Toast.makeText(this@btnDialogShowActivity3, "Share...", Toast.LENGTH_SHORT).show()
                bottomSheetDialog.dismiss()//закрыть bottomSheetDialog
            }
            bottomSheetDialog.setContentView(bottomSheetView)//установить bottomSheetView,
            // в котором хранится разметка нашего BottomSheet, в bottomSheetDialog
            bottomSheetDialog.show()//показать bottomSheetDialog
        }
    }
}