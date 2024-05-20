<script>
export default {
  name: "MyUser",
  data(){
    return{
      users: [],
      queryId: "",
      userInfo: [],
      addUserParams: {
        username: null,
        address: null
      },
      updateUserParams: {
        id: "",
        username: "",
        address: ""
      },
      deleteId: ""
    }
  },
  mounted() {this.getAllUsers();
  },
  methods: {
    getAllUsers(){
      this.getRequest("/AllUsers").then(resp => {
        if (resp.data.code == 200){
// console.log(resp)
          this.$message.success("刷新成功!");
          this.users = resp.data.data;
        }else {
          alert(resp.data.msg);
        }
      })
    },
    getUserById(){
      this.getRequest(`/user/${this.queryId}`).then(resp => {
        console.log(resp);
        if (resp.data.code == 200){
          if (this.userInfo.length == 0){
            this.userInfo.push(resp.data.data);
          }else {
            this.userInfo.length =0;
            this.userInfo.push(resp.data.data);
          }
        }else {
          alert(resp.data.msg);
        }
      })
    },
    addUser(){
      this.postRequest("/user", {
        username: this.addUserParams.username,
        address: this.addUserParams.address
      }).then(resp => {
        if (resp.data.code == 200){
          console.log(resp);
          this.$message.success("添加成功!")
        }else {
          this.$message.error("添加失败!")
        }
      })
    },
    updateUser(){
      this.putRequest("/user", {
        id: this.updateUserParams.id,
        username: this.updateUserParams.username,
        address: this.updateUserParams.address
      }).then(resp => {
        if (resp.data.code == 200){
          console.log(resp);
          this.$message.success("更新成功!");
        }else {
          this.$message.error("更新失败!");
        }
      })
    },deleteUserById(){
      this.deleteRequest("/user", {
        id: this.deleteId
      }).then(resp => {
        if (resp.data.code == 200){
          this.$message.success("删除成功!")
        }else {
          this.$message.error("删除失败!");
        }
      })
    }
  }
}
</script>
<style scoped>
.app-main-wrap {
  height: 100%;
  .title-wrap {
    height: 80px;
    line-height: 80px; /* 行高 */
    font-size: 20px; /* 字体大小 */
    font-weight: bold; /* 字体加粗 */
    .title {
      margin: 0; /* 外边距 */
      padding-left: 25px; /* 内边距左侧 */
    }
    .logo {
      position: relative; /* 相对位置 */
      top: -3px; /* 元素的上边界离开其正常位置的偏移 */
      margin-right: 5px; /* 外边距右侧 */
      width: 40px; /* 宽度 */
      vertical-align: middle; /* 行内元素垂直居中对齐 */
    }
  }
}
</style>

<template>
  <div>
    <el-container class="app-main-wrap">
      <el-header>
        <div class="title-wrap">
          <h1 class="title">
            <img src="@/assets/user1.png" class="logo" />
            用户管理页面
          </h1>
        </div>
      </el-header>
      <el-main >
        <el-tabs>
          <el-tab-pane label="所有用户信息" name="first">
            <el-button type="primary" v-on:click="getAllUsers">刷新
            </el-button>
            <el-table
                :data="users"
                style="width: 100%">
              <el-table-column
                  prop="id"
                  label="ID"
                  width="180">
              </el-table-column>
              <el-table-column
                  prop="username"
                  label="姓名"
                  width="180">
              </el-table-column><el-table-column
                prop="address"
                label="地址">
            </el-table-column>
            </el-table>
          </el-tab-pane>
          <el-tab-pane label="查询指定用户" name="second">
            <el-form label-width="80px">
              <el-form-item label="用户ID">
                <el-input v-model="queryId"
                          style="width:200px;"></el-input>
              </el-form-item>
              <el-form-item>
                <el-button type="primary" von:click="getUserById">查询</el-button>
              </el-form-item>
            </el-form>
            <el-table
                :data="userInfo"
                style="width: 100%">
              <el-table-column
                  prop="id"
                  label="ID"
                  width="180">
              </el-table-column>
              <el-table-column
                  prop="username"
                  label="姓名"
                  width="180">
              </el-table-column>
              <el-table-column
                  prop="address"
                  label="地址">
              </el-table-column>
            </el-table>
          </el-tab-pane>
          <el-tab-pane label="添加用户" name="third">
            <el-form label-width="80px">
              <el-form-item label="用户名">
                <el-input v-model="addUserParams.username"
                          style="width:200px;"></el-input>
              </el-form-item>
              <el-form-item label="地址">
                <el-input v-model="addUserParams.address"
                          style="width:200px;"></el-input>
              </el-form-item>
              <el-form-item>
                <el-button type="primary" v-on:click="addUser">添
                  加</el-button>
              </el-form-item>
            </el-form>
          </el-tab-pane>
          <el-tab-pane label="更新用户" name="fourth">
            <el-form label-width="80px">
              <el-form-item label="ID"><el-input v-model="updateUserParams.id"
                                                 style="width:200px;"></el-input>
              </el-form-item>
              <el-form-item label="用户名">
                <el-input v-model="updateUserParams.username"
                          style="width:200px;"></el-input>
              </el-form-item>
              <el-form-item label="地址">
                <el-input v-model="updateUserParams.address"
                          style="width:200px;"></el-input>
              </el-form-item>
              <el-form-item>
                <el-button type="primary" von:click="updateUser">更新</el-button>
              </el-form-item>
            </el-form>
          </el-tab-pane>
          <el-tab-pane label="删除用户" name="five">
            <el-form label-width="80px">
              <el-form-item label="用户ID">
                <el-input v-model="deleteId"
                          style="width:200px;"></el-input>
              </el-form-item>
              <el-form-item>
                <el-button type="primary" von:click="deleteUserById">删除</el-button>
              </el-form-item>
            </el-form>
          </el-tab-pane>
        </el-tabs>
      </el-main>
    </el-container>
  </div>
</template>

<style scoped>

</style>