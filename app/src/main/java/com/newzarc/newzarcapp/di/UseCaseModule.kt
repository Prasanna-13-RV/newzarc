package com.newzarc.newzarcapp.di

import com.newzarc.newzarcapp.domain.repository.NewsRepository
import com.newzarc.newzarcapp.domain.repository.PostsRepository
import com.newzarc.newzarcapp.domain.usecase.GetMyPostUseCase
import com.newzarc.newzarcapp.domain.usecase.GetNewsUseCase
import com.newzarc.newzarcapp.domain.usecase.GetPostsUseCase
import com.newzarc.newzarcapp.domain.usecase.PostCreateUseCase
import com.newzarc.newzarcapp.domain.usecase.UpdateNewsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Singleton
    @Provides
    fun providesGetNewsUseCase(newsRepository: NewsRepository): GetNewsUseCase {
        return GetNewsUseCase(newsRepository)
    }

    @Singleton
    @Provides
    fun providesUpdateNewsUseCase(newsRepository: NewsRepository): UpdateNewsUseCase {
        return UpdateNewsUseCase(newsRepository)
    }

    @Singleton
    @Provides
    fun providesGetPostsUseCase(postsRepository: PostsRepository): GetPostsUseCase {
        return GetPostsUseCase(postsRepository)
    }

    @Singleton
    @Provides
    fun providesGetMyPostsUseCase(postsRepository: PostsRepository): GetMyPostUseCase {
        return GetMyPostUseCase(postsRepository)
    }

    @Singleton
    @Provides
    fun providesCreateMyPostsUseCase(postsRepository: PostsRepository): PostCreateUseCase {
        return PostCreateUseCase(postsRepository)
    }

}