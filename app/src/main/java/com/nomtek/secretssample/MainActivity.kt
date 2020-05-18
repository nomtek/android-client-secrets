package com.nomtek.secretssample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.nomtek.secrets.ClientSecrets
import com.nomtek.secrets.SecretType
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        secretButton.setOnClickListener { view ->
            val secretValue = ClientSecrets.getSecret(SecretType.SAMPLE_SECRET)
            Toast.makeText(view.context, secretValue, Toast.LENGTH_LONG).show()
        }
    }
}
