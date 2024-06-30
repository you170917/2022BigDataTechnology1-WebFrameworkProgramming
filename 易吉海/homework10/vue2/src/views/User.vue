<template>
  <div>
    <div>这是用户管理页面~~~</div>
    <p></p>
    <button v-on:click="getAllUsers">获取所有用户信息</button>
    <div v-for="user in users" v-bind:key ="user.id">
      {{user}}
    </div>
    <p></p>
    <div>
      请输入你需要查询的用户ID：
      <input v-model="queryId">
    </div>
    <button v-on:click="getUserById">获取指定用户的信息</button>
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
      <button v-on:click="updateUser">修改用户</button>
    </div>
    <p></p>
    <div>
      请输入要删除的用户的ID：
      <input v-model="deleteId">
      <div>
        <button v-on:click="deleteUser">删除用户</button>
      </div>
    </div>
  </div>
</template>

<script>
// import axios from "axios";
// import {query} from "vue/src/platforms/web/util";

export default {
  name: "UserPage",
  data(){
    return{
        users: null,
        queryId: null,
        userById: null,
        addUserParams: {
            username: null,
            address: null,
        },
        updateUserParams: {
            id: null,
            username: null,
            address: null,
        },
        id: null,
        deleteId: null
      }
  },
  methods: {
    // query,
    getAllUsers(){
    //   axios.get("/api/user/AllUsers")
    //       .then(resp => {
    //           console.log(resp);
    //           this.users = resp.data;
    //       })
    this.getRequset("/AllUsers")
        .then(resp =>{
          console.log(resp);
          this.users = resp.data.data
        })
    },
    getUserById(){
      // axios.get(`/api/user/${this.queryId}`)
      //     .then(resp => {
      //         console.log(resp);
      //         this.userById = resp.data;
      //     })
            this.getRequset(`/user/${this.queryId}`).then(resp =>{
              console.log(resp);
              this.userById = resp.data.data;
            })
    },
    addUser(){
      // axios.post("/api/user",
         // {
         //      username: this.username,
         //      address: this.address
         //  }).then(resp =>{
         //      console.log(resp);
         //  })
        this.postRequest("/user",{
          username: this.addUserParams.username,
          address: this.addUserParams.address
        }).then(resp =>{
          console.log(resp);
        })
      },
    updateUser(){
        // axios.put("/api/user",
        // {
        //     id: this.id,
        //     username: this.username,
        //     address: this.address
        // }).then(resp =>{
        //     console.log(resp.data);
        // })
        this.putRequest("/user",{
          id: this.updateUserParams.id,
          username: this.updateUserParams.username,
          address: this.updateUserParams.address
        }).then(resp =>{
            console.log(resp);
        })
      },
    deleteUser(){
      // axios.delete("/api/user",{
      //   params: {
      //     id: this.deleteId
      //   }
      // }).then(resp =>{
      //   console.log(resp.data);
      // })
      this.deleteRequest("/user",{
        id: this.deleteId
      }).then(resp =>{
          console.log(resp);
      })
    }
  }
}
</script>

<style scoped>

</style>