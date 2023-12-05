package com.example.ujian.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.ujian.ui.detail.MerdekaAutoFragment
import com.example.ujian.ui.detail.MerdekaHistoryFragment
import com.example.ujian.ui.detail.MerdekaTechFragment
import com.example.ujian.ui.home.MerdekaFragment

class MerdekaPagerAdapter(fa: MerdekaFragment) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> MerdekaTechFragment()
            1 -> MerdekaAutoFragment()
            2 -> MerdekaHistoryFragment()
            else -> MerdekaTechFragment()
        }
    }

}