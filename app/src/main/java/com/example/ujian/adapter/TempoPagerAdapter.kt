package com.example.ujian.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.ujian.ui.detail.TempoAutoFragment
import com.example.ujian.ui.detail.TempoMetroFragment
import com.example.ujian.ui.detail.TempoTechFragment
import com.example.ujian.ui.home.TempoFragment

class TempoPagerAdapter(fa: TempoFragment) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> TempoTechFragment()
            1 -> TempoAutoFragment()
            2 -> TempoMetroFragment()
            else -> TempoTechFragment()
        }
    }

}