import Vue from 'vue'
import App from './App.vue'
import router from "@/router";
// import {getRequest} from "@/utils/api";


import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';

Vue.use(ElementUI);

Vue.config.productionTip = false

import {deleteRequest,getRequest,postRequest,putRequest} from "@/utils/api";
// import {VERSION} from "axios";
Vue.prototype.getRequest = getRequest;
Vue.prototype.postRequest = postRequest;
Vue.prototype.putRequest = putRequest;
Vue.prototype.deleteRequest = deleteRequest;
Vue.use(ElementUI);



new Vue({
  render: h => h(App),
  router
}).$mount('#app')
