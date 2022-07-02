package dev.conslate.recycler_view2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class NumberRecyclerViewAdapter(var Numbers:List<Int>):RecyclerView.Adapter<NumberViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        var View = LayoutInflater.from(parent.context)
            .inflate(R.layout.number_list_item, parent, false)
        return  NumberViewHolder(View)

}

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.tvNumber.inputType=Numbers.get(position)
    }

    override fun getItemCount(): Int {
    return Numbers.size   }
}
class NumberViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvNumber=itemView.findViewById<TextView>(R.id.tvNumber)

}
