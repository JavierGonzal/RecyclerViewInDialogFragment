package com.thedeveloperworldisyours.recycleviewdialog.helper;

/**
 * Created by javierg on 05/01/2017.
 */

public interface ItemTouchHelperAdapter {
    /**
     * Called when an item has been dragged far enough to trigger a move. This is called every time
     * an item is shifted, and <strong>not</strong> at the end of a "drop" event.<br/>
     */
    boolean onItemMove(int fromPosition, int toPosition);


    /**
     * Called when an item has been dismissed by a swipe.<br/>
     */
    void onItemDismiss(int position);
}
