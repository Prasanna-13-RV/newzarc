// Generated by Dagger (https://dagger.dev).
package com.newzarc.newzarcapp.data.datasourceImpl;

import com.newzarc.newzarcapp.data.api.PostService;
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
public final class PostsRemoteDataSourceImpl_Factory implements Factory<PostsRemoteDataSourceImpl> {
  private final Provider<PostService> postServiceProvider;

  public PostsRemoteDataSourceImpl_Factory(Provider<PostService> postServiceProvider) {
    this.postServiceProvider = postServiceProvider;
  }

  @Override
  public PostsRemoteDataSourceImpl get() {
    return newInstance(postServiceProvider.get());
  }

  public static PostsRemoteDataSourceImpl_Factory create(
      Provider<PostService> postServiceProvider) {
    return new PostsRemoteDataSourceImpl_Factory(postServiceProvider);
  }

  public static PostsRemoteDataSourceImpl newInstance(PostService postService) {
    return new PostsRemoteDataSourceImpl(postService);
  }
}
