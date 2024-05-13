<script setup>

</script>

<template>
  <div>
    <div>这是用户管理的页面~</div>
    <p></p>
    <button v-on:click="getAllUsers">获取所有用户</button>
    <div v-for="user in users" v-bind:key = user.id>
      {{user}}
    </div>
    <p></p>
    <div>请输入要查询用户信息的id：
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
      请输入删除用户的id：
      <input v-model = "deleteId">
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
      queryId: null,
      userById: null,
      username: null,
      address: null,
      id: null,
    }
  },
  methods: {
    getAllUsers() {
      this.getRequest("/AllUsers").then(resp => {
        console.log(resp);
        if (resp.status == 200) {
          this.users = resp.data.data; //通过 resp.data.data 拿到返回数据
        } else {
          alert(resp.data.msg);
        }
      })
    },
    getUserById() {
      this.getRequest(`/user/${this.queryId}`).then(resp => {
        console.log(resp);
        if (resp.status == 200) {
          this.userById = resp.data.data;
        } else {
          alert(resp.data.msg);
        }
      })
    },
    addUser() {
      this.postRequest("/user", {
        username: this.username,
        address: this.address
      }).then(resp => {
        console.log(resp);
      })
    },
    updateUser() {
      this.putRequest("/user", {
        id: this.id,
        username: this.username,
        address: this.address
      }).then(resp => {
        console.log(resp);
      })
    },
    deleteUser() {
      this.deleteRequest("/user", {
        id: this.deleteId
      }).then(resp => {
        console.log(resp);
      })
    }
  }
}
</script>
<style scoped>

</style>