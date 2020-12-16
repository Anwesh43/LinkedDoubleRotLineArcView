package com.example.doublerotlinearcview

import android.view.View
import android.view.MotionEvent
import android.app.Activity
import android.content.Context
import android.graphics.Paint
import android.graphics.Canvas
import android.graphics.Color

val parts : Int = 4
val scGap : Float = 0.02f / parts
val strokeFactor : Float = 90f
val sizeFactor : Float = 4.9f
val delay : Long = 20
val backColor : Int = Color.parseColor("#BDBDBD")
val colors : Array<Int> = arrayOf(
    "#F44336",
    "#3F51B5",
    "#795548",
    "#FFC107",
    "#009688"
).map {
    Color.parseColor(it)
}.toTypedArray()
val deg : Float = 90f
val arcDeg : Float = 45f
