package com.example.bottomsheet

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog

class btnDialogShowActivity2 : AppCompatActivity() {
    private lateinit var selectitem: TextView
    private lateinit var dialog:BottomSheetDialog
    private lateinit var itemAdapter: ItemAdapter
    private lateinit var recView:RecyclerView
    private val list=ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_btn_dialog_show2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        selectitem=findViewById(R.id.tvSelectItem)
        for (i in 1..10){
            list.add("item $i")
        }
        selectitem.setOnClickListener {
            showBottomSheet()
        }

    }
    private fun showBottomSheet(){
        val dialogView=layoutInflater.inflate(R.layout.bottom_sheet2, null)//создали неизменную переменную dialogView,
        // которая хранит разметку нашего BottomSheet
        dialog=BottomSheetDialog(this@btnDialogShowActivity2, R.style.BottomSheetDialogTheme)//присвоили значение переменной dialog,
        // обьекта класса BottomSheetDialog, указав контекст и ссылку на тему
        dialog.setContentView(dialogView)//установить dialogView,
        // в котором хранится разметка нашего BottomSheet, в dialog
        recView=dialogView.findViewById(R.id.rec)
        itemAdapter= ItemAdapter(list)
        recView.adapter=itemAdapter
        dialog.show()//показать bottomSheetDialog
    }
}