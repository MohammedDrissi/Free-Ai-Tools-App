package com.example.aitoolsapp

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val button1:Button=findViewById(R.id.microsoft_copilot_button)
        button1.setOnClickListener {
            val url ="https://copilot.microsoft.com/?via=topaitools"
            val intent= Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val button2:Button=findViewById(R.id.chat_gbt_button)
        button2.setOnClickListener {
            val url ="https://chatgpt.com/?via=topaitools"
            val intent= Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val button3:Button=findViewById(R.id.remini_button)
        button3.setOnClickListener {
            val url ="https://gemini.google.com/app?via=topaitools"
            val intent= Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val button4:Button=findViewById(R.id.remove_button)
        button4.setOnClickListener {
            val url ="https://www.remove.bg/?utm_campaign=refer_a_friend&utm_medium=referral&utm_source=dashboard_referral"
            val intent= Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val button11:Button=findViewById(R.id.canva_button)
        button11.setOnClickListener {
            val url ="https://www.canva.com/ai-image-generator/?via=topaitools"
            val intent= Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val button5:Button=findViewById(R.id.perplexity_button)
        button3.setOnClickListener {
            val url ="https://www.perplexity.ai/?via=topaitools"
            val intent= Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val button6:Button=findViewById(R.id.course_button)
        button6.setOnClickListener {
            val url ="https://www.coursehero.com/?via=topaitools"
            val intent= Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val button7:Button=findViewById(R.id.dall_button)
        button7.setOnClickListener {
            val url ="https://openai.com/index/dall-e-3/?via=topaitools"
            val intent= Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
        val button8:Button=findViewById(R.id.civitai_button)
        button8.setOnClickListener {
            val url ="https://civitai.com/?via=topaitools"
            val intent= Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        }
    }
