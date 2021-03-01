import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)
const store = new Vuex.Store({
  state: {
    user: '',
    token: ''
  },
  getters: {
    getUserId: function (state) {
      return state.user
    },
    getToken: function (state) {
      return state.token
    }
  },
  mutations: {
    setuser (state, userid) {
      state.user = userid
    },
    setToken (state, token) {
      state.token = token
    }

  },
  actions: {
    setuser (context, userid) {
      context.commit('setuser', userid)
    },
    setToken (context, token) {
      context.commit('setToken', token)
    }
  }
})
export default store
