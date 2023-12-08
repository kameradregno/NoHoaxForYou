package com.example.ujian.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.ujian.MainActivity
import com.example.ujian.ui.home.CNNFragment
import com.example.ujian.ui.home.MerdekaFragment
import com.example.ujian.ui.home.TempoFragment

class MainPagerAdapter(fa: MainActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> MerdekaFragment()
            1 -> TempoFragment()
            2 -> CNNFragment()
            else -> MerdekaFragment()
        }
    }

}