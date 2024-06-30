import './assets/main.css'

import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import vue from "@vitejs/plugin-vue";
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import {deleteRequest, getRequest, postKeyValueRequest, postRequest, putRequest} from "@/utils/api.js";

vue.prototype.getRequest = getRequest;
vue.prototype.postRequest = postRequest;
vue.prototype.putRequest = putRequest;
vue.prototype.deleteRequest = deleteRequest;
vue.prototype.postKeyValueRequest = postKeyValueRequest;

const app = createApp(App)
app.use(ElementPlus)
app.use(router)

app.mount('#app')
