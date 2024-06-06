import Vue from 'vue'
import App from './App.vue'
import router from "@/router";

Vue.config.productionTip = false

let vue = new Vue({
  render: h => h(App),
  router,
})
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
Vue.use(ElementUI)
vue.$mount('#app')
import {deleteRequest, getRequest, postKeyValueRequest, postRequest, putRequest} from "@/utils/api";
// 通过 Vue.prototype 注册全局变量,通过 this.getRequest 就可以调用该方法
Vue.prototype.getRequest = getRequest;
Vue.prototype.postRequest = postRequest;
Vue.prototype.putRequest = putRequest;
Vue.prototype.deleteRequest = deleteRequest;
Vue.prototype.postKeyValueRequest = postKeyValueRequest;

