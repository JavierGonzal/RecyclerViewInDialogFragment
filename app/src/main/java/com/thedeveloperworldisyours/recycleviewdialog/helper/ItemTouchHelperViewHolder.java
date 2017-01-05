package com.thedeveloperworldisyours.recycleviewdialog.helper;

/**
 * Created by javierg on 05/01/2017.
 */

public interface ItemTouchHelperViewHolder {
    /**
     * Called when the itemTouchHelper} first registers an item as being moved or swiped.
     * Implementations should update the item view to indicate it's active state.
     */
    void onItemSelected();


    /**
     * Called when the itemTouchHelper} has completed the move or swipe, and the active item
     * state should be cleared.
     */
    void onItemClear();
}
