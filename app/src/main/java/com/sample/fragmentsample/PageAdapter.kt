package com.sample.fragmentsample

import android.content.res.Resources.NotFoundException
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PageAdapter(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount()=3

    override fun createFragment(position: Int): Fragment {
        return  when(position){
            0->{CricketFragment()}
            1->{FootBallFragment()}
            2->{KabaddiFragment()}
            else ->{throw NotFoundException("Position not found")}
        }
    }
}