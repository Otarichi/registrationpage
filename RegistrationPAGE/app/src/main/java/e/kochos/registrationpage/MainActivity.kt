package e.kochos.registrationpage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSubmit.setOnClickListener {
            if (nameEditText.text.toString().isEmpty() || emailEditText.text.toString().isEmpty()
                    || passwordEditText.text.toString().isEmpty() || reEnterPasswordEditText.text.isEmpty()) {
                Toast.makeText(applicationContext, "გთხოვთ შეიყვანოთ ყველა ველი", Toast.LENGTH_LONG).show()
            } else if(!Patterns.EMAIL_ADDRESS.matcher(emailEditText.text.toString()).matches()) {
                Toast.makeText(applicationContext, "გთხოვთ დარწმუნდეთ\nელ-ფოსტის სისწორეში", Toast.LENGTH_LONG).show()
            } else if(!passwordEditText.text.toString().equals(reEnterPasswordEditText.text.toString())) {
                Toast.makeText(this, "პაროლები არ ემთხვევა", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "რეგისტრაცია დასრულდა წარმატებით", Toast.LENGTH_LONG).show()
            }
        }
    }
}