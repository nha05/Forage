// Generated by view binder compiler. Do not edit!
package com.example.forage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.forage.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddForageableBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton deleteBtn;

  @NonNull
  public final MaterialCheckBox inSeasonCheckbox;

  @NonNull
  public final TextInputEditText locationAddressInput;

  @NonNull
  public final TextInputLayout locationAddressLabel;

  @NonNull
  public final TextInputEditText nameInput;

  @NonNull
  public final TextInputLayout nameLabel;

  @NonNull
  public final TextInputEditText notesInput;

  @NonNull
  public final TextInputLayout notesLabel;

  @NonNull
  public final MaterialButton saveBtn;

  private FragmentAddForageableBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton deleteBtn, @NonNull MaterialCheckBox inSeasonCheckbox,
      @NonNull TextInputEditText locationAddressInput,
      @NonNull TextInputLayout locationAddressLabel, @NonNull TextInputEditText nameInput,
      @NonNull TextInputLayout nameLabel, @NonNull TextInputEditText notesInput,
      @NonNull TextInputLayout notesLabel, @NonNull MaterialButton saveBtn) {
    this.rootView = rootView;
    this.deleteBtn = deleteBtn;
    this.inSeasonCheckbox = inSeasonCheckbox;
    this.locationAddressInput = locationAddressInput;
    this.locationAddressLabel = locationAddressLabel;
    this.nameInput = nameInput;
    this.nameLabel = nameLabel;
    this.notesInput = notesInput;
    this.notesLabel = notesLabel;
    this.saveBtn = saveBtn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddForageableBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddForageableBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_add_forageable, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddForageableBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.delete_btn;
      MaterialButton deleteBtn = rootView.findViewById(id);
      if (deleteBtn == null) {
        break missingId;
      }

      id = R.id.in_season_checkbox;
      MaterialCheckBox inSeasonCheckbox = rootView.findViewById(id);
      if (inSeasonCheckbox == null) {
        break missingId;
      }

      id = R.id.location_address_input;
      TextInputEditText locationAddressInput = rootView.findViewById(id);
      if (locationAddressInput == null) {
        break missingId;
      }

      id = R.id.location_address_label;
      TextInputLayout locationAddressLabel = rootView.findViewById(id);
      if (locationAddressLabel == null) {
        break missingId;
      }

      id = R.id.name_input;
      TextInputEditText nameInput = rootView.findViewById(id);
      if (nameInput == null) {
        break missingId;
      }

      id = R.id.name_label;
      TextInputLayout nameLabel = rootView.findViewById(id);
      if (nameLabel == null) {
        break missingId;
      }

      id = R.id.notes_input;
      TextInputEditText notesInput = rootView.findViewById(id);
      if (notesInput == null) {
        break missingId;
      }

      id = R.id.notes_label;
      TextInputLayout notesLabel = rootView.findViewById(id);
      if (notesLabel == null) {
        break missingId;
      }

      id = R.id.save_btn;
      MaterialButton saveBtn = rootView.findViewById(id);
      if (saveBtn == null) {
        break missingId;
      }

      return new FragmentAddForageableBinding((ConstraintLayout) rootView, deleteBtn,
          inSeasonCheckbox, locationAddressInput, locationAddressLabel, nameInput, nameLabel,
          notesInput, notesLabel, saveBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}