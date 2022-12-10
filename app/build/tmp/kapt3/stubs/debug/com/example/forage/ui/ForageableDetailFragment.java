package com.example.forage.ui;

import java.lang.System;

/**
 * A fragment to display the details of a [Forageable] currently stored in the database.
 * The [AddForageableFragment] can be launched from this fragment to edit the [Forageable]
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006#"}, d2 = {"Lcom/example/forage/ui/ForageableDetailFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/forage/databinding/FragmentForageableDetailBinding;", "binding", "getBinding", "()Lcom/example/forage/databinding/FragmentForageableDetailBinding;", "forageable", "Lcom/example/forage/model/Forageable;", "navigationArgs", "Lcom/example/forage/ui/ForageableDetailFragmentArgs;", "getNavigationArgs", "()Lcom/example/forage/ui/ForageableDetailFragmentArgs;", "navigationArgs$delegate", "Landroidx/navigation/NavArgsLazy;", "viewModel", "Lcom/example/forage/ui/viewmodel/ForageableViewModel;", "getViewModel", "()Lcom/example/forage/ui/viewmodel/ForageableViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "bindForageable", "", "launchMap", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "app_debug"})
public final class ForageableDetailFragment extends androidx.fragment.app.Fragment {
    private final androidx.navigation.NavArgsLazy navigationArgs$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.example.forage.model.Forageable forageable;
    private com.example.forage.databinding.FragmentForageableDetailBinding _binding;
    
    public ForageableDetailFragment() {
        super();
    }
    
    private final com.example.forage.ui.ForageableDetailFragmentArgs getNavigationArgs() {
        return null;
    }
    
    private final com.example.forage.ui.viewmodel.ForageableViewModel getViewModel() {
        return null;
    }
    
    private final com.example.forage.databinding.FragmentForageableDetailBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void bindForageable() {
    }
    
    private final void launchMap() {
    }
}