<template>
<div>
  <div>这是杨倩的厨房</div>
  <button v-on:click="this.getAllusers">获取所有用户信息 </button>
  <div v-for="userItem in users" v-bind:key="userItem.key">
    {{userItem}}
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
    请输入要删除的用户id:
    <input v-model="deleteId">
    <div>
      <button v-on:click="deleteUser">删除用户</button>
    </div>
  </div>
</div>
</template>

<script>
import {deleteRequest, getRequest, postRequest, putRequest} from "@/utils/api.js";

export default {
  name: `UserPage`,
  data() {
    return {
      users: [],
      queryId:null,
      userById:null,
      username:null,
      address:null,
      id:null,
      deleteId:null,

      addUserParams: {
        username: null,
        address: null,
      },
      updateUserParams: {
        id: null,
        username: null,
        address: null,
      },
      deleteUserParams:{
        id:null,
      },
    }
  },
  methods:{
    getAllusers(){
      // axios.get("/api/user/AllUsers")
      //     .then(resp => {
      //       console.log(resp);
      //       this.users = resp.data;
      //     })


      // this.getRequest("/AllUsers").then(resp => {
      //   console.log(resp);
      //   this.users = resp.data;
      // })

      getRequest("/AllUsers").then(resp => {
        console.log(resp);
        if (resp.status === 200){
          this.users = resp.data.data; //通过 resp.data.data 拿到返回数据
        }else {
          alert(resp.data.msg);
        }
      })
    },
    getUserById(){
      // axios.get(`/api/user/${this.queryId}`)
      //     .then(resp=>{
      //       console.log(resp);
      //       this.users = resp.data;
      //     })


      // this.getRequest(`/user/${this.queryId}`).then(resp => {
      //   console.log(resp);
      //   this.userById = resp.data;
      // })

      getRequest(`/user/${this.queryId}`).then(resp => {
        console.log(resp);
        if (resp.status === 200){
          this.userById = resp.data.data;
        }else {
          alert(resp.data.msg);
        }
      })
    },
    addUser(){
 //      axios.post("/api/user",
 // {
 //          username:this.username,
 //          address:this.address
 //       }).then(resp =>{
 //          console.log(resp.data);
 //      })


 //      this.postRequest("/user", {
 //        username: this.username,
 //        address: this.address
 //      }).then(resp => {
 //        console.log(resp)
 //      })


      postRequest("/user", {
        username: this.addUserParams.username,
        address: this.addUserParams.address
      }).then(resp => {
        console.log(resp);
      })


    },
    updateUser(){
      // axios.put("/api/user",{
      //   id:this.id,
      //   username:this.username,
      //   address:this.address
      // }).then( resp =>{
      //     console.log(resp.data);
      // })

      // this.putRequest("/user", {
      //   id: this.id,
      //   username: this.username,
      //   address: this.address
      // }).then(resp => {
      //   console.log(resp);
      // })

      putRequest("/user", {
        id: this.updateUserParams.id,
        username: this.addUserParams.username,
        address: this.addUserParams.address
      }).then(resp => {
        console.log(resp);
      })

    },
    deleteUser() {
      // axios.dalete("/api/user", {
      //   params: {
      //     id: this.deleteId
      //   }


      // this.deleteRequest("/user",{
      //   id:this.id,
      // }).then(resp => {
      //   console.log(resp);

      deleteRequest("/user", {
        id: this.deleteUserParams.id
      }).then(resp => {
        console.log(resp);

      })
    }
  }
}
</script>

<style scoped>

</style>