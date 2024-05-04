package za.ac.iie.st10449796.tamagotchiapp

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(
            findViewById(R.id.main)
            val systemBars = insets . getInsets (WindowInsetsCompat.Type.systemBars())
        v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
        insets

        GameActivity:
        class GameActivity : AppCompatActivity() {

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_game)
        val petImageView = findViewById<ImageView>(R.id.petImageView)
        val feedButton = findViewById<Button>(R.id.feedButton)
        val cleanButton = findViewById<Button>(R.id.cleanButton)
        val playButton = findViewById<Button>(R.id.playButton)

        val feedTextView = findViewById<TextView>(R.id.feedTextView)
        val cleanTextView = findViewById<TextView>(R.id.cleanTextView)
        val playTextView = findViewById<TextView>(R.id.playTextView)
               // Retrieve the message passed from the first screen
        val feedMessage = intent.getStringExtra("FEED_MESSAGE")
                // Set the text of the feed TextView to the feed message
                feedTextView.text = feedMessage

        feedButton.setOnClickListener {
            petImageView.setImageResource(R.drawable.eating.webp)
            feedTextView.text = getString(R.string.feed_thank_you)
            playTextView.text = getString(R.string.Please play with me!)
        }
        cleanButton.setOnClickListener {
            petImageView.setImageResource(R.drawable.bathing.jpg)
            cleanTextView.text = getString(R.string.All this playing made me dirty. Please wash me?)
        }
        playButton.setOnClickListener {
            petImageView.setImageResource(R.drawable.playing.jpg)
            playTextView.text = getString(R.string.play_that_was_fun)
            cleanTextView.text = getString(R.string.clean_after_playing)
    }
}
        <resource>
        <string name="feed_button_text">Feed</string>
        <string name="feed_message">Thank you, I have eaten enough!</string>
        <string name="play_button_text">Play</string>
        <string name="play_message">Please play with me!</string>
        <string name="clean_button_text">Clean</string>
        <string name="clean_message">All this playing made me dirty. Please wash me?</string>

        <!-- Cleaned Message -->
        <string name="cleaned_message">Nice and clean, I am going to take a nap now. See you later!</string>
        </resources>