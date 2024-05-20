import Vue from 'vue'
import App from './App.vue'
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import {deleteRequest, getRequest, postKeyValueRequest, postRequest, putRequest} from "@/utils/api";
import router from "@/router";
Vue.use(ElementUI);
Vue.prototype.getRequest = getRequest;
Vue.prototype.postRequest = postRequest;
Vue.prototype.putRequest = putRequest;
Vue.prototype.deleteRequest = deleteRequest;
Vue.config.productionTip = false
Vue.prototype.postKeyValueRequest = postKeyValueRequest;

new Vue({
  render: h => h(App),
  router,
}).$mount('#app')
