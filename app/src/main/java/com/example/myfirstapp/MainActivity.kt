package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myfirstapp.constance.Constance
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.btResult.setOnClickListener {

            val reload = bindingClass.edValue.text.toString().lowercase()
            when (reload) {
                Constance.WIPERS -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ${Constance.WIPERS_SALARY}"
                    bindingClass.tvResult.text = if (bindingClass.edPassword.text.toString() == Constance.WIPERS_PASSWORD) {
                        tempText
                    } else {
                        "Неверный пароль"
                    }
                }
                Constance.WORKER -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ${Constance.WORKER_SALARY}"
                    bindingClass.tvResult.text = if (bindingClass.edPassword.text.toString() == Constance.WORKER_PASSWORD) {
                         tempText
                    } else {
                        "Неверный пароль"
                    }
                }
                Constance.DIRECTOR -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Получите ${Constance.DIRECTOR_SALARY}"
                    bindingClass.tvResult.text = if (bindingClass.edPassword.text.toString() == Constance.DIRECTOR_PASSWORD) {
                         tempText
                    } else {
                         "Неверный пароль"
                    }
                }
                Constance.PUSTO -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    val tempText = "Введите имя ${Constance.PUSTO_SALARY}"
                    bindingClass.tvResult.text = tempText
                }

                else -> {
                    bindingClass.tvResult.visibility = View.VISIBLE
                    bindingClass.tvResult.text = "Сотрудник отсутствует"
                }

            }
        }
    }

}
