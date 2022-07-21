package me.mcl.appcontact

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import me.mcl.appcontact.ContactAdapter.*

class ContactAdapter(val contactList: ArrayList<Contact>) :
    RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.contact_view, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactAdapter.ViewHolder, position: Int) {
        holder.bindItem(contactList[position])
    }
    override fun getItemCount(): Int {
        return contactList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindItem(contact: Contact){
            val textName = itemView.findViewById<TextView>(R.id.tvNome)
            val textPhone = itemView.findViewById<TextView>(R.id.tvNumero)

            textName.text = contact.name
            textPhone.text = contact.phoneNumber
        }
    }
}
