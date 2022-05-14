<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
    <p>
      用户名：<input type="text" name="用户名"/><br>
      密&nbsp;&nbsp;&nbsp;&nbsp;码：<input  type="password" name="密码"/><br>
    </p>
    <el-button type="primary">提交</el-button>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
