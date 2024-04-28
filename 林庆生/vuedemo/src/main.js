import Vue from 'vue'
import App from './App.vue'
import router from "@/router";
Vue.config.productionTip = false
import ElementUI from"element-ui";
import {deleteRequest, getRequest, postRequest, putRequest} from "@/utils/api";
import "element-ui/lib/theme-chalk/index.css"
Vue.use(ElementUI);
Vue.prototype.getRequest = getRequest;
Vue.prototype.postRequest = postRequest;
Vue.prototype.putRequest = putRequest;
Vue.prototype.deleteRequest = deleteRequest;
new Vue({
  render: h => h(App),
  router,
}).$mount('#app')
