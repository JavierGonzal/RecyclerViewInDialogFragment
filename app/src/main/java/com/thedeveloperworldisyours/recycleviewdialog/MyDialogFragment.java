package com.thedeveloperworldisyours.recycleviewdialog;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thedeveloperworldisyours.recycleviewdialog.helper.OnStartDragListener;
import com.thedeveloperworldisyours.recycleviewdialog.helper.SimpleItemTouchHelperCallback;


public class MyDialogFragment extends DialogFragment implements OnStartDragListener {

    private RecyclerView mRecyclerView;

    private ItemTouchHelper mItemTouchHelper;

    public MyDialogFragment() {
        // Required empty public constructor
    }

    public static MyDialogFragment newInstance() {
        return new MyDialogFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_dialog, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_my_dialog_recycler_view);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        DragAndSwipeRecyclerListAdapter adapter = new DragAndSwipeRecyclerListAdapter(getActivity(), this);

        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        ItemTouchHelper.Callback callback = new SimpleItemTouchHelperCallback(adapter);
        mItemTouchHelper = new ItemTouchHelper(callback);
        mItemTouchHelper.attachToRecyclerView(mRecyclerView);
    }

    @Override
    public void onStartDrag(RecyclerView.ViewHolder viewHolder) {
        mItemTouchHelper.startDrag(viewHolder);
    }

}
