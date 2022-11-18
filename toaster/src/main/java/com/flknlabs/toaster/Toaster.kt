package com.flknlabs.toaster

import android.content.Context
import android.util.Log
import android.widget.Toast

class Toaster {
    companion object {
        fun showToast(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }

        /*public -> publico para todos
        protected -> publico para algunos
        private -> no publico mas que para la clase
        internal -> publico pero solo para el modulo
        inner -> parte de una clase*/

        private fun showToastAndLog(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
            Log.d("Toaster", msg)
        }
    }
}