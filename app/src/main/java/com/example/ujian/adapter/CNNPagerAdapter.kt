package com.example.ujian.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.ujian.ui.detail.CNNEntertainmentFragment
import com.example.ujian.ui.detail.CNNHistoryFragment
import com.example.ujian.ui.detail.CNNTechFragment
import com.example.ujian.ui.detail.MerdekaAutoFragment
import com.example.ujian.ui.detail.MerdekaHistoryFragment
import com.example.ujian.ui.detail.MerdekaTechFragment
import com.example.ujian.ui.home.CNNFragment
import com.example.ujian.ui.home.MerdekaFragment

class CNNPagerAdapter(fa: CNNFragment) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CNNTechFragment()
            1 -> CNNEntertainmentFragment()
            2 -> CNNHistoryFragment()
            else -> CNNTechFragment()
        }
    }

}