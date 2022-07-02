package dev.conslate.recycler_view2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.conslate.recycler_view2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fibonacciNumbers()
    }
    fun fibonacciNumbers(){
        val n = 100
        var t1 = 0
        var t2 = 1
        var y = mutableListOf<Int>()

        print("First $n terms: ")

        for (i in 1..100) {
            y.add(t1)
            var sum = t1 + t2
            t1 = t2
            t2 = sum
        }

        var numberAdapter = NumberRecyclerViewAdapter(y)
        binding.rvNumbers.layoutManager= LinearLayoutManager(this)
        binding.rvNumbers.adapter=numberAdapter


    }

}


