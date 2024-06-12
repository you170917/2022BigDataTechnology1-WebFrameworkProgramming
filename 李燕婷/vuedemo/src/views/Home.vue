<template>
  <div>
   这是 home 页面
  <p></p>
  <router-link to="/user">点击我进入用户管理页面</router-link>
  <p></p>
  <router-link to="/myUser">点击我进入新版用户管理页面</router-link>

    <p></p>
    <div>
      <el-upload
          drag
          :with-credentials="true"
          action="http://localhost:8081/file/upload"
          multiple>
        <i class="el-icon-upload"></i>
        <div class="el-upload__text">将文件拖到此处，或<em>点击上传</em>
        </div>
      </el-upload>
      <a href="http://localhost:8081/file/download?fileName=1.jpg">下载文件示例</a>
    </div>
  </div>
</template>
<script>
export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: 'Home'
}
</script>
<style scoped>
</style>
