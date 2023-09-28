package com.utils.dialogs
import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater

class DialogUtil {

    interface OnClickListenerInterface {
        fun onClick()
    }

    fun ShowMessage(context: Context, title: String, message: String) {
        val builder = AlertDialog.Builder(context)
        // Set the alert dialog title
        builder.setTitle(title)
        // Display a message on alert dialog
        builder.setMessage(message)

        // Display a negative button on alert dialog
        builder.setNegativeButton("Ok") { dialog, which ->
            dialog.dismiss()
        }

        // Finally, make the alert dialog using builder
        val dialog: AlertDialog = builder.create()

        // Display the alert dialog on app interface
        dialog.show()
    }

    fun ShowMessage(context: Context, title: String, message: String, listner: OnClickListenerInterface) {
        val builder = AlertDialog.Builder(context)

        // Set the alert dialog title
        builder.setTitle(title)
        // Display a message on alert dialog
        builder.setMessage(message)



        // Display a negative button on alert dialog
        builder.setNegativeButton("Ok") { dialog, which ->
            listner.onClick()
            dialog.dismiss()
        }


        // Finally, make the alert dialog using builder
        val dialog: AlertDialog = builder.create()

        // Display the alert dialog on app interface
        dialog.show()
    }

//    class ProgressDialog {
//        companion object {
//            fun progressDialog(context: Context): Dialog {
//                val dialog = Dialog(context)
//                val inflate = LayoutInflater.from(context).inflate(R.layout.progress_dialog, null)
//                dialog.setContentView(inflate)
//                dialog.setCancelable(false)
//                dialog.window!!.setBackgroundDrawable(
//                    ColorDrawable(Color.TRANSPARENT)
//                )
//                return dialog
//            }
//        }
//    }

}