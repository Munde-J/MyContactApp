package dev.jojo.mycontacts.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.squareup.picasso.Picasso
import dev.jojo.mycontacts.R
import dev.jojo.mycontacts.databinding.ActivityViewContactBinding

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }

    fun getExtras(){
        val extras = intent.extras
        val name = extras?.getString("NAME","")
        var email = extras?.getString("email","")
        var phone = extras?.getString("phone","")
        var address = extras?.getString("ADDRESS","")
        var image= extras?.getString("IMAGE","")
//        var image = binding.ivContactImage

        Toast.makeText(this,"$name: $email: $phone: $address", Toast.LENGTH_LONG).show()
        binding.tvContactName.text = name
        binding.tvContactAddress.text = address
        binding.tvContactEmail.text = email
        binding.tvContactPhone.text = phone
        Picasso.get() .load(image)
            .placeholder(R.drawable.ic_baseline_person_24)
            .error(R.drawable.ic_baseline_error_outline_24)
            .resize(300,300)
            .centerCrop()
//            .networkPolicy(NetworkPolicy.OFFLINE)
            .into(binding.ivContactImage)


    }
}