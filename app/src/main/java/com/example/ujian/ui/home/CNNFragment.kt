package com.example.ujian.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ujian.R
import com.example.ujian.adapter.CNNPagerAdapter
import com.example.ujian.databinding.FragmentCNNBinding
import com.google.android.material.tabs.TabLayoutMediator

class CNNFragment : Fragment() {

    private lateinit var binding: FragmentCNNBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupViewPager()
    }

    private fun setupViewPager() {
        binding.vpCnn.adapter = CNNPagerAdapter(this)
        val tabList = arrayOf(
            "Teknologi",
            "Hiburan",
            "Sejarah",
        )
        TabLayoutMediator(binding.tabCnn, binding.vpCnn) {tab, page ->
            tab.text = tabList[page]
        }.attach()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCNNBinding.inflate(inflater, container, false)
        return binding.root
    }
}