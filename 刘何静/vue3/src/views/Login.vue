<template>
  <div class="bd">

  <div class="login" style="text-align: center">
    <h2>用户登录界面</h2>
    <el-input class="username" placeholder="请输入您的账号" v-model="from.username"/>
    <el-input class="password" show-password placeholder="请输入您的密码" v-model="from.password"/>
    <el-button type="success" @click="this.LoginExec" class="LoginButton">登录</el-button>
  </div>
  </div>
</template>

<script>
import {Users} from "@/service/Users";

export default {
  data(){
    return{
      from:{
        username:"",
        password:""
      }
    }
  },
  methods:{
    LoginExec(){
      console.info({
        username:this.from.username,
        password:this.from.password,
      })
      let us = new Users();
      us.Login(this.from.username,this.from.password)
    }
  }
}
</script>

<style scoped>
.login{
  position: fixed;
  width: 50%;
  min-width: 700px;
  min-height: 300px;
  left: 25%;
  background: rgba(1,1,1,0.3);
  height: 40%;
  top: 30%;
  box-shadow: 0 0 2px 1px rgba(185, 161, 66, 0.98);/*阴影*/
}
.username{
  position: absolute;  /*位置绝对定位*/
  width: 80%;
  left: 10%;
  top: 20%;
}
.password{
  position: absolute;
  width: 80%;
  left: 10%;
  top: 40%;
}
.LoginButton{
  position: absolute;
  width: 80%;
  left: 10%;
  top: 70%;
}
.bd{
  background: url("@/assets/qz.jpg");
  position: fixed;
  background-size: contain;
  width: 100%;
  min-width: 1024px;
  height: 100%;
  min-height: 300px;
}
</style>