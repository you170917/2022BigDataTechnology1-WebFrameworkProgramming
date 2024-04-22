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
        <input v-model="addUserParams.username">
      </div>
      <div>
        address
        <input v-model="addUserParams.address">
      </div>
    </div>
    <button v-on:click="addUser">添加用户</button>
    <p></p>
    <div>
      请输入要修改的用户信息：
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
  data(){
    return{
      addUserParams: {
        username: null,
        address: null,
      },
      updateUserParams: {
        id: null,
        username: null,
        address: null,
      }
    }
  },
  methods: {
    // getAllUsers(){
    //   axios.get("http://localhost:8080/AllUsers")
    //       .then(resp => {
    //         console.log(resp);
    //         this.users = resp.data;
    //       })
    getAllUsers(){
      this.getRequest("/AllUsers").then(resp => {
        console.log(resp);
        if (resp.status === 200){
          this.users = resp.data.data;
        }else {
          alert(resp.data.msg);
        }

      })
    },
    // getUserById(){
    //   axios.get(`http://localhost:8080/user/${this.queryId}`)
    //       .then(resp => {
    //         console.log(resp);
    //         this.userById = resp.data;
    //       })
    // },
    getUserById(){
      this.getRequest(`/user/${this.queryId}`).then(resp => {
        console.log(resp);
        if (resp.status === 200){
          this.userById = resp.data.data;
        }else {
          alert(resp.data.msg);

        }
      })
    },

    // addUser(){
    //   axios.post("http://localhost:8080/user",
    //       {
    //         username: this.username,
    //         address: this.address
    //       }).then(resp => {
    //     console.log(resp);
    //   })
    // },
    addUser(){
      this.postRequest("/user", {
        username: this.addUserParams.username,
        address: this.addUserParams.address
      }).then(resp => {
        console.log(resp)
      })
    },
    // updateUser(){
    //   axios.put("http://localhost:8080/user",{
    //     id: this.id,
    //     username: this.username,
    //     address: this.address
    //   }).then( resp => {
    //     console.log(resp);
    //   })
    // },
    updateUser(){
      this.putRequest("/user", {
        id: this.updateUserParams.id,
        username: this.updateUserParams.username,
        address: this.updateUserParams.address
      }).then(resp => {
        console.log(resp);
      })
    },

    // deleteUser(){
    //   axios.delete("http://localhost:8080/user", {
    //     params: {
    //       id: this.deleteId
    //     }
    //   }).then(resp => {
    //     console.log(resp);
    //   })
    // }
    deleteUser(){
      this.deleteRequest("/user", {
        id: this.deleteId
      }).then(resp => {
        console.log(resp);
      })
      }
  }
}
</script>
