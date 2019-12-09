package com.example.myapplication

import android.content.Context
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import kotlinx.android.synthetic.main.fragment_both.*
import kotlinx.android.synthetic.main.popup_layout_word_detail_word_add.*
import kotlinx.android.synthetic.main.popup_layout_word_detail_word_add.view.*
import java.nio.channels.GatheringByteChannel
import java.util.zip.Inflater

class Fragment_both_Other : Fragment() {

    var wordListFB = ArrayList<Word>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val layout = inflater.inflate(R.layout.fragment_both_other, container, false)

        wordListFB = arguments!!.get("word") as ArrayList<Word>


        var adapter = CustomViewAdapter(wordListFB,5 )


        var listview = layout.findViewById(R.id.listview_word_both) as ListView

        listview.setAdapter(adapter)

        return layout

    }



}