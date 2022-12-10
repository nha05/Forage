package com.example.forage;

import java.lang.System;

/**
 * An application class that inherits from [Application], allows for the creation of a singleton
 * instance of the [ForageDatabase]
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/example/forage/BaseApplication;", "Landroid/app/Application;", "()V", "database", "Lcom/example/forage/data/ForageDatabase;", "getDatabase", "()Lcom/example/forage/data/ForageDatabase;", "database$delegate", "Lkotlin/Lazy;", "app_debug"})
public final class BaseApplication extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy database$delegate = null;
    
    public BaseApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.forage.data.ForageDatabase getDatabase() {
        return null;
    }
}