package com.example.ujian.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ujian.R
import com.example.ujian.databinding.FragmentMerdekaTechBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MerdekaTechFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MerdekaTechFragment : Fragment() {

    lateinit var binding: FragmentMerdekaTechBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMerdekaTechBinding.inflate(inflater, container, false)
        return binding.root
    }


}