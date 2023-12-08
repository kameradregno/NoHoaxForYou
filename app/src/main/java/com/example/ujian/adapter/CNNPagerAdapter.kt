package com.example.ujian.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.ujian.ui.detail.CNNEntertainmentFragment
import com.example.ujian.ui.detail.CNNEconomyFragment
import com.example.ujian.ui.detail.CNNTechFragment

class CNNPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CNNTechFragment()
            1 -> CNNEntertainmentFragment()
            2 -> CNNEconomyFragment()
            else -> CNNTechFragment()
        }
    }
}