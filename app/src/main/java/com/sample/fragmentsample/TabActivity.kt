package com.sample.fragmentsample

import android.annotation.SuppressLint
import android.content.res.Resources
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class TabActivity : AppCompatActivity() {
    private lateinit var tabBar: TabLayout
    private lateinit var viewPage: ViewPager2

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_fragment)

        tabBar = findViewById(R.id.tabBar)
        viewPage = findViewById(R.id.viewPager)
        viewPage.adapter = PageAdapter(this)

        TabLayoutMediator(tabBar, viewPage) { tab, index ->


            tab.text = when (index) {
                0 -> {
                    "Cricket"
                }

                1 -> {
                    "Football"
                }

                2 -> {
                    "Kabaddi"
                }

                else -> {
                    throw Resources.NotFoundException("No Position")
                }
            }
        }.attach()


//back to main activity
        val backBtn = findViewById<Button>(R.id.backBtn)

        backBtn.setOnClickListener {
            finish()
        }


    }


}
