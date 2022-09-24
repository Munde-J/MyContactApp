package dev.jojo.mycontacts.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.jojo.mycontacts.model.Contact
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
        var contact1 = Contact("Lucky", "0721876542", "aby@gmail.com","16 uni","https://images.pexels.com/photos/1967902/pexels-photo-1967902.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact2 = Contact("Gabriel", "0723456542", "ben@gmail.com","16 mission","https://images.pexels.com/photos/871495/pexels-photo-871495.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact3 = Contact("Leah", "0729876542", "purity@gmail.com","16 laving","https://images.pexels.com/photos/1674752/pexels-photo-1674752.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact4 = Contact("Manuela", "0721896542", "manuela@gmail.com","16 land","https://images.pexels.com/photos/938013/pexels-photo-938013.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact5 = Contact("Angela", "0721832542", "angela@gmail.com","16 wonderland","https://images.pexels.com/photos/938013/pexels-photo-938013.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact6 = Contact("Ann", "0721832542", "angela@gmail.com","16 wonderland","https://images.pexels.com/photos/1820919/pexels-photo-1820919.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact7 = Contact("June", "0721832542", "angela@gmail.com","16 wonderland","https://images.pexels.com/photos/993868/pexels-photo-993868.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact8 = Contact("Abby", "0721832542", "angela@gmail.com","16 wonderland","https://images.pexels.com/photos/3368342/pexels-photo-3368342.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact9 = Contact("Vicky", "0721832542", "angela@gmail.com","16 wonderland","https://images.pexels.com/photos/1252982/pexels-photo-1252982.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact10 = Contact("Liz", "0721832542", "angela@gmail.com","16 wonderland","https://images.pexels.com/photos/1799464/pexels-photo-1799464.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact11 = Contact("Sandy", "0721832542", "angela@gmail.com","16 wonderland","https://images.pexels.com/photos/37546/woman-portrait-face-studio-37546.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact12 = Contact("Joy", "0721832542", "angela@gmail.com","16 wonderland","https://images.pexels.com/photos/1994818/pexels-photo-1994818.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact13 = Contact("Akuot", "0721832542", "angela@gmail.com","16 wonderland","https://images.pexels.com/photos/5449172/pexels-photo-5449172.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact14 = Contact("Amor", "0721832542", "amor@gmail.com","16 wonderland","https://images.pexels.com/photos/3655782/pexels-photo-3655782.jpeg?auto=compress&cs=tinysrgb&w=400")


        var contactList =
        listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11,contact12,contact13,contact14)
        var contactAdapter = ContactAdapter(contactList)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactAdapter
    }
}