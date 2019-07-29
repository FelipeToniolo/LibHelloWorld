package com.toniolocode.mylib

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout

class ButtonTest : LinearLayout {

    constructor(context: Context) : super(context) {
        initialize(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initialize(context)
    }

    private fun initialize(context: Context) {
        View.inflate(context, R.layout.layout, this)
    }
}
