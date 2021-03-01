<template>
  <div>
    Hello world
    <el-button type="primary" round @click="test">测试</el-button>
  </div>

</template>

<script>
import {test} from '../request/api'

export default {
  name: 'MainPage',
  created () {

  },
  methods: {
    test: function () {
      test({
        token: localStorage.getItem('token')
      }).then(res => {
        console.log('1111')
        console.log(res)
      })
    }
  }
}
</script>

<style scoped>

</style>
