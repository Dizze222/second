package app.barcode_checker.two

import android.content.Context
import android.content.Intent

class Test {

    fun startActivityy(context: Context){
        val intent = Intent(context, SomeActivity::class.java)
        context.startActivity(intent)
    }



}