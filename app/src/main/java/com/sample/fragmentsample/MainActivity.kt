package com.sample.fragmentsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.sample.fragmentsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnFrag1.setOnClickListener { replaceFragment(fragment1()) }
        binding.btnFrag2.setOnClickListener { replaceFragment(fragment2()) }

        val nextActivity = findViewById<Button>(R.id.nextActivity)

        nextActivity.setOnClickListener {
            intent = Intent(this, TabActivity::class.java)
            startActivity(intent)
        }
    }




    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }


}