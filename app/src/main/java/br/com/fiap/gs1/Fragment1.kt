package br.com.fiap.gs1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment1 : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var droneAdapter: DroneAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_1, container, false)

        // Configure a RecyclerView
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        droneAdapter = DroneAdapter(getDroneList())
        recyclerView.adapter = droneAdapter

        return view
    }

    // Função de exemplo para retornar uma lista de drones
    private fun getDroneList(): List<Drones> {
        val drones = mutableListOf<Drones>()
        // Adicione os drones desejados à lista
        drones.add(Drones("Drone01", "", "", "","drone teste", "testando list"))
        drones.add(Drones("Drone02", "", "", "","drone teste2", "testando list2"))
        // ...
        return drones
    }
}