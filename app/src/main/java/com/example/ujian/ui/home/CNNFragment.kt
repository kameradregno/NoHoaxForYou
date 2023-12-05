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

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CNNFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c_n_n, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment CNNFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            CNNFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}