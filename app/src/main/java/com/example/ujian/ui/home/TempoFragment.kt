package com.example.ujian.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ujian.R
import com.example.ujian.adapter.MerdekaPagerAdapter
import com.example.ujian.adapter.TempoPagerAdapter
import com.example.ujian.databinding.FragmentTempoBinding
import com.google.android.material.tabs.TabLayoutMediator

class TempoFragment : Fragment() {

    private lateinit var binding: FragmentTempoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupViewPager()
    }

    private fun setupViewPager() {
        binding.vpTempo.adapter = TempoPagerAdapter(this)
        val tabList = arrayOf(
            "Teknologi",
            "Otomotif",
            "Sejarah",
        )
        TabLayoutMediator(binding.tabTempo, binding.vpTempo) {tab, page ->
            tab.text = tabList[page]
        }.attach()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTempoBinding.inflate(inflater, container, false)
        return binding.vpTempo
    }
}