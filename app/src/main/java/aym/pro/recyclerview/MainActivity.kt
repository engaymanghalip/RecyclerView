package aym.pro.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import aym.pro.recyclerview.databinding.ActivityMainBinding
import aym.pro.recyclerview.RecyclerAdapter as RecyclerAdapter

class MainActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter:RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

     override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var binding: ActivityMainBinding

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

//        setContentView(binding.root)

        setContentView(R.layout.activity_main)
        layoutManager = LinearLayoutManager(this)



//       binding.recyclerView1.layoutManager = layoutManager


      var i = findViewById<RecyclerView>(R.id.recyclerView1)

        i.layoutManager = layoutManager

         adapter = RecyclerAdapter()


        i.adapter = adapter


    }
}