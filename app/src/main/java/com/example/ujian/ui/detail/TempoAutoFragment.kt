package com.example.ujian.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ujian.R
import com.example.ujian.adapter.NewsAdapter
import com.example.ujian.data.repository.NewsRepository
import com.example.ujian.databinding.FragmentTempoAutoBinding
import com.example.ujian.ui.NewsViewModel
import com.example.ujian.utils.NewsViewModelFactory

class TempoAutoFragment : Fragment() {

    lateinit var binding: FragmentTempoAutoBinding
    private val tempoViewModel: NewsViewModel by viewModels {
        NewsViewModelFactory(NewsRepository())
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTempoAutoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mAdapter = NewsAdapter()
        tempoViewModel.getTempoAutoNews()

        tempoViewModel.tempoAutoNews.observe(viewLifecycleOwner) { dataNews ->
            dataNews?.data?.let { mAdapter.setData(it.posts) }
        }

        binding.rvTempoAuto.apply {
            adapter = mAdapter
            layoutManager = LinearLayoutManager(requireContext())
        }

        tempoViewModel.isLoading.observe(viewLifecycleOwner){
            showLoading(it)
        }
    }

    private fun showLoading(isLoading: Boolean) {
        if (isLoading) {
            binding.loadingView.root.visibility = View.VISIBLE
        } else {
            binding.loadingView.root.visibility = View.GONE
        }
    }


}