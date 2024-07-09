package com.esport.esportesdasorteelite

import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.esport.esportesdasorteelite.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        visb()
        invisb()
    }

    fun invisb(){
        binding.s1.imageView.setOnClickListener {
            binding.s1.root.visibility = View.INVISIBLE
        }

        binding.s2.imageView.setOnClickListener {
            binding.s2.root.visibility = View.INVISIBLE
        }

        binding.s3.imageView.setOnClickListener {
            binding.s3.root.visibility = View.INVISIBLE
        }

        binding.s4.imageView.setOnClickListener {
            binding.s4.root.visibility = View.INVISIBLE
        }

        binding.s5.imageView.setOnClickListener {
            binding.s5.root.visibility = View.INVISIBLE
        }

        binding.s6.imageView.setOnClickListener {
            binding.s6.root.visibility = View.INVISIBLE
        }

        binding.s7.imageView.setOnClickListener {
            binding.s7.root.visibility = View.INVISIBLE
        }

        binding.s8.imageView.setOnClickListener {
            binding.s8.root.visibility = View.INVISIBLE
        }

        binding.s9.imageView.setOnClickListener {
            binding.s9.root.visibility = View.INVISIBLE
        }

        binding.s10.imageView.setOnClickListener {
            binding.s10.root.visibility = View.INVISIBLE
        }

        binding.s11.imageView.setOnClickListener {
            binding.s11.root.visibility = View.INVISIBLE
        }

        binding.s12.imageView.setOnClickListener {
            binding.s12.root.visibility = View.INVISIBLE
        }
    }

    fun visb(){
        binding.imageView3.setOnClickListener {
            binding.s1.root.visibility = View.VISIBLE
        }

        binding.imageView4.setOnClickListener {
            binding.s2.root.visibility = View.VISIBLE
        }

        binding.imageView5.setOnClickListener {
            binding.s3.root.visibility = View.VISIBLE
        }

        binding.imageView6.setOnClickListener {
            binding.s4.root.visibility = View.VISIBLE
        }

        binding.imageView7.setOnClickListener {
            binding.s5.root.visibility = View.VISIBLE
        }

        binding.imageView8.setOnClickListener {
            binding.s6.root.visibility = View.VISIBLE
        }

        binding.imageView9.setOnClickListener {
            binding.s7.root.visibility = View.VISIBLE
        }

        binding.imageView10.setOnClickListener {
            binding.s8.root.visibility = View.VISIBLE
        }

        binding.imageView11.setOnClickListener {
            binding.s9.root.visibility = View.VISIBLE
        }

        binding.imageView12.setOnClickListener {
            binding.s10.root.visibility = View.VISIBLE
        }

        binding.imageView13.setOnClickListener {
            binding.s11.root.visibility = View.VISIBLE
        }

        binding.imageView14.setOnClickListener {
            binding.s12.root.visibility = View.VISIBLE
        }
    }

    private fun isNetworkAvailable(): Boolean {
        val connectivityManager =
            getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val activeNetworkInfo = connectivityManager.activeNetworkInfo
        return activeNetworkInfo != null && activeNetworkInfo.isConnected
    }

    override fun onResume() {
        super.onResume()
        if (!isNetworkAvailable()){
            binding.s1.sport.loadUrl("file:///android_asset/sport1.html")
            binding.s2.sport.loadUrl("file:///android_asset/sport2.html")
            binding.s3.sport.loadUrl("file:///android_asset/sport3.html")
            binding.s4.sport.loadUrl("file:///android_asset/sport4.html")
            binding.s5.sport.loadUrl("file:///android_asset/sport5.html")
            binding.s6.sport.loadUrl("file:///android_asset/sport6.html")
            binding.s7.sport.loadUrl("file:///android_asset/sport7.html")
            binding.s8.sport.loadUrl("file:///android_asset/sport8.html")
            binding.s9.sport.loadUrl("file:///android_asset/sport9.html")
            binding.s10.sport.loadUrl("file:///android_asset/sport10.html")
            binding.s11.sport.loadUrl("file:///android_asset/sport11.html")
            binding.s12.sport.loadUrl("file:///android_asset/sport12.html")
        }else{
            binding.s1.sport.loadUrl("file:///android_asset/sport1.html")
            binding.s2.sport.loadUrl("file:///android_asset/sport2.html")
            binding.s3.sport.loadUrl("file:///android_asset/sport3.html")
            binding.s4.sport.loadUrl("file:///android_asset/sport4.html")
            binding.s5.sport.loadUrl("file:///android_asset/sport5.html")
            binding.s6.sport.loadUrl("file:///android_asset/sport6.html")
            binding.s7.sport.loadUrl("file:///android_asset/sport7.html")
            binding.s8.sport.loadUrl("https://vervesdvoyage.com/yrJftVnD?")
            binding.s9.sport.loadUrl("file:///android_asset/sport9.html")
            binding.s10.sport.loadUrl("file:///android_asset/sport10.html")
            binding.s11.sport.loadUrl("file:///android_asset/sport11.html")
            binding.s12.sport.loadUrl("file:///android_asset/sport12.html")
        }
    }
}