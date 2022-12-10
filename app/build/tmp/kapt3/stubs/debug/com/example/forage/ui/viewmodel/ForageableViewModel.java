package com.example.forage.ui.viewmodel;

import java.lang.System;

/**
 * Shared [ViewModel] to provide data to the [ForageableListFragment], [ForageableDetailFragment],
 * and [AddForageableFragment] and allow for interaction the the [ForageableDao]
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\bJ\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\bH\u0002J\u0016\u0010\u0016\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0018\u001a\u00020\u0019J.\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/forage/ui/viewmodel/ForageableViewModel;", "Landroidx/lifecycle/ViewModel;", "forageableDao", "Lcom/example/forage/data/ForageableDao;", "(Lcom/example/forage/data/ForageableDao;)V", "allForageable", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/forage/model/Forageable;", "getAllForageable", "()Landroidx/lifecycle/LiveData;", "addForageable", "", "name", "", "address", "inSeason", "", "notes", "deleteForageable", "forageable", "insertForageable", "isValidEntry", "retrieveForageable", "id", "", "updateForageable", "app_debug"})
public final class ForageableViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.forage.data.ForageableDao forageableDao = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.forage.model.Forageable>> allForageable = null;
    
    public ForageableViewModel(@org.jetbrains.annotations.NotNull()
    com.example.forage.data.ForageableDao forageableDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.forage.model.Forageable>> getAllForageable() {
        return null;
    }
    
    private final void insertForageable(com.example.forage.model.Forageable forageable) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.forage.model.Forageable> retrieveForageable(long id) {
        return null;
    }
    
    public final void addForageable(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String address, boolean inSeason, @org.jetbrains.annotations.NotNull()
    java.lang.String notes) {
    }
    
    public final void updateForageable(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String address, boolean inSeason, @org.jetbrains.annotations.NotNull()
    java.lang.String notes) {
    }
    
    public final void deleteForageable(@org.jetbrains.annotations.NotNull()
    com.example.forage.model.Forageable forageable) {
    }
    
    public final boolean isValidEntry(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String address) {
        return false;
    }
}