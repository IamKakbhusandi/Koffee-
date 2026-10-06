package com.akshay.koffee.Presentation.Screens.UIcomponents

import android.R.attr.text
import android.R.attr.title
import android.R.id.message
import android.app.ProgressDialog.show
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable

@Composable
fun AppMessageDilaog(
    show : Boolean,
    title : String,
    message : String,
    onDismiss: () ->Unit

){
    if(show){
        AlertDialog(
            onDismiss,
            title = { Text(text = title) },
            text={ Text(text = message)},
            confirmButton = {TextButton(onClick = onDismiss){Text("OK")} },
        )
    }

}
