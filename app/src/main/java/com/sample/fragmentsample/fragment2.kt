package com.sample.fragmentsample

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.Switch
import android.widget.Toast
import android.widget.ToggleButton
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment

class fragment2 : Fragment(R.layout.fragement2) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val switch = view.findViewById<Switch>(R.id.switch1)
        val toggle = view.findViewById<ToggleButton>(R.id.toggleBtn)
        val progress = view.findViewById<ProgressBar>(R.id.loading)
        switch?.setOnCheckedChangeListener { _, isChecked ->
            progress.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE;

            val message = if (isChecked) "Notification:ON" else "Notification:OFF"
            Toast.makeText(
                view.context, message, Toast.LENGTH_SHORT
            ).show()


            toggle?.setOnCheckedChangeListener { _, isChecked ->


                val message = if (isChecked) "Fan ON" else "Fan OFF"
                Toast.makeText(
                    view.context, message, Toast.LENGTH_SHORT
                ).show()

            }
        }

    }
}