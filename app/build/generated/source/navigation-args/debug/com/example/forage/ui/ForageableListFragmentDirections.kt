package com.example.forage.ui

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.forage.R
import kotlin.Int
import kotlin.Long

public class ForageableListFragmentDirections private constructor() {
  private data class ActionForageableListFragmentToAddForageableFragment(
    public val id: Long = 0L
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_forageableListFragment_to_addForageableFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putLong("id", this.id)
      return result
    }
  }

  private data class ActionForageableListFragmentToForageableDetailFragment(
    public val id: Long = 0L
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_forageableListFragment_to_forageableDetailFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putLong("id", this.id)
      return result
    }
  }

  public companion object {
    public fun actionForageableListFragmentToAddForageableFragment(id: Long = 0L): NavDirections =
        ActionForageableListFragmentToAddForageableFragment(id)

    public fun actionForageableListFragmentToForageableDetailFragment(id: Long = 0L): NavDirections
        = ActionForageableListFragmentToForageableDetailFragment(id)
  }
}
