<template>
  <div>
    <div>这是用户管理的页面~</div>
    <p></p>
    <button v-on:click="getAllUsers">获取所有用户</button>
    <div v-for="user in users" v-bind:key = user.id>
      {{user}}
    </div>
    <p></p>
    <div>
      请输入要查询用户信息的id：
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
      请输入要添加的用户信息：
      <div>
        username
        <input v-model="addUserParams.username">
      </div>
      <div>
        address
        <input v-model="addUserParams.address">
      </div>
    </div>
    <button v-on:click="addUser">添加用户</button>
    <div>
      <div>
        id
        <input v-model="updateUserParams.id">
      </div>
      <div>
        username
        <input v-model="updateUserParams.username">
      </div>
      <div>
        address
        <input v-model="updateUserParams.address">
      </div>
    </div>
    <button v-on:click="updateUser">修改用户</button>
      </div>
</template>
<script>
// import axios from "axios";
import {deleteRequest, getRequest, postRequest, putRequest} from "@/utils/api";
export default {
  name: "UserPage",
  data(){
    return{

      addUserParams:{
        username: null,
        address: null,
      },
      updateUserParams:{
        id: null,
        username: null,
        address: null,
      },
      users: null,
      queryId: null,
      userById: null,
      username:null,
      address:null,
      id:null,
      deleteId: null,
    }
  },
  methods: {
    async addUser() {
      await postRequest("/user", {
        username: this.username,
        address: this.address
      }).then(resp => {
        console.log(resp);
      })
    },
    async updateUser() {
      await putRequest("/user", {
        id: this.id,
        username: this.username,
        address: this.address
      }).then(resp => {
        console.log(resp);
      })
    },
    async getAllUsers() {
      await getRequest("/AllUsers").then(resp => {
        console.log(resp);
        if (resp.status == 200) {
          this.users = resp.data.data;
        } else {
          alert(resp.data.msg);
        }
      })
    },
    async getUserById() {
      await getRequest(`/user/${this.queryId}`).then(resp => {
        console.log(resp);
        if (resp.status == 200) {
          this.userById = resp.data.data;
        } else {
          alert(resp.data.msg);
        }
      })
    },
    async deleteUser() {
      await deleteRequest("/user", {
        id: this.deleteId
      }).then(resp => {
        console.log(resp);
      })
    }
  }
}
</script>
