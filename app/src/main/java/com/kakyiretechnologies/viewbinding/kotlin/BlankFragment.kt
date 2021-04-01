package com.kakyiretechnologies.viewbinding.kotlin

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.kakyiretechnologies.viewbinding.R
import com.kakyiretechnologies.viewbinding.databinding.FragmentBlankBinding

class BlankFragment : Fragment(R.layout.fragment_blank) {

    private lateinit var binding: FragmentBlankBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBlankBinding.bind(view)
    }
}