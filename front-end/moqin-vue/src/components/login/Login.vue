<template>
  <div>
    <div>
      <label>用户名：</label>
      <input type="text" name="username" v-model="username"/>
    </div>
    <div>
      <label>密码：</label>
      <input type="password" name="password" v-model="password"/>
    </div>
    <div>
      <el-button type="primary" round @click="userLogin">登录</el-button>
    </div>

  </div>
</template>

<script>
import {login} from '../../request/api'

export default {
  name: 'Login',
  data: function () {
    return {

    }
  },
  methods: {
    userLogin () {
      let that = this
      if (that.username !== null && that.password !== '') {
        let token = localStorage.getItem('token')

        console.log(that.username + '---')
        console.log(that.password + '---')
        console.log(token + '---')

        login(
          {
            username: that.username,
            password: that.password,
            token: token
          }
        ).then(res => {
          console.log(res)
          if (res.code !== 10000) {
            localStorage.setItem('token', res.data)
            that.$router.push('/mainPage')
          } else {
            localStorage.removeItem('token')
            alert(res.msg)
          }
        }).catch(error => {
          localStorage.removeItem('token')
          alert(error)
        })
      } else {
        alert('用户名或密码不能为空')
      }
    }
  }
}
</script>

<style scoped>

</style>
