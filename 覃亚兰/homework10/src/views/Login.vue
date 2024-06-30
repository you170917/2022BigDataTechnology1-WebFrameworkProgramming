<template>
  <div>
    <el-form ref="loginForm" v-bind:rules="rules" v-bind:model="loginData"
             class="loginContainer">
      <h3 style="display: flex; justify-content: center">系统登录</h3>
      <el-form-item label="用户名" prop="username">
        <el-input v-model="loginData.username" placeholder="请输入用户
名..."></el-input>
      </el-form-item>
      <el-form-item label="密码" prop="password">
        <el-input v-model="loginData.password" placeholder="请输入密码...">
        </el-input>
      </el-form-item>
      <el-checkbox label="记住我" v-model="checked"></el-checkbox>
      <el-button type="primary" style="width: 100%; margin-top: 5px" v-on:click="submitLogin">登录
      </el-button>
    </el-form>
  </div>
</template>
<script>
export default {
  name: "Login",
  data(){
    return{
      rules: {
username:[{required: true, message: "请输入用户名", trigger:
  blur}],
    password:[{required: true, message: "请输入密码", trigger: blur}],
  },
    loginData: {
      username: "",
          password: ""
    },
    checked: true
  }
  },
  methods: {
    submitLogin(){
      this.$refs.loginForm.validate((valid) =>{
        if (valid){
          this.postKeyValueRequest("/login", this.loginData).then(resp =>{
            if (resp){
              window.sessionStorage.setItem("account",
                  JSON.stringify(resp.obj));
              this.$router.replace("/home");
              this.$message.success("登录成功!")
            }
          })
        }
        else {
          this.$message.error('请输入所有字段');
          return false;
        }
      })
    }
  }
}
</script>
<style scoped>
.loginContainer{
  border-radius: 15px; /*设置外边框圆角*/
  margin: 100px auto; /*外边距*/
  width: 350px; /*宽度*/
  padding: 20px 20px 35px 20px; /*上右下左内边距*/
  background: #fff; /*背景颜色为白色*/
  border: 1px solid #eaeaea; /*边框粗细,实线,颜色*/
  box-shadow: 0 0 25px #cac6c6; /* x 偏移量 | y 偏移量 | 阴影模糊半径 | 阴影颜色
*/
}
</style>