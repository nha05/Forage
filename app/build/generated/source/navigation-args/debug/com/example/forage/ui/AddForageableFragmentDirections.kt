package com.example.forage.ui

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.forage.R

public class AddForageableFragmentDirections private constructor() {
  public companion object {
    public fun actionAddForageableFragmentToForageableListFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_addForageableFragment_to_forageableListFragment)
  }
}
