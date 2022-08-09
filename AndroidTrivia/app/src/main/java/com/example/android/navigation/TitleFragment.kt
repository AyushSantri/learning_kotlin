package com.example.android.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.android.navigation.databinding.FragmentTitle2Binding

class TitleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentTitle2Binding = DataBindingUtil.inflate(inflater, R.layout.fragment_title2, container, false)

        binding.playButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_titleFragment_to_gameFragment)
        }
        return  binding.root
    }
}