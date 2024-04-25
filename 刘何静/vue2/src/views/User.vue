<template>
<div>
  <div>这是杨倩的厨房</div>
  <button v-on:click="this.getAllusers">获取所有用户信息 </button>
  <div v-for="user in users" v-bind:key=user.id>
    {{user}}
  </div>
  <p></p>
  <div>请输入要查询的用户信息id:
    <input v-model="queryId">
  </div>
  <button v-on:click="getUserById">通过id获取指定用户</button>
  <div>{{userById}}</div>
  <p></p>
  <div>
    请输入要添加的用户信息：
    <div>
      username
      <input v-model="username">
    </div>
    <div>
      address
      <input v-model="address">
    </div>
  </div>
  <button v-on:click="addUser">添加用户</button>
  <p></p>
  <div>
    请输入要修改的用户信息：
    <div>
      id
      <input v-model="id">
    </div>
    <div>
      username
      <input v-model="username">
    </div>
    <div>
      address
      <input v-model="address">
    </div>
  </div>
  <button v-on:click="updateUser">修改用户</button>
  <p></p>
  <div>
    请输入要删除的用户id:
    <input v-model="deleteId">
    <div>
      <button v-on:click="deleteUser">删除用户</button>
    </div>
  </div>
</div>
</template>

<script>
import axios from "axios";
export default {
  name: "UserPage",
  data() {
    return {
      users: null,
      queryId:null,
      userById:null,
      username:null,
      address:null,
      id:null,
      deleteId:null
    }
  },
  methods:{
    getAllusers(){
      axios.get("/api/user/AllUsers")
          .then(resp => {
            console.log(resp);
            this.users = resp.data;
          })
    },
    getUserById(){
      axios.get(`/api/user/${this.queryId}`)
          .then(resp=>{
            console.log(resp);
            this.users = resp.data;
          })
    },
    addUser(){
      axios.post("/api/user",
 {
          username:this.username,
          address:this.address
       }).then(resp =>{
          console.log(resp.data);
      })
    },
    updateUser(){
      axios.put("/api/user",{
        id:this.id,
        username:this.username,
        address:this.address
      }).then( resp =>{
          console.log(resp.data);
      })
    },
    deleteUser() {
      axios.dalete("/api/user", {
        params: {
          id: this.deleteId
        }
      }).then(resp => {
        console.log(resp.data);
      })
    }
  }
}
</script>

<style scoped>

</style>