package com.github.nitrico.lastadapter_sample.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.github.nitrico.lastadapter_sample.R

open class ListFragment : androidx.fragment.app.Fragment() {

    protected lateinit var list: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list = view.findViewById(R.id.list)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        list.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(activity)
    }

}
