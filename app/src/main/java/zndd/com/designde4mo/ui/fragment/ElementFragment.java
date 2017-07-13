package zndd.com.designde4mo.ui.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import zndd.com.designde4mo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ElementFragment extends Fragment {

    private static final String BUNDLE_TEXT = "BUNDLE_TEXT";
    @BindView(R.id.centertext)
    TextView centertext;
    Unbinder unbinder;

    public static ElementFragment newInstance(String text) {

        Bundle args = new Bundle();
        args.putString(BUNDLE_TEXT, text);
        ElementFragment fragment = new ElementFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public ElementFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_element, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String bundleText = getArguments().getString(BUNDLE_TEXT);
        centertext.setText(bundleText);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
