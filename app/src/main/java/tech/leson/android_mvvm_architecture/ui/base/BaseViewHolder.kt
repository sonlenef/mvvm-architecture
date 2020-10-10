package tech.leson.android_mvvm_architecture.ui.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder

abstract class BaseViewHolder<M>(itemView: View) : ViewHolder(itemView) {
    protected abstract fun onBind(data: M)
}
