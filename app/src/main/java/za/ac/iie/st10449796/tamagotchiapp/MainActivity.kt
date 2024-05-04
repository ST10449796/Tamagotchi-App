package za.ac.iie.st10449796.tamagotchiapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button to navigate to the second screen
        val startButton=findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener {
            val intent =Intent(this,GameActivity::class.java)
            // Pass the message " Iam hungry " as an extra with the intent
            intent.putExtra("FEED_MESSAGE", "I am hungry")
            startActivity(intent)
        }
    }
}