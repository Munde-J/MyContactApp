package dev.jojo.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.jojo.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        displayContacts()

    }

    fun displayContacts(){
        var contact1 = Contact("Aby", "0721876542", "aby@gmail.com","16 uni","https://images.pexels.com/photos/1674752/pexels-photo-1674752.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact2 = Contact("Gabriel", "0723456542", "ben@gmail.com","16 mission","https://images.pexels.com/photos/936119/pexels-photo-936119.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1")
        var contact3 = Contact("Jane", "0721906542", "jane@gmail.com","16 serengeti","https://images.pexels.com/photos/1006202/pexels-photo-1006202.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact4 = Contact("Purity", "0729876542", "purity@gmail.com","16 laving","https://images.pexels.com/photos/3655782/pexels-photo-3655782.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact5 = Contact("Manuela", "0721896542", "manuela@gmail.com","16 land","https://images.pexels.com/photos/944761/pexels-photo-944761.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact6 = Contact("Angela", "0721832542", "angela@gmail.com","16 wonderland","https://images.pexels.com/photos/993868/pexels-photo-993868.png?auto=compress&cs=tinysrgb&w=400")

        var contactList =
        listOf(contact1,contact2,contact3,contact4,contact5,contact6)
        var contactAdapter = ContactAdapter(contactList)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactAdapter
    }
}