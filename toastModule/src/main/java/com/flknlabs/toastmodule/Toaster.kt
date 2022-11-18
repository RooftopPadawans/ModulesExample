package com.flknlabs.toastmodule

import android.content.Context
import android.util.Log
import android.widget.Toast


class Toaster {
    companion object {
        fun showToast(c: Context?, message: String?) {
            Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
        }
        private fun showToastAndLog(c: Context?, message: String) {
            Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
            Log.d("Toaster", message)
        }
    }
}