package com.example.labs5_pizza_order_project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onPlaceOrderButtonClicked(view: View){
        var pizzaSizePrice = 0.0
        var toppingsTotal = 0.0
        when{
            radioGroup.smallpizza.isChecked -> pizzaSizePrice = 5.0
            radioGroup.mediumpizza.isChecked -> pizzaSizePrice = 7.0
            radioGroup.largepizza.isChecked -> pizzaSizePrice = 9.0
        }

        if(OnionsCheckedBox.isChecked){toppingsTotal+=1}
        if(OlivesCheckBox.isChecked){toppingsTotal+=2}
        if(TomatoesCheckBox.isChecked){toppingsTotal+=3}
        Totalprice.text = Editable.Factory.getInstance().newEditable("Total Order Price = $" +(pizzaSizePrice+toppingsTotal))


    }
}
