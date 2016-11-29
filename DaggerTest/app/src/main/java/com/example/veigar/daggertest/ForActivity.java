package com.example.veigar.daggertest;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Veigar on 16/11/29.
 */
@Scope
@Retention(RUNTIME)
public @interface ForActivity {
}
