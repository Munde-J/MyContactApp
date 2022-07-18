package dev.jojo.mycontacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.NetworkPolicy
import com.squareup.picasso.Picasso
import dev.jojo.mycontacts.databinding.ActivityMainBinding
import dev.jojo.mycontacts.databinding.ContactListItemsBinding

class ContactAdapter (var contactList: List<Contact>):
RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding =ContactListItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        var contactViewHolder = ContactViewHolder(binding)
        return  contactViewHolder
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact = contactList.get(position)
        holder.binding.tvName.text = currentContact.name
        holder.binding.tvPhone.text = currentContact.phone
        holder.binding.tvEmail.text = currentContact.email
        holder.binding.tvAddress.text = currentContact.address
        Picasso.get()
            .load(currentContact.image)
            .placeholder(R.drawable.ic_baseline_person_24)
            .error(R.drawable.ic_baseline_error_outline_24)
            .resize(300,300)
            .centerCrop()
            .networkPolicy(NetworkPolicy.OFFLINE)
            .into(holder.binding.ivImage)

        val context = holder.itemView.context
        holder.binding.ivImage.setOnClickListener{
            Toast.makeText(context,"You have clicked on ${currentContact.name}'s the image", Toast.LENGTH_SHORT).show()
        }
        holder.binding.cvContact.setOnClickListener{
            val intent = Intent(context, ViewContactActivity::class.java)
            intent.putExtra("NAME", currentContact.name)
            intent.putExtra("email",currentContact.email)
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return contactList.size
    }

}
class  ContactViewHolder(var binding: ContactListItemsBinding): RecyclerView.ViewHolder(binding.root){

}


