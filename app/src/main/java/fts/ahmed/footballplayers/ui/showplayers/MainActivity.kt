package fts.ahmed.footballplayers.ui.showplayers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fts.ahmed.footballplayers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}