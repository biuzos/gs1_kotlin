package br.com.fiap.gs1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DroneAdapter(private val drones: List<Drones>) : RecyclerView.Adapter<DroneAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.drone_layout, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val drone = drones[position]
        holder.bind(drone)
    }

    override fun getItemCount(): Int {
        return drones.size
    }

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(drone: Drones) {
            // Vincule os dados às views do item_layout.xml aqui
            itemView.findViewById<TextView>(R.id.droneCodeTextView).text = drone.title
            itemView.findViewById<TextView>(R.id.droneDescriptionTextView).text = drone.description
            itemView.findViewById<TextView>(R.id.latTextView).text = drone.latitude
            itemView.findViewById<TextView>(R.id.longTextView).text = drone.longitude
            itemView.findViewById<TextView>(R.id.titleTextView).text = drone.title
        }
    }
}
