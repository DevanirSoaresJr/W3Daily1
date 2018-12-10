package com.example.deva_.w3daily1

import android.graphics.Picture
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class Frag2: Fragment(){

    private lateinit var firstName: String
    private lateinit var lastName: String
    private lateinit var weight: Int
    private val age: Int = 1
    private lateinit var picture: Picture


    companion object {
        fun newInstance(nameFirst: String, nameLast: String, weight: Int, age: Int, picture: Picture): Frag2{
            val frag2= Frag2()
            val args = Bundle()
            args.putString("firstName", nameFirst)
            args.putString("lastName", nameLast)
            frag2.arguments = args
            return frag2
        }
    }

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        arguments?.let{
            firstName  = it.getString("firstName")
            lastName = it.getString("lastName")
            weight = it.getInt("weight")
            age = it.getInt("age")

        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.frag2, container, false)
    }


}

