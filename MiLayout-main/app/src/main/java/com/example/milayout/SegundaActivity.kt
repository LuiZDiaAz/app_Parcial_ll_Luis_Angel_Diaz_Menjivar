package com.example.milayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class SegundaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

    }


    fun seleccionarAnimal(Vista: View){
        when(Vista.id){
            R.id.ibtn_Ave -> Toast.makeText(this,"Has selecionado: Ave, Especie: M. bonariensis, Color: Marron, Sexo: Macho, Peso: 50g",Toast.LENGTH_LONG).show()
            R.id.ibtn_Conejo -> Toast.makeText(this,"Has selecionado: Conejo, Especie: O. cuniculus, Color: Gris, Sexo: Hembra, Peso: 2.5kg",Toast.LENGTH_LONG).show()
            R.id.ibtn_Gato -> Toast.makeText(this,"Has selecionado: Gato, Especie: F. silvestris, Color: Marfil claro, Sexo: Hembra, Peso: 4.5kg",Toast.LENGTH_LONG).show()
            R.id.ibtn_Perro -> Toast.makeText(this,"Has selecionado: Perro, Especie: Canis familiaris, Color: Cafe, Sexo: Macho, Peso: 26kg",Toast.LENGTH_LONG).show()
            R.id.ibtn_Serpiente -> Toast.makeText(this,"Has selecionado: Serpiente, Especie: saurópsidos, Color: Gris, Sexo: Macho, Peso: 4kg",Toast.LENGTH_LONG).show()

        }
    }
}