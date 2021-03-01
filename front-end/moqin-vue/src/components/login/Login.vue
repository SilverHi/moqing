<template>
  <div>
    <div>
      <label>用户名：</label>
      <input type="text" name="username" value=""/>
    </div>
    <div>
      <label>密码：</label>
      <input type="password" name="password" value=""/>
    </div>
    <div>
      <el-button type="primary" round>登录</el-button>
    </div>


  </div>
</template>

<script>
  export default {
    name: 'Login'
    
  }
</script>

<style scoped>

</style>
