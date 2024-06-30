import './assets/main.css'

import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import vue from "@vitejs/plugin-vue";
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import {deleteRequest, getRequest, postRequest, putRequest} from "@/utils/api.js";

const app = createApp(App)
vue.prototype.getRequest = getRequest;
vue.prototype.postRequest = postRequest;
vue.prototype.putRequest = putRequest;
vue.prototype.deleteRequest = deleteRequest;
app.use(router)
app.use(ElementPlus)
app.mount('#app')
