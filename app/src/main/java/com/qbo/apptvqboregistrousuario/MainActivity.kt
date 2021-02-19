package com.qbo.apptvqboregistrousuario

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.qbo.apptvqboregistrousuario.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private val lstParticipantes = ArrayList<String>();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val vista = binding.root
        setContentView(vista)
        binding.btnregistrar.setOnClickListener {
            if(binding.etparticipante.text.toString().isNotEmpty()){
                lstParticipantes.add(binding.etparticipante.text.toString())
                val adapter = ArrayAdapter(
                    this,
                    R.layout.simple_list_item_1,
                    lstParticipantes
                )
                binding.lvparticipante.adapter = adapter
                binding.etparticipante.setText("")
            }else{
                binding.etparticipante.error = "Campo obligatorio"
            }
        }
    }
}