package com.example.movie_list.reducers

import com.example.movie_list.actions.Actions
import com.example.movie_list.model.AppState
import com.example.movie_list.model.Movie
import com.github.raulccabreu.redukt.actions.Reduce
import com.github.raulccabreu.redukt.reducers.BaseAnnotatedReducer


class AppStateReducer : BaseAnnotatedReducer<AppState>() {

    @Reduce(Actions.FETCH_MOVIE_LIST)
    fun fetchMovieList(state: AppState, newList: List<Movie>): AppState {
        state.list?.let { return state.copy(list = state.list?.plus(newList)) }
        return state.copy(list = newList)
    }

}