package app.barcode_checker.two

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.barcode_checker.two.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            Test().startActivityy(this)
        }

    }
}