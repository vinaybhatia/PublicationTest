package com.mytoolbox

import android.content.Context
import android.widget.Toast

class DemoActivity {
    fun setData(context: Context?, msg: String?) {
        Toast.makeText(context, "Hello run", Toast.LENGTH_SHORT).show()
    }
}