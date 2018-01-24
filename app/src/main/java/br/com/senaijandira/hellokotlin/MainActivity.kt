package br.com.senaijandira.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    var qtd_cliques: Int = 0
    //var qtd_cliques: = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*btn_clique.setOnClickListener {

            qtd_cliques ++

            txt_qtd_cliques.text = "O botão foi clicado $qtd_cliques vezes"
        }*/

        verticalLayout {
            padding = dip( 16)

            val txt_cliques = textView( "O botão ainda não foi clicado, HAHAHA!!!")

            button( "Clique"){
                setOnClickListener {

                    qtd_cliques ++

                    txt_cliques.text = "O botão foi clicado $qtd_cliques vezes."
                }
            }
        }

    }


}
