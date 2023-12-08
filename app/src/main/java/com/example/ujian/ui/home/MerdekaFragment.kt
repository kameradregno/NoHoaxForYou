package com.example.ujian.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ujian.adapter.MainPagerAdapter
import com.example.ujian.adapter.MerdekaPagerAdapter
import com.example.ujian.databinding.FragmentMerdekaBinding
import com.google.android.material.tabs.TabLayoutMediator

class MerdekaFragment : Fragment() {

    private lateinit var binding: FragmentMerdekaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMerdekaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViewPager()
    }

    private fun setupViewPager() {
        binding.vpMerdeka.adapter = MerdekaPagerAdapter(this)
        val tabList = arrayOf(
            "Teknologi",
            "Otomotif",
            "Dunia"
        )

        val adapter = MerdekaPagerAdapter(this)
        binding.vpMerdeka.adapter = adapter

        TabLayoutMediator(binding.tabMerdeka, binding.vpMerdeka) { tab, position ->
            when (position) {
                0 -> tab.text = "Teknologi"
                1 -> tab.text = "Otomotif"
                2 -> tab.text = "Dunia"
            }
        }.attach()
    }
}