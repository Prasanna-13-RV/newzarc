package com.newzarc.newzarcapp.app;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = NewzarcApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface NewzarcApplication_GeneratedInjector {
  void injectNewzarcApplication(NewzarcApplication newzarcApplication);
}
