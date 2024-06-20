package com.nomtek.secretssample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.nomtek.secrets.ClientSecrets
import com.nomtek.secrets.SecretType
import com.nomtek.secretssample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.secretButton.setOnClickListener { view ->
            val secretValue = ClientSecrets.getSecret(SecretType.SAMPLE_SECRET)
            Toast.makeText(view.context, secretValue, Toast.LENGTH_LONG).show()
        }
    }
}
