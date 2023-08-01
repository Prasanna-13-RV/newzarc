// Generated by Dagger (https://dagger.dev).
package com.newzarc.newzarcapp.di;

import com.newzarc.newzarcapp.domain.repository.NewsRepository;
import com.newzarc.newzarcapp.domain.usecase.UpdateNewsUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UseCaseModule_ProvidesUpdateNewsUseCaseFactory implements Factory<UpdateNewsUseCase> {
  private final UseCaseModule module;

  private final Provider<NewsRepository> newsRepositoryProvider;

  public UseCaseModule_ProvidesUpdateNewsUseCaseFactory(UseCaseModule module,
      Provider<NewsRepository> newsRepositoryProvider) {
    this.module = module;
    this.newsRepositoryProvider = newsRepositoryProvider;
  }

  @Override
  public UpdateNewsUseCase get() {
    return providesUpdateNewsUseCase(module, newsRepositoryProvider.get());
  }

  public static UseCaseModule_ProvidesUpdateNewsUseCaseFactory create(UseCaseModule module,
      Provider<NewsRepository> newsRepositoryProvider) {
    return new UseCaseModule_ProvidesUpdateNewsUseCaseFactory(module, newsRepositoryProvider);
  }

  public static UpdateNewsUseCase providesUpdateNewsUseCase(UseCaseModule instance,
      NewsRepository newsRepository) {
    return Preconditions.checkNotNullFromProvides(instance.providesUpdateNewsUseCase(newsRepository));
  }
}
