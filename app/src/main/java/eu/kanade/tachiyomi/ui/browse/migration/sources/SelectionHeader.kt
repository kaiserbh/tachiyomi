package eu.kanade.tachiyomi.ui.browse.migration.sources

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import eu.davidea.flexibleadapter.FlexibleAdapter
import eu.davidea.flexibleadapter.items.AbstractHeaderItem
import eu.davidea.flexibleadapter.items.IFlexible
import eu.kanade.tachiyomi.R
import eu.kanade.tachiyomi.ui.base.holder.BaseFlexibleViewHolder
import kotlinx.android.synthetic.main.source_main_controller_card_header.title

/**
 * Item that contains the selection header.
 */
class SelectionHeader : AbstractHeaderItem<SelectionHeader.Holder>() {

    /**
     * Returns the layout resource of this item.
     */
    override fun getLayoutRes(): Int {
        return R.layout.source_main_controller_card_header
    }

    /**
     * Creates a new view holder for this item.
     */
    override fun createViewHolder(view: View, adapter: FlexibleAdapter<IFlexible<RecyclerView.ViewHolder>>): Holder {
        return Holder(
            view,
            adapter
        )
    }

    /**
     * Binds this item to the given view holder.
     */
    override fun bindViewHolder(
        adapter: FlexibleAdapter<IFlexible<RecyclerView.ViewHolder>>,
        holder: Holder,
        position: Int,
        // SY -->
        payloads: MutableList<Any?>?
        // SY <--
    ) {
        // Intentionally empty
    }

    class Holder(view: View, adapter: FlexibleAdapter</* SY --> */ IFlexible<RecyclerView.ViewHolder> /* SY <-- */ >) : BaseFlexibleViewHolder(view, adapter) {
        init {
            title.text = view.context.getString(/* SY --> */ R.string.select_a_source_to_migrate_from /* SY <-- */)
        }
    }

    override fun equals(other: Any?): Boolean {
        return other is SelectionHeader
    }

    override fun hashCode(): Int {
        return 0
    }
}
