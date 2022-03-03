package com.e.datecalculation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PAtternDesignActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pattern_design)

//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//        1 2 3 4 5 6
//        1 2 3 4 5 6 7

        for(i in 1..7){

            for(j in 1..i){
                print("$j ")
            }
            println()
        }

//        1 2 3 4 5 6 7
//        1 2 3 4 5 6
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1

        for (i in 7 - 1 downTo 1) {
            for (j in 1..i) {
                print("$j ")
            }
            println()
        }

//        1
//        2 2
//        3 3 3
//        4 4 4 4
//        5 5 5 5 5
//        6 6 6 6 6 6
//        7 7 7 7 7 7 7

        for(i in 1..7){

            for(j in 1..i){
                print("$i ")
            }
            println()
        }

//        7 6 5 4 3 2 1
//        7 6 5 4 3 2
//        7 6 5 4 3
//        7 6 5 4
//        7 6 5
//        7 6
//        7
        for (i in 1..7) {
            for (j in 7 downTo i) {
                print("$j ")
            }
            println()
        }


//        1 2 3 4 5 6 7
//        1 2 3 4 5 6
//        1 2 3 4 5
//        1 2 3 4
//        1 2 3
//        1 2
//        1
        for (i in 1..7) {
            for (j in 1..i) {
                print("$j ")
            }
            println()
        }

    }
}
