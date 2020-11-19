package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var playerOne: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        newGameButton.setOnClickListener{
            newGame()
        }
        Button00.setOnClickListener {
            playerChecker(Button00)
        }

        Button01.setOnClickListener {
            playerChecker(Button01)
        }

        Button02.setOnClickListener {
            playerChecker(Button02)
        }

        Button10.setOnClickListener {
            playerChecker(Button10)
        }
        Button11.setOnClickListener {
            playerChecker(Button11)

        }
        Button12.setOnClickListener {
            playerChecker(Button12)

        }
        Button20.setOnClickListener {
            playerChecker(Button20)

        }
        Button21.setOnClickListener {
            playerChecker(Button21)

        }
        Button22.setOnClickListener {
            playerChecker(Button22)

        }

    }

    private fun playerChecker(button: Button) {

        Button00.setOnClickListener {
            d("onClick", "Button00")
            if (playerOne) {
                Button00.text = "X"
            } else {
                Button00.text = "0"
            }
            Button00.isClickable = false
            playerOne = !playerOne
            checkWinner()
        }
    }

    private fun checkWinner() {
        if (Button00.text.toString().isNotEmpty() && Button00.text.toString() == Button01.text.toString() && Button00.text.toString() == Button02.text.toString()) {
            showToast(Button00.text.toString())
        } else if (Button10.text.toString().isNotEmpty() && Button10.text.toString() == Button11.text.toString() && Button10.text.toString() == Button12.text.toString())
           {showToast(Button10.text.toString())
        } else if (Button20.text.toString().isNotEmpty() && Button20.text.toString() == Button21.text.toString() && Button20.text.toString() == Button22.text.toString())
        {showToast(Button20.text.toString())
        } else if (Button00.text.toString().isNotEmpty() && Button00.text.toString() == Button10.text.toString() && Button00.text.toString() == Button20.text.toString()){
            showToast(Button00.text.toString())
        } else if (Button01.text.toString().isNotEmpty() && Button01.text.toString() == Button11.text.toString() && Button01.text.toString() == Button21.text.toString()){
            showToast(Button01.text.toString())
        } else if (Button02.text.toString().isNotEmpty() && Button02.text.toString() == Button12.text.toString() && Button02.text.toString() == Button22.text.toString()){
            showToast(Button02.text.toString())
        } else if (Button00.text.toString().isNotEmpty() && Button00.text.toString() == Button11.text.toString() && Button00.text.toString() == Button22.text.toString()){
            showToast(Button00.text.toString())
        } else if (Button02.text.toString().isNotEmpty() && Button02.text.toString() == Button11.text.toString() && Button02.text.toString() == Button20.text.toString()){
            showToast(Button02.text.toString())
        } else if (Button00.text.toString().isNotEmpty() && Button01.text.toString().isNotEmpty() && Button02.text.toString().isNotEmpty() && Button10.text.toString().isNotEmpty()
                && Button11.text.toString().isNotEmpty() && Button12.text.toString().isNotEmpty() && Button20.text.toString().isNotEmpty() && Button21.text.toString().isNotEmpty()
                && Button22.text.toString().isNotEmpty()){
            Toast.makeText(this, "The game is a Draw", Toast.LENGTH_SHORT).show()
        }


    }

    private fun showToast(winnerSymbol:String){
        Toast.makeText(this, "Winner is $winnerSymbol", Toast.LENGTH_SHORT).show()
        Button00.isClickable = false
        Button01.isClickable = false
        Button02.isClickable = false
        Button10.isClickable = false
        Button11.isClickable = false
        Button12.isClickable = false
        Button20.isClickable = false
        Button21.isClickable = false
        Button22.isClickable = false

    }
    private fun newGame(){
        Button00.text = ""
        Button01.text = ""
        Button02.text = ""
        Button10.text = ""
        Button11.text = ""
        Button12.text = ""
        Button20.text = ""
        Button21.text = ""
        Button22.text = ""
        Button00.isClickable = true
        Button01.isClickable = true
        Button02.isClickable = true
        Button10.isClickable = true
        Button11.isClickable = true
        Button12.isClickable = true
        Button20.isClickable = true
        Button21.isClickable = true
        Button22.isClickable = true
        playerOne = !playerOne

    }
}
