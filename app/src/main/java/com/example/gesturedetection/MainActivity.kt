package com.example.gesturedetection

import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    private lateinit var touchInfo: TextView
    private lateinit var gestureDetector: GestureDetector
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gestureDetector = GestureDetector(this, this)
        gestureDetector.setOnDoubleTapListener(this)
        val touchView = findViewById<View>(R.id.touch_view)
        touchView.setOnTouchListener {_, event ->
            gestureDetector.onTouchEvent(event)
            true
        }
    }

    override fun onDown(e: MotionEvent): Boolean {
        println("onDown")
        return true
    }

    override fun onShowPress(e: MotionEvent) {
        println("onShowPressed")
    }

    override fun onSingleTapUp(e: MotionEvent): Boolean {
        println("onSingleTapUp")
        return true
    }

    override fun onScroll(
        e1: MotionEvent?,
        e2: MotionEvent,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        println("onScroll")
        return true
    }

    override fun onLongPress(e: MotionEvent) {
        println("onLongPressed")
    }


    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        println("onFling")
        return true
    }

    override fun onSingleTapConfirmed(e: MotionEvent): Boolean {
        println("onSingleTap")
        return true
    }

    override fun onDoubleTap(e: MotionEvent): Boolean {
        println("onDoubleTap")
        return true
    }

    override fun onDoubleTapEvent(e: MotionEvent): Boolean {
        println("onDoubleTapEvent")
        return true
    }
}