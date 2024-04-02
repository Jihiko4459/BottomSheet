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
import com.marcoscg.dialogsheet.DialogSheet

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
            // 0:45 перезагрузила библиотеку, только после этого получилось импортировать
            val dialogSheet= DialogSheet(this)//создать dialogSheet
                .setTitle(R.string.app_name)//Установить заголовок к dialogSheet
                .setMessage(R.string.label_loren)//Установить основной текст к dialogSheet
                .setColoredNavigationBar(true)//Установить возможность?
                .setTitleTextSize(20)//Установить размер текста
                .setCancelable(false)//Установить возможность закрытия dialogSheet по нажатию на
                // затемненную область, в нашем случае отмена этой возможности
                .setPositiveButton(android.R.string.ok){//Добавить позитивную кнопку
                    // и прописываем действия после нажатия
                    Toast.makeText(applicationContext, "Hello", Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton(android.R.string.cancel){//Добавить негативную кнопку
                    // и пишем действия после нажатия в теле

                }
                .setNeutralButton("Neutral")//Добавляем нейтральную кнопку
                .setRoundedCorners(true)//Установить закругленные углы
                .setBackgroundColor(Color.BLACK)//Установить цвет фона dialogSheet
                .setButtonsColorRes(R.color.purple)//Установить цвет кнопок
                .setNeutralButtonColor(Color.WHITE)//Установить цвет нейтральной кнопки
            dialogSheet.show()//показать полученный dialogSheet
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