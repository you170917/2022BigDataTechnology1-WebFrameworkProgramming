<template>
  <div>
  <!-- Your content here -->
  </div>
</template>

<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "User",
  data() {
    return {
      users: [],         // 存储所有用户数据
      userById: null,    // 存储根据ID获取的用户数据
      username: '',     // 新用户或更新用户的用户名
      address: '',      // 新用户或更新用户的地址
      id: '',           // 要更新或删除的用户ID
      queryId: ''       // 用于获取特定用户数据的ID
    };
  },
  methods: {
    async getAllUsers() {
      try {
        const response = await this.getRequest("/AllUsers");
        console.log(response);
        this.users = response.data;
      } catch (error) {
        console.error("Failed to get all users: ", error);
      }
    },
    async getUserById() {
      try {
        const response = await this.getRequest(`/user/${this.queryId}`);
        console.log(response);
        this.userById = response.data;
      } catch (error) {
        console.error("Failed to get user by ID: ", error);
      }
    },
    async addUser() {
      try {
        const response = await this.postRequest("/user", {
          username: this.username,
          address: this.address
        });
        console.log(response);
        // 可能需要在这里清空表单或进行其他操作
      } catch (error) {
        console.error("Failed to add user: ", error);
      }
    },
    async updateUser() {
      try {
        const response = await this.putRequest("/user", {
          id: this.id,
          username: this.username,
          address: this.address
        });
        console.log(response);
        // 可能需要在这里提示用户更新成功或清空表单
      } catch (error) {
        console.error("Failed to update user: ", error);
      }
    },
    async deleteUser() {
      try {
        const response = await this.deleteRequest("/user", {
          id: this.id
        });
        console.log(response);
        // 可能需要在这里更新用户列表或进行其他操作
      } catch (error) {
        console.error("Failed to delete user: ", error);
      }
    },
    // 这里可以添加 getRequest, postRequest, putRequest, deleteRequest 的定义或导入
  },
  // 组件的其他部分...
};
</script>

<style scoped>
/* 在这里添加你的CSS样式 */
</style>
