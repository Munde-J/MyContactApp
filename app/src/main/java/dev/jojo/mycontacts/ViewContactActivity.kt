package dev.jojo.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.squareup.picasso.Picasso
import dev.jojo.mycontacts.databinding.ActivityViewContactBinding
import dev.jojo.mycontacts.databinding.ContactListItemsBinding

class ViewContactActivity : AppCompatActivity() {
    lateinit var binding: ActivityViewContactBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewContactBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_view_contact)
        getExtras()
    }

    fun getExtras(){
        val extras = intent.extras
        val name = extras?.getString("name","")
        var email = extras?.getString("email","")
        var phone = extras?.getString("phone","")
        var address = extras?.getString("address","")
        var image = binding.ivContactImage

        Toast.makeText(this,"$name: $email: $phone: $address", Toast.LENGTH_LONG).show()
        binding.tvContactName.text = name
        binding.tvContactAddress.text = address
        binding.tvContactEmail.text = email
        binding.tvContactPhone.text = phone
        Picasso.get()

    }
}