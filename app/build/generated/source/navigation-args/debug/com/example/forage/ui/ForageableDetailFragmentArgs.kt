package com.example.forage.ui

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.Long
import kotlin.jvm.JvmStatic

public data class ForageableDetailFragmentArgs(
  public val id: Long = 0L
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putLong("id", this.id)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ForageableDetailFragmentArgs {
      bundle.setClassLoader(ForageableDetailFragmentArgs::class.java.classLoader)
      val __id : Long
      if (bundle.containsKey("id")) {
        __id = bundle.getLong("id")
      } else {
        __id = 0L
      }
      return ForageableDetailFragmentArgs(__id)
    }
  }
}
