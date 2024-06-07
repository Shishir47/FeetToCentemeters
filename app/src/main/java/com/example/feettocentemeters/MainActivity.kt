package com.example.feettocentemeters

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Switch
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var inpfc: EditText
    private lateinit var convert: Button
    private lateinit var viewVal: TextView
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private lateinit var cOrF: Switch
    private var toC=30.48
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.inpfc= findViewById(R.id.inpfc)
        this.viewVal= findViewById(R.id.viewVal)
        this.cOrF= findViewById(R.id.cOrF)
        this.convert= findViewById(R.id.button)
        this.convert.text= getString(R.string.convert)
        convert.setOnClickListener{
            if(cOrF.isChecked){
                if(inpfc.text.toString().isEmpty()){
                    viewVal.text= getString(R.string.isEmptyCen)
                }
                else {
                    var result = (inpfc.text.toString().toDouble()/toC)
                    viewVal.text = result.toString()
                }
            }
            else{
                if(inpfc.text.toString().isEmpty()){
                    viewVal.text= getString(R.string.isEmptyFeet)
                }
                else {
                    var result = (inpfc.text.toString().toDouble() * toC)
                    viewVal.text = result.toString()
                }
            }
        }
    }
}