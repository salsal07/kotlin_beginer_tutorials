package com.sample.fragmentsample

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.fragment.app.Fragment

class fragment1 : Fragment(R.layout.fragment1) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val languages = resources.getStringArray(R.array.spinner_state)
        val spinner = view.findViewById<Spinner>(R.id.my_spinner)

        if (spinner != null) {
            val adapter = ArrayAdapter(
                requireContext(),
                android.R.layout.simple_spinner_item, languages
            )
            spinner.adapter = adapter

        }

    }
}