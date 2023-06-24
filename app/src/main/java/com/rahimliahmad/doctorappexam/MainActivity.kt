package com.rahimliahmad.doctorappexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rahimliahmad.doctorappexam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var recycler:RecyclerView
    lateinit var adapter: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        recycler=binding.recycler

        recycler.setHasFixedSize(true)
        recycler.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        var  imagelist= mutableListOf(R.drawable.austin_diesel)
        var namelist = mutableListOf("dr. Gilang Segera Beging")
        var speciallist= mutableListOf("Heart")
        var ratelist= mutableListOf(R.drawable.group_3)
        adapter=Adapter(this,imagelist,namelist,speciallist,ratelist)

        recycler.adapter=adapter



    }
}