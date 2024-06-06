import Vue from 'vue'
import App from './App.vue'
import router from "@/router";
import {deleteRequest, getRequest, postRequest, putRequest} from "@/utils/api";
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import {postKeyValueRequest} from "@/utils/api";
import axios from "axios";
Vue.use(ElementUI);
// 通过 Vue.prototype 注册全局变量,通过 this.getRequest 就可以调用该方法
Vue.prototype.postKeyValueRequest = postKeyValueRequest;
Vue.prototype.getRequest = getRequest;
Vue.prototype.postRequest = postRequest;
Vue.prototype.putRequest = putRequest;
Vue.prototype.deleteRequest = deleteRequest;

Vue.config.productionTip = false
axios.defaults.withCredentials = true;
new Vue({
  render: h => h(App),
  router
}).$mount('#app')
