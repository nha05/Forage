// Generated by data binding compiler. Do not edit!
package com.example.forage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.forage.R;
import com.example.forage.model.Forageable;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemForageableBinding extends ViewDataBinding {
  @NonNull
  public final TextView address;

  @NonNull
  public final TextView name;

  @Bindable
  protected Forageable mForageable;

  protected ListItemForageableBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView address, TextView name) {
    super(_bindingComponent, _root, _localFieldCount);
    this.address = address;
    this.name = name;
  }

  public abstract void setForageable(@Nullable Forageable forageable);

  @Nullable
  public Forageable getForageable() {
    return mForageable;
  }

  @NonNull
  public static ListItemForageableBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_forageable, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemForageableBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemForageableBinding>inflateInternal(inflater, R.layout.list_item_forageable, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemForageableBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_item_forageable, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemForageableBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemForageableBinding>inflateInternal(inflater, R.layout.list_item_forageable, null, false, component);
  }

  public static ListItemForageableBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ListItemForageableBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemForageableBinding)bind(component, view, R.layout.list_item_forageable);
  }
}