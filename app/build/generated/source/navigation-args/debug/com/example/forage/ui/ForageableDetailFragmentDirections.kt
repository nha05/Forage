package com.example.forage.ui

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.forage.R
import kotlin.Int
import kotlin.Long

public class ForageableDetailFragmentDirections private constructor() {
  private data class ActionForageableDetailFragmentToAddForageableFragment(
    public val id: Long = 0L
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_forageableDetailFragment_to_addForageableFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putLong("id", this.id)
      return result
    }
  }

  public companion object {
    public fun actionForageableDetailFragmentToAddForageableFragment(id: Long = 0L): NavDirections =
        ActionForageableDetailFragmentToAddForageableFragment(id)
  }
}
