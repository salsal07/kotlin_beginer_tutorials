package com.sample.fragmentsample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KabaddiFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kabaddi, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recycleViewGrid = view.findViewById<RecyclerView>(R.id.recycleGrid)
        val datas = arrayListOf<String>()
        for (i in 0..30) {
            datas.add("item $i")
        }

        val adapter = ItemAdapter(requireContext(), datas)

        recycleViewGrid.layoutManager = GridLayoutManager(
            requireContext(), 3
        )
        recycleViewGrid.adapter = adapter
    }

}