package com.example.retrofitusingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.liveData
import com.example.retrofitusingkotlin.databinding.ActivityMainBinding
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val instace=retrofitinstance.retrofit().create(albumservice::class.java)

        val responselivdata: LiveData<Response<pojoclass>> = liveData {
//            val response1=instace.getalbum()
            //for query parameter
            val response=instace.getsortalbum(6)
//            emit(response1)
            emit(response)
        }

responselivdata.observe(this, Observer {
    val albumlist=it.body()?.listIterator()
    if(albumlist!=null){
        while (albumlist.hasNext()){
            val albumitem=albumlist.next()
            Log.i("tagy",albumitem.title)
                val result ="album title ${albumitem.title}\n"
            binding.text.append(result)
        }
    }

})

    }
}