package com.example.ujian.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ujian.R
import com.example.ujian.adapter.MerdekaPagerAdapter
import com.example.ujian.databinding.FragmentMerdekaBinding
import com.google.android.material.tabs.TabLayoutMediator

class MerdekaFragment : Fragment() {

    private lateinit var binding: FragmentMerdekaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupViewPager()
    }

    private fun setupViewPager() {
        binding.vpMerdeka.adapter = MerdekaPagerAdapter(this)
        val tabList = arrayOf(
            "Teknologi",
            "Otomotif",
            "Sejarah",
        )
        TabLayoutMediator(binding.tabMerdeka, binding.vpMerdeka) {tab, page ->
            tab.text = tabList[page]
        }.attach()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMerdekaBinding.inflate(inflater, container, false)
        return binding.root
    }
}