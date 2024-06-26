package com.example.bottomsheet

import android.os.Bundle
import android.widget.FrameLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomsheet.BottomSheetBehavior

class btnDialogShowActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_btn_dialog_show4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //BottomSheetBehavior - Плагин поведения взаимодействия для дочернего представления
        // CoordinatorLayout, чтобы оно работало как BottomSheet (https://developer.android.com/reference/com/google/android/material/bottomsheet/BottomSheetBehavior)
        BottomSheetBehavior.from(findViewById<FrameLayout>(R.id.sheet)).apply{
            peekHeight=250//Устанавливаем высоту BottomSheet, когда он свернут
            this.state=BottomSheetBehavior.STATE_COLLAPSED//Устанавливаем состояние, чтобы BottomSheet мог перетаскиваться

        }

    }
}