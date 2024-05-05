import Vue from 'vue'
import App from './App.vue'
import router from "@/components/router";
import {deleteRequest, getRequest, postRequest, putRequest} from "@/utils/api";
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';



Vue.config.productionTip = false
Vue.prototype.getRequest = getRequest;
Vue.prototype.postRequest = postRequest;
Vue.prototype.putRequest = putRequest;
Vue.prototype.deleteRequest = deleteRequest;
Vue.use(ElementUI);


new Vue({
  render: h => h(App),
  router,
}).$mount('#app')
