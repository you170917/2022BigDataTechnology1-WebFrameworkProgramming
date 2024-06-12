

<template>
  <div>
    这是home页面
    <p></p>
    <router-link to="/user">点我进入用户管理页面</router-link>
    <p></p>
    <router-link to="/myUser">点我进入船新版用户管理页面</router-link>
    <div>
  <p></p>
  <el-upload drag :with-credentials="true" action="http://localhost:8082/file/upload" multiple>
    <i class="el-icon-upload"></i>
      <div class="el-upload__text">将文件拖到此处，或<em>点击上传</em>
      </div>
  </el-upload>
    </div>
  </div>

</template>
<script>
export default {
  name : "Home"
}
</script>

<style scoped>

</style>