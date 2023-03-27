package app.barcode_checker.two

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_some)
        Toast.makeText(this,this.javaClass.simpleName,Toast.LENGTH_SHORT).show()
    }
}