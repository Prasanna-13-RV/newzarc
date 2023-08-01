// Generated by Dagger (https://dagger.dev).
package com.newzarc.newzarcapp.viewmodel;

import com.newzarc.newzarcapp.domain.usecase.GetNewsUseCase;
import com.newzarc.newzarcapp.domain.usecase.GetPostsUseCase;
import com.newzarc.newzarcapp.domain.usecase.UpdateNewsUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NewsViewModel_Factory implements Factory<NewsViewModel> {
  private final Provider<GetNewsUseCase> getNewsUseCaseProvider;

  private final Provider<UpdateNewsUseCase> updateNewsUseCaseProvider;

  private final Provider<GetPostsUseCase> getPostsUseCaseProvider;

  public NewsViewModel_Factory(Provider<GetNewsUseCase> getNewsUseCaseProvider,
      Provider<UpdateNewsUseCase> updateNewsUseCaseProvider,
      Provider<GetPostsUseCase> getPostsUseCaseProvider) {
    this.getNewsUseCaseProvider = getNewsUseCaseProvider;
    this.updateNewsUseCaseProvider = updateNewsUseCaseProvider;
    this.getPostsUseCaseProvider = getPostsUseCaseProvider;
  }

  @Override
  public NewsViewModel get() {
    return newInstance(getNewsUseCaseProvider.get(), updateNewsUseCaseProvider.get(), getPostsUseCaseProvider.get());
  }

  public static NewsViewModel_Factory create(Provider<GetNewsUseCase> getNewsUseCaseProvider,
      Provider<UpdateNewsUseCase> updateNewsUseCaseProvider,
      Provider<GetPostsUseCase> getPostsUseCaseProvider) {
    return new NewsViewModel_Factory(getNewsUseCaseProvider, updateNewsUseCaseProvider, getPostsUseCaseProvider);
  }

  public static NewsViewModel newInstance(GetNewsUseCase getNewsUseCase,
      UpdateNewsUseCase updateNewsUseCase, GetPostsUseCase getPostsUseCase) {
    return new NewsViewModel(getNewsUseCase, updateNewsUseCase, getPostsUseCase);
  }
}
