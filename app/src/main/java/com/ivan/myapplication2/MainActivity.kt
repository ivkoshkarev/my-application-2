package com.ivan.myapplication2


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


private const val MY_OWN_LOG_TAG = "MyOwnLog"

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(MY_OWN_LOG_TAG, " \n Ты видел деву на скале \n В одежде белой над волнами")

    }

    override fun onStart() {
        super.onStart()
        Log.d(MY_OWN_LOG_TAG, " \n Когда, бушуя в бурной мгле, \n Играло море с берегами,")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MY_OWN_LOG_TAG, " \n Когда луч молний озарял \n Ее всечасно блеском алым")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MY_OWN_LOG_TAG, " \n И ветер бился и летал \n С ее летучим покрывалом?")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MY_OWN_LOG_TAG, " \n Прекрасно море в бурной мгле \n И небо в блесках без лазури;")
    }

    /*  override fun onRestart() {
          super.onRestart()
          Log.d(MY_OWN_LOG_TAG, "onRestart")
      } */

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MY_OWN_LOG_TAG, " \n Но верь мне: дева на скале \n Прекрасней волн, небес и бури.")
    }

}

